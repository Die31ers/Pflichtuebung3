package hsma.uib.ss14.tpe08.p3;

/**
 * Interface um zu Suchen und den letzen Pfad der Suche zu implementieren.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Dynamischer Typ
 */
public interface SearchStrategy<T> {
	/**
	 * Methode welche über einen Graphen sucht.
	 * 
	 * @param startknoten
	 *            Startknoten des Graphen
	 * @param wert
	 *            Wert welcher gesucht werden soll
	 * @return Eine Liste der Ergebnisse
	 */
	public NodeList<Node<T>> search(Node<T> startknoten, T wert);

	/**
	 * Methode, welche den Pfad der letzten Suche zurückgibt.
	 * 
	 * @return Liste der genommenen Knoten.
	 */
	public NodeListImpl<Node<T>> getPath();

}
