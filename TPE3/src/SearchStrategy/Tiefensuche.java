package SearchStrategy;


import Node.*;
import Graph_List_ListImpl.Graph;

public class Tiefensuche<T> implements SearchStrategy<T> {
	private NodeListImpl<T> path = new NodeListImpl<T>();
	private NodeListImpl<T> found = new NodeListImpl<T>();

	public Tiefensuche() {
		this.path = new NodeListImpl<T>();
	}


	@Override
	 public NodeListImpl<T> search(Node<T> aktuellerKnoten, Node<T> search) {
	  this.found = new NodeListImpl<T>();
	  this.path.clear();

	  return helpSearch(aktuellerKnoten, search);

	 }


	 private NodeListImpl<T> helpSearch(Node<T> wurzelKnoten, Node<T> search) {

	  if (wurzelKnoten.getValue().equals(search.getValue())) {
	   this.path.add(wurzelKnoten);
	   found.add(wurzelKnoten);
	  } else {
	   this.path.add(wurzelKnoten);
	   for (Node<T> besuchterKnoten : wurzelKnoten.getChildren()) {
	    if (!this.path.contains(besuchterKnoten)) {
	     tiefensucheRekursiv(besuchterKnoten, search);
	    }
	   }
	  }
	  return found;
	 }

	 
	 private void tiefensucheRekursiv(Node<T> aktuellerKnoten, Node<T> search) {
	  this.path.add(aktuellerKnoten);
	  for (Node<T> besuchterKnoten : aktuellerKnoten.getChildren()) {
	   if (besuchterKnoten.getValue().equals(search.getValue())) {
	    this.found.add(besuchterKnoten);
	   }
	   if (!this.path.contains(besuchterKnoten)) {
	    tiefensucheRekursiv(besuchterKnoten, search);
	   }
	  }
	 }

	@Override
	public NodeListImpl<T> getPath() {
		return this.path;
	}

}
