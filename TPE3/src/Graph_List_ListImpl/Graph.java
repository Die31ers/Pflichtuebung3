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
public class Graph<T> implements Searchs{
	Node<T> parent;  //jeder Knoten muss ja seine "children / Kinder" kennen
	NodeListImpl<Node<T>> knoten = new NodeListImpl<Node<T>>();

	public Graph(Node<T> parent){
		this.parent = parent;
	}
	
	public Node<T> getParent(){
		return this.parent;
	}
	/**
	 * Die Methode <code>copyInto()</code> kopiert die vorhandene generische 
	 * Liste in eine andere generische Liste.
	 * @return
	 */
	public NodeListImpl<?> copyInto() {
		NodeListImpl<?>copyList = new NodeListImpl();
		copyList.add(parent);
		  for(Node<T>node : this.knoten){
		  copyList.add(node);

		  }
		  return copyList;
		
	}
	

	@Override
	public void breadthFirst() {
		/*
		 * proc breathFirst(v) 
		 * Erzeuge Wareschlange q und füge v in q ein;
		 * Markiere v als besucht; 
		 * while (q nicht leer ist){ 
		 * entnehme vorderstes Element aus q und weise es w zu; 
		 * verarbeite w;
		 *  for jeden nachfolger wi von w 
		 *  if wi noch nicht besucht then 
		 *  füge wi in q ein; markiere wi
		 * als besucht
		 */
		
	}

	@Override
	public void tiefenSuche() {
		/*
		 * proc depthFirst(v) 
		 * if v nch nicht besucht then
		 * markiere v als besucht;
		 * verarbeite Knoten v; 
		 * for jeden nachfolger vi von v 
		 * depthFirst (vi)
		 * }....
		 */
	
		
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
