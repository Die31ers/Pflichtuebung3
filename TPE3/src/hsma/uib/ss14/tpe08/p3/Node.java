package hsma.uib.ss14.tpe08.p3;


/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */


public class Node<T> {

	/**
	 * Jeder Knoten hat einen Namen und einen Wert. Dazu k�nnen sie auch einen
	 * KindKnoten besitzen.
	 */
	public String name;
	public T wert;
	public NodeList<Node> kindknoten;

	/**
	 * Konstruktor von Node.
	 * 
	 * @param name
	 *            des Knotens.
	 * @param wert
	 *            des Knotens.
	 */
	public Node(String name, T wert) {

		this.name = name;
		this.wert = wert;
		this.kindknoten = new NodeListImplementierung();
	}

	/**
	 * F�gt einen oder mehrere Kindknoten hinzu.
	 * 
	 * @param ts
	 */
	public void addChild(Node<T>... ts) {
		for (Node<T> wert : ts) {
			kindknoten.add(wert);
		}
	}

	/**
	 * Liefert den Kindknoten ohne es zu l�schen.
	 * 
	 * @return den Kindknoten
	 */
	public NodeList getChildren() {
		return kindknoten;
	}

	/**
	 * Liefert den Namen des Knotens, ohne es zu l�schen.
	 * 
	 * @return name des Knotens.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Liefert den Wert des Knotens, ohne es zu l�schen.
	 * 
	 * @return den Wert des Knotens.
	 */
	public T getValue() {
		return wert;
	}

	/**
	 * Liefert den Namen des Knotens als String zur�ck.
	 * 
	 * @return den Namen des Knoten.
	 */
	public String toString() {
		return name;
	}
}
