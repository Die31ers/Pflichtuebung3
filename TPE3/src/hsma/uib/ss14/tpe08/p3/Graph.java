package hsma.uib.ss14.tpe08.p3;


/**
 * 
 * Die Klasse eines Graphen. jeder Graph besteht aus einem
 * Anfangsknoten(firstNode) von welchem sich alle anderen Knoten ableiten
 * lassen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            ein beliebiger Datentyp
 */
public class Graph<T> {

	private Node<T> wurzelKnoten;

	/**
	 * Konstruktor eines Graphen
	 * 
	 * @param wurzelKnoten
	 *            der Knoten mit welchem der Graph beginnen soll.
	 */
	public Graph(Node<T> wurzelKnoten) {
		this.wurzelKnoten = wurzelKnoten;
	}

	/**
	 * @param gesucht
	 *            der Knoten der gesucht werden soll.
	 * @param strategy
	 *            die gewaehlte Suchstrategie
	 * @return Eine Liste der uebereinstimmenden Knoten
	 */
	public NodeListImpl<T> search(T gesucht, SearchStrategy<T> strategy) {
		return strategy.search(wurzelKnoten, gesucht);
	}

	/**
	 * Kopiert alle Knoten des Graphen in eine neue Liste
	 * 
	 * @param list
	 *            Die Liste in welche die Knoten kopiert werden.
	 * @return die neue gefuellte Liste
	 */
	public NodeListImpl<T> copyInto(NodeListImpl<T> list) {
		return copyIntoRek(this.wurzelKnoten, list);
	}

	/**
	 * Eigentliche Rekursive Methode. In dieser Methode wird nochmal mit der
	 * Tiefensuche durch den Graphen gegangen um die einzelnen Knoten in einer
	 * separaten Liste zu speichern.
	 * 
	 * @param start
	 *            Der Anfangspunkt
	 * @param list
	 *            Die Liste in welche kopiert wird
	 * @return eine neue Liste
	 */
	private NodeListImpl<T> copyIntoRek(Node<T> start, NodeListImpl<T> list) {
		if (start != null) {
			if (!list.contains(start)) {
				list.add(start);
				for (Node<T> it : start.getChildren()) {
					copyIntoRek(it, list);
				}
			}
		}
		return list;
	}

	/**
	 * @return liefert den Anfangsknoten
	 */
	public Node<T> getFirstNode() {
		return this.wurzelKnoten;
	}
}
