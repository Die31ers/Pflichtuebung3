package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;
import hsma.uib.ss14.tpe08.p3.suche.SearchHelper;

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
public class Breitensuche<T> extends SearchHelper<T>  implements SearchStrategy<T> {
    /**
     * Implementierung der Breitensuche (Levelorder).
     *
     * @param start Startknoten des Graphen
     * @param ziel Der gesuchte Wert
     * @return Eine dynamische Liste der Vorkommen
     */
	@Override
	public NodeListImpl<Node<T>> search(Node<T> start, T ziel) {
		Node<T> tempNode;
		Queue<Node<T>> q = new NodeListImpl<Node<T>>();
		NodeListImpl<Node<T>> ergebnis = new NodeListImpl<Node<T>>();

		this.getPath().clear();
		this.getPath().add(start);

		if (ziel.equals(start.getValue())) {
			ergebnis.add(start);
		} else {
			q.add(start);
			 //Solange noch Elemente in der Liste sind
			while (!q.isEmpty()) {
				tempNode = q.poll();
				for (Node<T> besuchterKnoten : tempNode.getChildren()) {
					if (ziel.equals(besuchterKnoten.getValue())) {
						ergebnis.add(besuchterKnoten); 
					}
					if (!this.getPath().contains(besuchterKnoten)) {
						q.add(besuchterKnoten);
						this.getPath().add(besuchterKnoten);
					}
				}
			}
		}
		return ergebnis;
	}


}
