package hsma.uib.ss14.tpe08.p3;


/**
 * Klasse Graph
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class Graph<T>{
	
	/**
	 * Jeder Graph kann eine Wurzel und min. einen Knoten haben. 
	 */
	public Node<T> wurzel;
	public NodeList<T> knoten;

	
	/**
	 * Konstruktor von Graph.
	 * 
	 * @param wurzel des Graphen.
	 */
	public Graph(Node<T> wurzel) {
		this.wurzel = wurzel;

		this.knoten = new NodeListImpl<T>();
		knoten.add(wurzel);
	}

	/**
	 * Kopiert alle Knoten des Graphen in eine neue Liste
	 * 
	 * @param list
	 *            Die Liste in welche die Knoten kopiert werden.
	 * @return die neue gefuellte Liste
	 */
	public NodeListImpl<T> copyInto(NodeListImpl<T> list) {
		return copyIntoRek(this.wurzel, list);
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
	 * Sucht nach einem bestimmten knoten.
	 * 
	 * @param suchStrategie
	 * @param ziel
	 * 
	 * @return den gesuchten Knoten.
	 */
	public NodeList<T> search(Node<T> ziel, SearchStrategy<T> suchStrategie) {
		NodeList<T> gesuchterKnoten = suchStrategie.search(wurzel, ziel);
		return gesuchterKnoten;

	}




}
