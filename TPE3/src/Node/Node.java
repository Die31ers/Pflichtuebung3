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
	private T value;
	private NodeListImpl<T> children = new NodeListImpl<T>();
	
	/**
	 * Konstruktor
	 * @param name
	 * @param value
	 */
	public Node(String name, T value){		
		this.children = new NodeListImpl<T>();
		this.name = name;
		this.value = value;
	}
	/**
	 * Diese Methode tut ein Knoten hinzufuegen
	 * @param child
	 */
	public void addChild(Node<T> child) {
		((List<Node<T>>) this.children).add(child);
	}
	/**
	 * Durch diese Methode bekommen wir die Kinderknoten raus
	 * @return
	 */
	public NodeList<T> getChildren() {
		return (NodeList<T>) this.children;
	}

	/**
	 * Diese Methode gibt den Namen zurueck.
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Diese Methode gibt den Wert zurueck.
	 * 
	 * @return
	 */
	public T getValue() {
		return this.value;
	}

	/**
	 * Ausgabe als String
	 */
	public String toString(){
		return name;
	}
}
