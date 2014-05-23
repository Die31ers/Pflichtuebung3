package hsma.uib.ss14.tpe08.p3;

import java.util.Queue;

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
public class Breitensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> pfad = new NodeListImpl<T>();

	/**
	 * 
	 */
	@Override
	public NodeListImpl<T> search(Node<T> start, T ziel) {
		Node<T> tempNode;
		Queue<Node<T>> q = new NodeListImpl<T>();
		NodeListImpl<T> gefunden = new NodeListImpl<T>();

		this.pfad.clear();
		this.pfad.add(start);

		if (ziel.equals(start.getValue())) {
			gefunden.add(start);
		} else {
			q.add(start);
			while (!q.isEmpty()) {
				tempNode = q.remove();
				for (Node<T> it : tempNode.getChildren()) {
					if (ziel.equals(it.getValue())) {
						gefunden.add(it); // muss weg!
					}
					if (!this.pfad.contains(it)) {
						q.add(it);
						this.pfad.add(it);
					}
				}
			}
		}
		return gefunden;
	}

	/**
	 * Implementierte Methode getPath.
	 * 
	 * @return liefert den zuvor gelaufenen Pfad zurueck.
	 */

	@Override
	public NodeListImpl<T> getPath() {
		return this.pfad;

	}
}
