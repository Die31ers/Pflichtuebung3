package hsma.uib.ss14.tpe08.p3;

import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;


/**
 * Klasse Node welche ein Knoten im Graphen darstellen soll. Ein Knoten besteht
 * aus einem Namen und einem beliebigen datentyp. Des weiteren besitzt der
 * Knoten noch eine Liste mit all seinen Kindern und ein boolean visited welches
 * kennzeichnet ob man bei den Suchverfahren den Knoten schon abgelaufen ist.
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
	 * Konstruktor fuer einen Knoten. In diesem wird sofort beim anlegen des
	 * Knoten eine Liste fuer die Anzahl der Kinder angelegt.
	 * 
	 * @param name
	 *            Der Name des Knotens
	 * @param value
	 *            der Wert des Knotens
	 */
	public Node(String name, T value) {
		this.kinderKnoten = new NodeListImpl<T>();
		this.name = name;
		this.wert = value;
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
	 * @return eine Liste aller Kinder des Knotens
	 */
	public NodeListImpl<T> getChildren() {
		return this.kinderKnoten;
	}

	/**
	 * @return der Name des Knotens
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return der Wert des Knotens
	 */
	public T getValue() {
		return this.wert;
	}

	/**
	 * ueberschreibt die vorhandene toString Methode und gibt dadurch einen
	 * leserlichen Wert aus.
	 */
	@Override
	public String toString() {
		return name;
	}

}
