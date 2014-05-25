package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;

/**
 * Interface um zu Suchen und den letzen Pfad der Suche zu implementieren.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datenyp
 */
public interface SearchStrategy<T> {

	/**
	 * Methode welche nach dem uebergebenen Wert sucht.
	 * 
	 * @param start
	 *            Startknoten
	 * 
	 * @param ziel
	 *            den zu suchenden Knoten
	 * 
	 * @return Eine Liste mit den gefundenen Knoten
	 */
	public NodeListImpl<T> search(Node<T> start, T ziel);

	/**
	 * Methode, welche den Pfad der letzten Suche zurückgibt.
	 * 
	 * @return Liste der genommenen Knoten.
	 */
	public NodeListImpl<T> getPath();
}
