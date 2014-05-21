package SearchStrategy;


import Node.*;

public class Tiefensuche<T> implements SearchStrategy<T> {
	private NodeListImpl<T> path = new NodeListImpl<T>();
	private NodeListImpl<T> found = new NodeListImpl<T>();

	public Tiefensuche() {
		this.path = new NodeListImpl<T>();
	}


	@Override
	public NodeListImpl<T> search(Node<T> wurzelKnoten, Node<T> search) {
		this.found = new NodeListImpl<T>();
		this.path.clear();

		if (wurzelKnoten.getValue().equals(search.getValue())) {
			this.path.add(wurzelKnoten);
			found.add(wurzelKnoten);
		} else {
			this.path.add(wurzelKnoten);
			for (Node<T> besuchterKnoten : wurzelKnoten.getChildren()) {
				if (!this.path.contains(besuchterKnoten)) {
					tiefensucheRek(besuchterKnoten, (NodeList<T>) search);
				}
			}
		}
		return found;
	}
	
	private void tiefensucheRek(Node<T> node, NodeList<T> search) {
		this.path.add(node);
		for (Node<T> it : node.getChildren()) {
			if (it.getValue().equals(((Node<T>) search).getValue())) {
				this.path.add(it);
			}
			if (!this.path.contains(it)) {
				tiefensucheRek(it, search);
			}
			}
		}
		/*
	public Node<T> depthFirst(Node<T> aktuellerKnoten,
			NodeList<T> besuchteKnoten) {

		this.path.add(aktuellerKnoten);

		if (!besuchteKnoten.contains(aktuellerKnoten)) {
			besuchteKnoten.add(aktuellerKnoten);
		}

		for (Node<T> kindKnoten : aktuellerKnoten.getChildren()) {
			depthFirst((Node<T>) kindKnoten, besuchteKnoten);
		}
		return aktuellerKnoten;
	}
*/

	@Override
	public NodeListImpl<T> getPath() {
		return this.path;
	}

}
