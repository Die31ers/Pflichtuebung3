package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;

import java.util.Queue;

/**
 * Klasse, welche eine Breitensuche über einen
 * dynamischen Typ T implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Breitensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> pfad = new NodeListImpl<T>();

    /**
     * Implementierung der Breitensuche (Levelorder).
     *
     * @param start Startknoten des Graphen
     * @param ziel Der gesuchte Wert
     * @return Eine dynamische Liste der Vorkommen
     */
	@Override
	public NodeListImpl<T> search(Node<T> start, T ziel) {
		Node<T> tempNode;
		Queue<Node<T>> q = new NodeListImpl<T>();
		NodeListImpl<T> ergebnis = new NodeListImpl<T>();

		this.pfad.clear();
		this.pfad.add(start);

		if (ziel.equals(start.getValue())) {
			ergebnis.add(start);
		} else {
			q.add(start);
			 //Solange noch Elemente in der Liste sind
			while (!q.isEmpty()) {
				tempNode = q.poll();
				for (Node<T> it : tempNode.getChildren()) {
					if (ziel.equals(it.getValue())) {
						ergebnis.add(it); 
					}
					if (!this.pfad.contains(it)) {
						q.add(it);
						this.pfad.add(it);
					}
				}
			}
		}
		return ergebnis;
	}

	/**
	 * Überschriebene Methode getPath.
	 * 
	 * @return liefert den zuvor gelaufenen Pfad zurueck.
	 */
	@Override
	public NodeListImpl<T> getPath() {
		return this.pfad;

	}
}
