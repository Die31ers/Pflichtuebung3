package SearchStrategy;

import Node.*;

import Graph_List_ListImpl.Graph;

/**
 * Klasse um die Tiefensuche zu verwirklichen. Diese Klasse implementiert das
 * Interface SearchStrategy und somit auch dessen beide Methoden search und
 * getPath. Zusaetzlich besitzt diese methode noch eine Liste um den gelaufenen
 * Pfad zu speichern.
 * 
 * @author Johannes Weber
 * @author Amanpreet Singh Chahota
 * @author Yannick Appolain Fowa
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Tiefensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> path = new NodeListImpl<T>();
	private NodeListImpl<T> found;

	@Override
	public NodeListImpl<T> search(Node<T> wurzelKnoten, Node<T> search) {
		this.found = new NodeListImpl<T>();
		this.path.clear();

		return helpSearch(wurzelKnoten, search);

	}

	/**
	 * Hilfsklasse für die Methode
	 * <code>search(Node< T > firstNode, Node< T > search)</code>
	 * 
	 * @param wurzelKnoten
	 * @param search
	 * @return
	 */
	private NodeListImpl<T> helpSearch(Node<T> wurzelKnoten, Node<T> search) {

		if (wurzelKnoten.getValue().equals(search.getValue())) {
			this.path.add(wurzelKnoten);
			found.add(wurzelKnoten);
		} else {
			this.path.add(wurzelKnoten);
			for (Node<T> besuchterKnoten : wurzelKnoten.getChildren()) {
				if (!this.path.contains(besuchterKnoten)) {
					tiefensucheRekursiv(besuchterKnoten, search);
				}
			}
		}
		return found;
	}

	/**
	 * Hilfsklasse fuer die Tiefensuche. Ruft die eigentliche Rekursion der
	 * Tiefensuche auf.
	 * 
	 * @param aktuellerKnoten
	 *            der zu durchsuchende Knoten
	 * @param search
	 *            der gesuchte Knoten
	 */
	private void tiefensucheRekursiv(Node<T> aktuellerKnoten, Node<T> search) {
		this.path.add(aktuellerKnoten);
		for (Node<T> besuchterKnoten : aktuellerKnoten.getChildren()) {
			if (besuchterKnoten.getValue().equals(search.getValue())) {
				this.found.add(besuchterKnoten);
			}
			if (!this.path.contains(besuchterKnoten)) {
				tiefensucheRekursiv(besuchterKnoten, search);
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
