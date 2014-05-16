package SearchStrategy;

import Node.*;


public class SuchverfahrenTiefensuche<T> implements SearchStrategy {

	

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	//depthFirst();
	}
	
	public void depthFirst(Node<T> aktuellerKnoten , NodeList<T> besuchteKnoten){
		// TODO Aut-generated method stub
		/*
		 * PRINZIP EINES PREORDERDURCHLAUF
		 * 
		 * proc depthFirst(v) 
		 * if v noch nicht besucht then
		 * markiere v als besucht;
		 * verarbeite Knoten v; 
		 * for jeden nachfolger vi von v 
		 * depthFirst (vi)
		 * }...
		 */
		
		if(besuchteKnoten.contains(aktuellerKnoten) ){
			besuchteKnoten.add(aktuellerKnoten);
		}
		
		for(Node<T> kindKnoten : aktuellerKnoten.getChildren() ){
			
			depthFirst(kindKnoten , besuchteKnoten);
		}
		
		
		
	}

	@Override
	public void getPath() {
		// TODO Auto-generated method stub
		
	}
}
