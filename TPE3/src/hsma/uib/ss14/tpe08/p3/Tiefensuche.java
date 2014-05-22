package hsma.uib.ss14.tpe08.p3;


/**
 * Klasse um die Tiefensuche zu verwirklichen. Diese Klasse implementiert das
 * Interface SearchStrategy und somit auch dessen beide Methoden search und
 * getPath. Zusaetzlich besitzt diese methode noch eine Liste um den gelaufenen
 * Pfad zu speichern.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Tiefensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> path = new NodeListImpl<T>();
	private NodeListImpl<T> found; // anstelle von stack?

	@Override
	public NodeListImpl<T> search(Node<T> start, Node<T> ziel) {
		this.found = new NodeListImpl<T>();
		this.path.clear();

		if (start.getValue().equals(ziel.getValue())) {
			this.path.add(start);
			found.add(start);
		} else {
			this.path.add(start);
			for (Node<T> it : start.getChildren()) {
				if (!this.path.contains(it)) {
					searchRek(it, ziel);
				}
			}
		}
		return found;
	}

	/**
	 * Hilfsklasse fuer die Tiefensuche. Ruft die eigentliche Rekursion der
	 * Tiefensuche auf.
	 * 
	 * @param node
	 *            der zu durchsuchende Knoten
	 * @param search
	 *            der gesuchte Knoten
	 */
	private void searchRek(Node<T> node, Node<T> search) {
		this.path.add(node);
		for (Node<T> it : node.getChildren()) {
			if (it.getValue().equals(search.getValue())) {
				this.found.add(it);
			}
			if (!this.path.contains(it)) {
				searchRek(it, search);
			}
		}
	}

	/**
	 * @return liefert den Pfad der letzten Suche zurueck.
	 */
	@Override
	public NodeListImpl<T> getPath() {
		return this.path;
	}
}
