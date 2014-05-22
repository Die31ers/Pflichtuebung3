package hsma.uib.ss14.tpe08.p3;

/**
 * Klasse, welche eine Breitensuche über einen dynamischen Typ T implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Dynamischer Parameter
 * 
 */
public class Breitensuche<T> extends SearchHelper<T> implements
		SearchStrategy<T> {

	/**
	 * Implementierung der Breitensuche (Levelorder).
	 * 
	 * @param root
	 *            Startknoten des Graphen
	 * @param wert
	 *            Der gesuchte Wert
	 * @return Eine dynamische Liste der Vorkommen
	 */
	@Override
	public NodeListImpl<Node<T>> search(Node<T> root, T wert) {
		NodeListImpl<Node<T>> results = new NodeListImpl<Node<T>>();
		NodeListImpl<Node<T>> q = new NodeListImpl<Node<T>>();
		q.addFirst(root);
		Node<T> element;
		this.getPath().clear();
		// Solange noch Elemente in der Liste sind
		while (!q.isEmpty()) {
			element = q.getLast();
			if (element.getValue() == wert) {
				results.add(element);
			}
			q.removeLast();
			this.getPath().add(element);
			for (Node<T> node : element.getChildren()) {
				if (!this.getPath().contains(node)) {
					q.addFirst(node);
				}
			}
		}
		return results;
	}
}