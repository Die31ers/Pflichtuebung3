package hsma.uib.ss14.tpe08.p3;

public class Simulation {
	private final static boolean DEB = true;

	public static void main(String[] args) {
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

			Node<Character> D1 = new Node<Character>("D", 'D');
			Node<Character> K1 = new Node<Character>("K", 'K', D1);
			Node<Character> I1 = new Node<Character>("I", 'I');
			Node<Character> J1 = new Node<Character>("J", 'J', I1);
			Node<Character> H1 = new Node<Character>("H", 'H');
			Node<Character> G1 = new Node<Character>("G", 'G', D1);
			Node<Character> F1 = new Node<Character>("F", 'F', J1, K1);
			Node<Character> E1 = new Node<Character>("E", 'E', H1, I1);
			Node<Character> C1 = new Node<Character>("C", 'C');
			Node<Character> B1 = new Node<Character>("B", 'B', E1, F1, G1);
			Node<Character> A1 = new Node<Character>("A", 'A', B1, C1, D1);

			B1.addChild(A1);
			H1.addChild(B1);

			Graph<Character> characterGraph = new Graph<Character>(A1);

			BreitenSuche<Character> characterBreitensuche = new BreitenSuche<Character>();
			TiefenSuche<Character> characterTiefensuche = new TiefenSuche<Character>();

			if (DEB) {
				System.out.println("\n--- Rekursiver Graph ---");
				System.out.println("Breitensuche:");
				System.out.println("suche(K): "
						+ characterGraph.search('K', characterBreitensuche)
								.toString());
				System.out.println("letzterPfad: "
						+ characterBreitensuche.letztenDurchlauf);

				System.out.println();

				System.out.println("Tiefensuche:");
				System.out.println("suche(K): "
						+ characterGraph.search('K', characterTiefensuche));
				System.out.println("letzterPfad: "
						+ characterTiefensuche.letztenDurchlauf);

			}
		}
	}
}