package hsma.uib.ss14.tpe08.p3;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * Hier wird die Implementierung mit Unit-testas getested. Dar�berhinaus werden
 * die Konten der Graph Breiten- und Tiefensuche in der erwarteten Reihenfolge
 * besucht.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 *         R�ckgabewert: Knoten in der erwartete Reihenfolge
 */
public class GraphTest {
	private boolean DEB = true;

	//
	@Test
	public void testGraphA() {

		Node<Integer> P = new Node<Integer>("P", 15);
		Node<Integer> O = new Node<Integer>("O", 14);
		Node<Integer> N = new Node<Integer>("N", 13);
		Node<Integer> M = new Node<Integer>("M", 12, N);
		Node<Integer> L = new Node<Integer>("L", 11);
		Node<Integer> K = new Node<Integer>("K", 10);
		Node<Integer> J = new Node<Integer>("J", 9);
		Node<Integer> I = new Node<Integer>("I", 8);
		Node<Integer> H = new Node<Integer>("H", 7);
		Node<Integer> G = new Node<Integer>("G", 6);
		Node<Integer> F = new Node<Integer>("F", 5, J, K);
		Node<Integer> E = new Node<Integer>("E", 4, H, I);
		Node<Integer> D = new Node<Integer>("D", 3, O, P);
		Node<Integer> C = new Node<Integer>("C", 2, L, M);
		Node<Integer> B = new Node<Integer>("B", 1, E, F, G);
		Node<Integer> A = new Node<Integer>("A", 0, B, C, D);

		Graph<Integer> integerGraph = new Graph<Integer>(A);

		BreitenSuche<Integer> integerBreitensuche = new BreitenSuche<Integer>();
		TiefenSuche<Integer> integerTiefensuche = new TiefenSuche<Integer>();

		assertEquals("[(G|6)]",
				integerBreitensuche.search(integerGraph.getHead(), 6)
						.toString());
		assertEquals("[(B|1)]",
				integerBreitensuche.search(integerGraph.getHead(), 1)
						.toString());
		assertEquals(
				"[(A|0), (B|1), (C|2), (D|3), (E|4), (F|5), (G|6), (L|11), (M|12), (O|14), (P|15), (H|7), (I|8), (J|9), (K|10), (N|13)]",
				integerBreitensuche.letztenDurchlauf.toString());

		assertEquals("[(I|8)]",
				integerBreitensuche.search(integerGraph.getHead(), 8)
						.toString());

		assertEquals("[(C|2)]",
				integerTiefensuche.search(integerGraph.getHead(), 2).toString());
		assertEquals(
				"[(A|0), (B|1), (E|4), (H|7), (I|8), (F|5), (J|9), (K|10), (G|6), (C|2), (L|11), (M|12), (N|13), (D|3), (O|14), (P|15)]",
				integerTiefensuche.letztenDurchlauf.toString());

		if (DEB) {
			System.out.println("--- Normaler Graph ---");
			System.out.println("Breitensuche:");
			System.out.println("search(8): "
					+ integerGraph.search(8, integerBreitensuche).toString());
			System.out.println("letzterPfad: "
					+ integerBreitensuche.letztenDurchlauf);

			System.out.println();

			System.out.println("Tiefensuche:");
			System.out.println("search(8): "
					+ integerGraph.search(8, integerTiefensuche));
			System.out.println("letzterPfad: "
					+ integerTiefensuche.letztenDurchlauf);
		}
	}

	@Test
	public void testGraphB() {
		Node<Character> D = new Node<Character>("D", 'D');
		Node<Character> K = new Node<Character>("K", 'K', D);
		Node<Character> I = new Node<Character>("I", 'I');
		Node<Character> J = new Node<Character>("J", 'J', I);
		Node<Character> H = new Node<Character>("H", 'H');
		Node<Character> G = new Node<Character>("G", 'G', D);
		Node<Character> F = new Node<Character>("F", 'F', J, K);
		Node<Character> E = new Node<Character>("E", 'E', H, I);
		Node<Character> C = new Node<Character>("C", 'C');
		Node<Character> B = new Node<Character>("B", 'B', E, F, G);
		Node<Character> A = new Node<Character>("A", 'A', B, C, D);

		B.addChild(A);
		H.addChild(B);

		Graph<Character> characterGraph = new Graph<Character>(A);

		BreitenSuche<Character> characterBreitensuche = new BreitenSuche<Character>();
		TiefenSuche<Character> characterTiefensuche = new TiefenSuche<Character>();

		if (DEB) {
			System.out.println("\n--- Rekursiver Graph ---");
			System.out.println("Breitensuche:");
			System.out.println("search(K): "
					+ characterGraph.search('K', characterBreitensuche)
							.toString());
			System.out.println("letzterPfad: "
					+ characterBreitensuche.letztenDurchlauf);

			System.out.println();

			System.out.println("Tiefensuche:");
			System.out.println("search(K): "
					+ characterGraph.search('K', characterTiefensuche));
			System.out.println("letzterPfad: "
					+ characterTiefensuche.letztenDurchlauf);
		}

	}
}
