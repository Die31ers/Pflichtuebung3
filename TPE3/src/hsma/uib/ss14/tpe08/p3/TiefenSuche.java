package hsma.uib.ss14.tpe08.p3;

/**
 * Klasse, die die Knoten der Graph tiefen suchen sollt hier wird die PreOrder
 * benutzt
 * 
 * @author Ketcha
 * 
 * @param <T>
 * 
 *            R�ckgabewert: name und Wert des Knotens in der erwarteten
 *            Reihenfolge
 */

// PreOrder wird hier implementiert
public class TiefenSuche<T> extends SuchHelfer<T> implements SearchStrategy<T> {
	@Override
	public NodeListImpl<Node<T>> search(Node<T> head, T wert) {
		letztenDurchlauf.clear();
		return preOrderRek(head, wert, new NodeListImpl<Node<T>>());
	}

	private NodeListImpl<Node<T>> preOrderRek(Node<T> head, T wert,
			NodeListImpl<Node<T>> ergebnis) {
		letztenDurchlauf.add(head);
		if (head.getValue() == wert) {
			ergebnis.add(head);
		}
		for (Node<T> node : head.getChildren()) {
			if (!letztenDurchlauf.contains(node)) {
				preOrderRek(node, wert, ergebnis);
			}
		}
		return ergebnis;
	}

	@Override
	public NodeListImpl<Node<T>> getPath() {
		return letztenDurchlauf;
	}
}
