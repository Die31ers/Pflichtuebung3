package SearchStrategy;

import Node.*;
import Graph_List_ListImpl.Graph;
import Graph_List_ListImpl.List;
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
public class Tiefensuche123<T> implements SearchStrategy<T> {

	private NodeListImpl<T> path = new NodeListImpl<T>();
	private NodeListImpl<T> found;

	@Override
	public NodeListImpl<T> search(Node<T> firstNode, Node<T> search) {
		this.found = new NodeListImpl<T>();
		((List<Node<T>>) this.path).clear();

		if (firstNode.getValue().equals(search.getValue())) {
			((List<Node<T>>) this.path).add(firstNode);
			((List<Node<T>>) found).add(firstNode);
		} else {
			((List<Node<T>>) this.path).add(firstNode);
			for (Node<T> it : firstNode.getChildren()) {
				if (!((List<Node<T>>) this.path).contains(it)) {
					searchRek(it, search);
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
		((List<Node<T>>) this.path).add(node);
		for (Node<T> it : node.getChildren()) {
			if (it.getValue().equals(search.getValue())) {
				((List<Node<T>>) this.found).add(it);
			}
			if (!((List<Node<T>>) this.path).contains(it)) {
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
