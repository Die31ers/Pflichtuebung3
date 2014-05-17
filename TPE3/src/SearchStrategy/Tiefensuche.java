package SearchStrategy;

import Node.*;

public class Tiefensuche<T> implements SearchStrategy<T> {
	private NodeListImpl<T> path = new NodeListImpl<T>();

	public Tiefensuche() {
		this.path = new NodeListImpl<T>();
	}
	
	@Override
	public NodeListImpl<T> search(Node<T> wurzelKnoten, Node<T> search) {
		this.path.clear();
		if (wurzelKnoten.getValue().equals(search.getValue())){
			this.path.add(wurzelKnoten);
		}else{
			this.path.add(wurzelKnoten);
			for(Node <T> dieserWurzel : wurzelKnoten.getChildren()){
				if(!this.path.contains(dieserWurzel)){
					deapthFirst(dieserWurzel, search);
				}
			}
		}
		return path;

	}
	
	/**
	 * Hilfsklasse fuer die Tiefensuche. Ruft die eigentliche Rekursion der
	 * Tiefensuche auf.
	 * 
	 * @param node
	 *            der zu durchsuchende Knoten
	 * @param search
	 *            der gesuchte Knoten
	 */
	private void deapthFirst(Node<T> node, Node<T> search) {
		this.path.add(node);
		for (Node<T> it : node.getChildren()) {
			if (it.getValue().equals(search.getValue())) {
				this.path.add(it);
			}
			if (!this.path.contains(it)) {
				deapthFirst(it, search);
			}
		}
	}
	
	
	/*
	 * mit dem prof gemacht , geht aktuellerKnoten.getChildren() nicht
	public Node<T> depthFirst(Node<T> aktuellerKnoten,
			NodeList<T> besuchteKnoten) {	
		
		if (!besuchteKnoten.contains(aktuellerKnoten)) {
			besuchteKnoten.add((T) aktuellerKnoten);
		}

		for (Node<T> kindKnoten : aktuellerKnoten.getChildren()) {

			depthFirst(kindKnoten, besuchteKnoten);
		}
	}

	*/

	@Override
	public NodeListImpl<T> getPath() {
		return this.path;
	}


}
