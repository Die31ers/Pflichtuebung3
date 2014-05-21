package hsma.uib.ss14.tpe08.p3;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */

public class Graph {
	
	

	/**
	 * Jeder Graph kann eine Wurzel und min. einen Knoten haben. 
	 */
	public Node wurzel;
	public NodeList<Node> knoten;

	
	/**
	 * Konstruktor von Graph.
	 * 
	 * @param wurzel des Graphen.
	 */
	public Graph(Node wurzel) {
		this.wurzel = wurzel;

		this.knoten = new NodeListImplementierung();
		knoten.add(wurzel);
	}

	/**
	 * Liefert eine Kopie des Knotens.
	 * 
	 * @param kopie des Knotens.
	 */
	public void copyInto(NodeList<Node> kopie) {
		kopie = knoten;
	}
	
	/**
	 * Sucht nach einem bestimmten knoten.
	 * 
	 * @param suchStrategie
	 * @param ziel
	 * 
	 * @return den gesuchten Knoten.
	 */
	public NodeList search(SearchStrategy suchStrategie, Node ziel) {
		NodeList gesuchterKnoten = suchStrategie.search(wurzel, ziel);
		return gesuchterKnoten;

	}

	/**
	 * Liefert den gesuchten Knoten zur�ck.
	 * 
	 * @param suchStrategie
	 * 
	 * @return den gesuchten Knoten.
	 */
	public NodeList getPath(SearchStrategy suchStrategie) {
		NodeList gesuchterKnoten = suchStrategie.getPath(wurzel);
		return gesuchterKnoten;
	
	
	}
}
