package Node;

import java.util.Iterator;

import Graph_List_ListImpl.*;
import SearchStrategy.SearchStrategy;

/**
 * Die Klasse Node soll eine generische Klasse sein. In dieser Klasse wird das
 * hinzufuegen der Kinderknoten geschehen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */

public class Node<T> {

	// T elem, e;
	// Node<T> next, previous;

	private Node parent;
	private String name;
	private String value;
	private NodeListImpl<Node<T>> knoten = new NodeListImpl<Node<T>>();

	/**
	 * 
	 * @param a
	 */
	public void addChild(Node<T> a) {
		this.knoten.add(a);
	}

	public NodeListImpl<Node<T>> getChildren() {
		return this.knoten;
	}

	/**
	 * Diese Methode gibt den Namen zurueck.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Diese Methode gibt den Wert zurueck.
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (knoten != null ? knoten.hashCode() : 0);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
