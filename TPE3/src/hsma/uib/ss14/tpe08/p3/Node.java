package hsma.uib.ss14.tpe08.p3;

import java.util.Collections;

/**
 * Klasse, welche einen Knoten(z.B. in einen Graphen) implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Dynamsicher Typ des Knoten
 * 
 */
public class Node<T> {

	/**
	 * Membervariable Name des Knoten.
	 */
	private String name;
	/**
	 * Membervariable Wert(dynamisch) des Graphen.
	 */
	private T value;
	/**
	 * Membervariable Liste von Kindern.
	 */
	private NodeListImpl<Node<T>> kinder = new NodeListImpl<Node<T>>();

	/**
	 * Konstruktor des Knoten.
	 * 
	 * @param name
	 *            Name des Knoten
	 * @param value
	 *            Dynamischer Wert des Knoten
	 * @param kinder
	 *            Kinder des Knoten
	 */
	public Node(String name, T value, Node<T>... kinder) {
		this.name = name;
		this.value = value;
		Collections.addAll(this.kinder, kinder);
	}

	/**
	 * Methode um ein Kind hinzuzufügen
	 * 
	 * @param kind
	 *            Kind, welches hinzhugefügt werden soll
	 */
	public void addChild(Node<T> kind) {
		this.kinder.add(kind);
	}

	/**
	 * Methode um den Namen des Knoten zu bekommen.
	 * 
	 * @return Den Namen des Knoten
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Methode, um den dynamischen Wert des Knoten zu bekommen.
	 * 
	 * @return Den dynamischen Wert des Knoten
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Methode, welche die Kinder eines Knoten zurückliefet.
	 * 
	 * @return Die Kinder eines Knoten
	 */
	public NodeListImpl<Node<T>> getChildren() {
		return kinder;
	}

	/**
	 * Methode, um die Ausgabe eines Knoten deutlicher zu machen.
	 * 
	 * @return Einen String(Knotenausgabe)
	 */
	@Override
	public String toString() {
		return "(" + name + "|" + value + ")";
	}
}
