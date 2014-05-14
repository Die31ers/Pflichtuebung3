package hsma.uib.ss14.tpe08.p3;

/**
 * Methode, die die Konoten der Graph in der erwartete Reihenfolge besucht Die
 * Knoten werden breitengesuchnt :levelorder
 * 
 * @author Ketcha
 * 
 * @param <T>
 * 
 *            R�ckgbabewert: die Knoten in der erwartete Reihenfolge
 */
// LevelOrder wird hier implementiert
public class BreitenSuche<T> extends SuchHelfer<T> implements SearchStrategy<T> {

	@Override
	public NodeListImpl<Node<T>> search(Node<T> head, T wert) {
		NodeListImpl<Node<T>> ergebnis = new NodeListImpl<Node<T>>();
		NodeListImpl<Node<T>> N = new NodeListImpl<Node<T>>();
		N.addFirst(head);
		Node<T> elem;
		letztenDurchlauf.clear();
		// Solange noch Elemente in der Liste drin sind
		while (!N.isEmpty()) {
			elem = N.getLast();
			if (elem.getValue() == wert) {
				ergebnis.add(elem);
			}
			// Elemente der ist wegl�schen
			N.removeLast();
			letztenDurchlauf.add(elem);
			// Elemente der List durchlaufen und rausgeben
			for (Node<T> node : elem.getChildren()) {
				if (!letztenDurchlauf.contains(node)) {
					N.addFirst(node);
				}
			}
		}
		return ergebnis;
	}

	@Override
	public NodeListImpl<Node<T>> getPath() {
		return letztenDurchlauf;
	}
}