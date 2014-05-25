package hsma.uib.ss14.tpe08.p3;

import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;

/**
 * Klasse, welche einen Knoten(z.B. in einen Graphen) implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Node<T> {

	private String name;

	private T wert;

	private NodeListImpl<T> kinderKnoten;

	/**
	 * Konstruktor fuer einen Knoten.
	 * 
	 * @param name
	 *            Der Name des Knotens
	 * @param wert
	 *            der Wert des Knotens
	 */
	public Node(String name, T wert) {
		this.kinderKnoten = new NodeListImpl<T>();
		this.name = name;
		this.wert = wert;
	}

	/**
	 * Fuegt ein Knoten/Kind zu der Liste des Knotens hinzu
	 * 
	 * @param kind
	 *            das Kind das hinzugefuegt werden soll.
	 */
	public void addChild(Node<T> kind) {
		this.kinderKnoten.add(kind);
	}

	/**
	 * Methode um den Namen des Knoten zu bekommen.
	 * 
	 * @return der Name des Knotens
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Methode, um den dynamischen Wert des Knoten zu bekommen.
	 * 
	 * @return der Wert des Knotens
	 */
	public T getValue() {
		return this.wert;
	}

	/**
	 * Methode, welche die Kinder eines Knoten zurückliefet.
	 * 
	 * @return eine Liste aller Kinder des Knotens
	 */
	public NodeListImpl<T> getChildren() {
		return this.kinderKnoten;
	}

	/**
	 * Methode, um die Ausgabe eines Knoten deutlicher zu machen.
	 */
	@Override
	public String toString() {
		return name;
	}

}
