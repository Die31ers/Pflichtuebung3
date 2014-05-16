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
public class Graph<T> implements SearchStrategy{
	Node<T> wurzelKnoten; //jeder wurzelKnoten kennt seine "Kinder"
	NodeListImpl<Node<T>> knoten = new NodeListImpl<Node<T>>();

	
	/**
	 * Die Methode <code>copyInto()</code> kopiert die vorhandene generische 
	 * Liste in eine andere generische Liste.
	 * @return
	 */
	public NodeList<T> copyInto() {
		NodeList<T>copy = new NodeListImpl<T>();
		  for(Node<T>node : this.knoten){
		  copy.add(node);

		  }
		  return copy;
		
	}
	

	

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPath() {
		// TODO Auto-generated method stub
		
	}

}
