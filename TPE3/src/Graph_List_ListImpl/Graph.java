package Graph_List_ListImpl;

import java.util.*;


import SearchStrategy.*;
import Node.*;

/**
 * Klasse Graph
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * @param <T>
 * 
 */
public class Graph<T>{
	private Node<T> wurzelKnoten; //jeder wurzelKnoten kennt seine "Kinder"
	NodeListImpl<T> knoten;

	public Graph (Node<T>wurzelKnoten){
		this.wurzelKnoten = wurzelKnoten;
	}
	
	public NodeListImpl<T> search(Node<T> search, SearchStrategy<T> strategy) {
		return strategy.search(this.wurzelKnoten, search);
	}

	/**
	 * Die Methode <code>copyInto()</code> kopiert die vorhandene generische 
	 * Liste in eine andere generische Liste.
	 * @return
	 */
	public NodeList<T> copyInto() {
		NodeList<T>copy = new NodeListImpl<T>();
		copy.add(this.wurzelKnoten); 
		for(Node<T>node : this.knoten){
		   copy.add(node);

		  }
		  return copy;
		
	}
	

	public Node<T> getWurzelKnoten() {
		return this.wurzelKnoten;
	}


	
}
