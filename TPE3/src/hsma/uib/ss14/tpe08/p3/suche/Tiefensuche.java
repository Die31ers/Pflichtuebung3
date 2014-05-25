package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;

/**
 * Klasse, welche eine Tiefensuche (PreOrder) implementiert.
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
	private NodeListImpl<T> ergebnis;
	
    /**
     * Implementierung der Tiefensuche (PreOrder).
     *
     * @param start Startknoten des Graphen
     * @param ziel Der gesuchte Wert
     * @return Eine dynamische Liste der Vorkommen
     */
	@Override
	public NodeListImpl<T> search(Node<T> start, T ziel) {
		this.ergebnis = new NodeListImpl<T>();
		this.pfad.clear();

		if (start.getValue().equals(ziel)) {
			this.pfad.add(start);
			ergebnis.add(start);
		} else {
			this.pfad.add(start);
			for (Node<T> besuchterKnoten : start.getChildren()) {
				if (!this.pfad.contains(besuchterKnoten)) {
					searchRek(besuchterKnoten, ziel);
				}
			}
		}
		return ergebnis;
	}

	/**
	 * Hilfsmethode fuer die Tiefensuche. Ruft die eigentliche Rekursion der
	 * Tiefensuche auf.
	 * 
	 * @param knoten
	 *            der zu durchsuchende Knoten
	 * @param ziel
	 *            der gesuchte Knoten
	 */
	private void searchRek(Node<T> knoten, T ziel) {
		this.pfad.add(knoten);
		for (Node<T> besuchterKnoten : knoten.getChildren()) {
			if (besuchterKnoten.getValue().equals(ziel)) {
				this.ergebnis.add(besuchterKnoten);
			}
			if (!this.pfad.contains(besuchterKnoten)) {
				searchRek(besuchterKnoten, ziel);
			}
		}
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
