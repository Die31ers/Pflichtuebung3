package hsma.uib.ss14.tpe08.p3;

/**
 * Klasse welche einen generischen Graphen implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Dynamischer Typ des Graphen
 * 
 */
public class Graph<T> {
	/**
	 * Dynamischer Typ-Parameter, welcher den Startknoten des Graphen
	 * implementiert.
	 */
	private Node<T> root;

	/**
	 * Konstruktor des Graphen.
	 * 
	 * @param root
	 *            Den Startknoten des Graphen
	 */
	public Graph(Node<T> root) {
		this.root = root;
	}

	/**
	 * Methode um den Startknoten des Graphen zu bekommen.
	 * 
	 * @return Den Startknoten des Graphen
	 */
	public Node<T> getRoot() {
		return this.root;
	}

	/**
	 * Methode, welche, mittels Funktionsübergabe (Callback) eine Klasse called.
	 * 
	 * @param wert
	 *            Der Wert der gesucht werden soll
	 * @param methode
	 *            Welche Klasse durch den Callback aufgerufen werden soll
	 */
	public NodeList<Node<T>> search(T wert, SearchStrategy<T> methode) {
		return methode.search(root, wert);
	}

	/**
	 * Methode, welche eine Rekursive Methode zum Kopieren des Graphen in eine
	 * Liste aufruft.
	 * 
	 * @return Die Rückgabe(Liste) der rekursiven Methode
	 */
	public NodeListImpl<Node<T>> copyInto() {
		return copyIntoRek(root, new NodeListImpl<Node<T>>());

	}

	/**
	 * Rekursive Methode, welche rekursiv den Grapheninhalt in eine Liste
	 * generischen Typs(Eine Node generischen) Typs kopiert.
	 * 
	 * @param root
	 *            Startknoten des Graphen
	 * @param elements
	 *            Leere Dynamische Liste zum Füllen
	 * @return Eine Liste, welche alle Elemente des Graphen enhällt
	 */
	private NodeListImpl<Node<T>> copyIntoRek(Node<T> root,
			NodeListImpl<Node<T>> elements) {
		for (Node<T> nodes : root.getChildren()) {
			copyIntoRek(nodes, elements);
		}
		elements.add(root);
		return elements;
	}

}
