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
		this.path.clear();

		return null;
	}

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



	/*private void searchRek(Node<T> node, Node<T> search) {
		this.path.add(node);
		for (Node<T> it : node.getChildren()) {
			if (it.getValue().equals(search.getValue())) {
				this.path.add(it);
			}
			if (!this.path.contains(it)) {
				searchRek(it, search);
			}
		}
	}*/
	@Override
	public NodeListImpl<T> getPath() {
		return this.path;
	}

}
