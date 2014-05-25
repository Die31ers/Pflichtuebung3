package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;


/**
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Tiefensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> pfad = new NodeListImpl<T>();
	private NodeListImpl<T> gefunden; 

	@Override
	public NodeListImpl<T> search(Node<T> start, T ziel) {
		this.gefunden = new NodeListImpl<T>();
		this.pfad.clear();

		if (start.getValue().equals(ziel)) {
			this.pfad.add(start);
			gefunden.add(start);
		} else {
			this.pfad.add(start);
			for (Node<T> it : start.getChildren()) {
				if (!this.pfad.contains(it)) {
					searchRek(it, ziel);
				}
			}
		}
		return gefunden;
	}

	/**
	 * Hilfsmethode fuer die Tiefensuche. Ruft die eigentliche Rekursion der
	 * Tiefensuche auf.
	 * 
	 * @param node
	 *            der zu durchsuchende Knoten
	 * @param search
	 *            der gesuchte Knoten
	 */
	private void searchRek(Node<T> node, T search) {
		this.pfad.add(node);
		for (Node<T> it : node.getChildren()) {
			if (it.getValue().equals(search)) {
				this.gefunden.add(it);
			}
			if (!this.pfad.contains(it)) {
				searchRek(it, search);
			}
		}
	}

	/**
	 * @return liefert den Pfad der letzten Suche zurueck.
	 */
	@Override
	public NodeListImpl<T> getPath() {
		return this.pfad;
	}
}
