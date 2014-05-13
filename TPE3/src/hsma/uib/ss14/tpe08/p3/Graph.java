package hsma.uib.ss14.tpe08.p3;

import java.util.ArrayList;
import java.util.Set;

import SearchStrategy.Searchs;

/**
 * Klasse Graph
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * @param <T>
 * 
 */
public class Graph implements Searchs {

	/**
	 * Kopieren aller Knoten in eine übergebene Liste
	 * 
	 * @param Liste
	 * @param A
	 */
	public void copyInto() {

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

}
