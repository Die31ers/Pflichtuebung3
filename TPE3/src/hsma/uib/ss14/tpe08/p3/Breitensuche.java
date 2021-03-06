package hsma.uib.ss14.tpe08.p3;



import java.util.Queue;



/**
 * Klasse Breitensuche
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class Breitensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> path = new NodeListImpl<T>();

	/**
	 * Implemetierte Methode search() welche die eigentliche Breitensuche
	 * verwirklicht und nebenher den gelaufenen Pfad speichert.
	 */
	@Override
	public NodeListImpl<T> search(Node<T> start, Node<T> ziel) {
		Node<T> tempNode;
		Queue<Node<T>> q = new NodeListImpl<T>();
		NodeListImpl<T> found = new NodeListImpl<T>();

		this.path.clear();
		this.path.add(start);

		if (ziel.getValue().equals(start.getValue())) {
			found.add(start);
		} else {
			q.add(start);
			while (!q.isEmpty()) {
				tempNode = q.remove();
				System.out.println(tempNode);
				for (Node<T> it : tempNode.getChildren()) {
					if (ziel.getValue().equals(it.getValue())) {
						found.add(it);
					}
					if (!this.path.contains(it)) {;
						q.add(it);
						this.path.add(it);
					}
				}
			}
		}
		return found;
	}

	/**
	 * Implementierte Methode getPath.
	 * 
	 * @return liefert den zuvor gelaufenen Pfad zurueck.
	 */

	@Override
	public NodeListImpl<T> getPath() {
		return this.path;

	}
}
