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


	private String name;
	private String value;
	private NodeListImpl<T> children = new NodeListImpl<T>();

	public Node(){		
		this.name = name;
		this.value = value;
	}
	/**
	 * 
	 * @param a
	 */
	public void addChild(Node<T> child) {
		this.children.add(child);
	}

	public NodeListImpl<T> getChildren() {
		return this.children;
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
		result = 31 * result + (children != null ? children.hashCode() : 0);
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
