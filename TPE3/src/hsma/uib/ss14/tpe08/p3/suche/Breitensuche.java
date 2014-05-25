package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;
import hsma.uib.ss14.tpe08.p3.suche.SearchHelper;

import java.util.Queue;

/**
 * Klasse, welche eine Breitensuche über einen dynamischen Typ T implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Breitensuche<T> extends SearchHelper<T> implements
		SearchStrategy<T> {

	/**
	 * Implementierung der Breitensuche (Levelorder).
	 * 
	 * @param start
	 *            Startknoten des Graphen
	 * @param ziel
	 *            Der gesuchte Wert
	 * @return Eine dynamische Liste der Vorkommen
	 */
	@Override
	public NodeListImpl<Node<T>> search(Node<T> start, T ziel) {
		NodeListImpl<Node<T>> ergebnisse = new NodeListImpl<Node<T>>();
		Queue<Node<T>> q = new NodeListImpl<Node<T>>();
		q.add(start);
		Node<T> element;
		this.getPath().clear();
		// Solange noch Elemente in der Liste sind
		while (!q.isEmpty()) {
			element = q.poll();
			if (element.getValue() == ziel) {
				ergebnisse.add(element);
			}
			this.getPath().add(element);
			for (Node<T> knoten : element.getChildren()) {
				if (!this.getPath().contains(knoten)) {
					q.add(knoten);
				}
			}
		}
		return ergebnisse;
	}

}
