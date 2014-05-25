package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;


/**
 * Schnittstelle Search Strategy welche die zwei abstrakten Methoden search und
 * getPath fuer die Klassen Breitensuche und Tiefensuche bereitstellt.
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
	 * Abstrakte Methode welche nach dem uebergebenen Knoten sucht.
	 * 
	 * @param search
	 *            den zu suchenden Knoten
	 * @param firstNode
	 *            den Anfangsknoten
	 * @return Eine Liste mit den gefundenen Knoten
	 */
	abstract NodeListImpl<T> search(Node<T> start, T ziel);

	/**
	 * Abstrakte methode welche den Pfad der letzten Suche zurueckgibt.
	 * 
	 * @return NodeListImpl<T> liefert den Pfad der letzen Suche zurueck
	 */
	abstract NodeListImpl<T> getPath();
}
