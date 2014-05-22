package hsma.uib.ss14.tpe08.p3;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Klasse zum Testen des Graphen
 */
public class GraphTest {

    /**
     * Debug Konstante für Output auf System.out
     */
    private final boolean DEBUGOUTPUT = true;

    /**
     * Test-Methode zum Testen eines Graphen
     */
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

        //Integer TestGraph
        Graph<Integer> integerGraph = new Graph<Integer>(A);

        //Initialisierung der Suchverfahren
        Breitensuche<Integer> integerBreitensuche = new Breitensuche<Integer>();
        Tiefensuche<Integer> integerTiefensuche = new Tiefensuche<Integer>();

        //Graphen kopiert in eine Liste
        NodeListImpl<Node<Integer>> liste = integerGraph.copyInto();

        assertEquals("[(K|10)]", (integerGraph.search(10, integerBreitensuche).toString())); //Callback!
        assertEquals("[(A|0), (B|1), (C|2), (D|3), (E|4), (F|5), (G|6), (L|11), (M|12), (O|14), "
                + "(P|15), (H|7), (I|8), (J|9), (K|10), (N|13)]",
                integerBreitensuche.getPath().toString());

        assertEquals("[(K|10)]", integerGraph.search(10, integerTiefensuche).toString()); //Callback!
        assertEquals("[(A|0), (B|1), (E|4), (H|7), (I|8), (F|5), (J|9), (K|10), (G|6), "
                + "(C|2), (L|11), (M|12), (N|13), (D|3), (O|14), (P|15)]",
                integerTiefensuche.getPath().toString());

        assertEquals("[(H|7), (I|8), (E|4), (J|9), (K|10), (F|5), (G|6), (B|1), (L|11), "
                + "(N|13), (M|12), (C|2), (O|14), (P|15), (D|3), (A|0)]", liste.toString());

        //DEBUG AUSGABE
        if (DEBUGOUTPUT) {
            System.out.println("Schöne Liste: " + liste);
            System.out.println("\n--- Normaler Graph ---");
            System.out.println("Breitensuche:");
            System.out.println("search(10): " + integerGraph.search(10, integerBreitensuche));
            System.out.println("letzterPfad: " + integerBreitensuche.getPath());

            System.out.println();

            System.out.println("Tiefensuche:");
            System.out.println("search(10): " + integerGraph.search(10, integerTiefensuche));
            System.out.println("letzterPfad: " + integerTiefensuche.getPath());
        }
    }

    /**
     * Test-Methode zum Testen eines weiteren Graphen
     */
    @Test
    public void testGraphB() {
        Node<Character> B2 = new Node<Character>("B", 'B');
        Node<Character> B3 = new Node<Character>("B", 'B', B2);
        Node<Character> D = new Node<Character>("D", 'D');
        Node<Character> K = new Node<Character>("K", 'K', D);
        Node<Character> I = new Node<Character>("I", 'I');
        Node<Character> J = new Node<Character>("J", 'J', I);
        Node<Character> H = new Node<Character>("H", 'H', B3);
        Node<Character> G = new Node<Character>("G", 'G', D);
        Node<Character> F = new Node<Character>("F", 'F', J, K);
        Node<Character> E = new Node<Character>("E", 'E', H, I);
        Node<Character> C = new Node<Character>("C", 'C');
        Node<Character> B = new Node<Character>("B", 'B', E, F, G);
        Node<Character> A = new Node<Character>("A", 'A', B, C, D);

        //Hinzufügen von Kindern
        B.addChild(A);
        H.addChild(B);

        //Character-Graph
        Graph<Character> characterGraph = new Graph<Character>(A);

        //Initialisierung der Suchverfahren
        Breitensuche<Character> characterBreitensuche = new Breitensuche<Character>();
        Tiefensuche<Character> characterTiefensuche = new Tiefensuche<Character>();


        //DEBUG AUSGABE
        if (DEBUGOUTPUT) {
            System.out.println("\n--- Rekursiver Graph ---");
            System.out.println("Breitensuche:");
            System.out.println("search(K): " + characterGraph.search('K', characterBreitensuche));
            System.out.println("letzterPfad: " + characterBreitensuche.getPath());

            System.out.println();

            System.out.println("Tiefensuche:");
            System.out.println("search(K): " + characterGraph.search('K', characterTiefensuche));
            System.out.println("letzterPfad: " + characterTiefensuche.getPath());

            System.out.println();

            System.out.println("Tiefensuche Doppelter Eintrag:");
            System.out.println("search(B): " + characterGraph.search('B', characterTiefensuche));
            System.out.println("letzterPfad: " + characterTiefensuche.getPath());

        }


    }
}
