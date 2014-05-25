package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;

/**
 * Helferklasse, um die Speicherung des letzten Pfades nicht doppelt anzulegen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Dynamischer Typ des Helferklasse
 */
public abstract class SearchHelper<T> {
	/**
	 * Dynamische Liste zur Speicherung des letzten Pfades.
	 */
	private NodeListImpl<Node<T>> letzterPfad = new NodeListImpl<Node<T>>();

	/**
	 * Methode um den letzten Pfad, welchen die Suche genommen hat auszugeben.
	 * 
	 * @return Die Dynamische Liste
	 */
	public NodeListImpl<Node<T>> getPath() {
		return letzterPfad;
	}

}
