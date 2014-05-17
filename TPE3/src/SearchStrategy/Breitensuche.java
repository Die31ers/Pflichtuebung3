package SearchStrategy;

import Node.Node;
import Node.NodeListImpl;

public class Breitensuche<T> implements SearchStrategy<T> {

	private NodeListImpl<T> path = new NodeListImpl<T>();
	
	@Override
	public NodeListImpl<T> search(Node<T> wurzelKnoten, Node<T> search) {
		breadthFirst();
		return path;
	}

	public void breadthFirst(){
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
	public NodeListImpl<T> getPath() {
		return path;
		// TODO Auto-generated method stub

	}

}
