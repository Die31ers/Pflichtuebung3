package hsma.uib.ss14.tpe08.p3;

/**
 * Tiefensuche sucht in dem Graphen nach einem gew�nschten Knoten.
 * Sie greift immer gleich zum Kindknoten des aktuellen Knoten.
 * Wenn es keine weiteren Kindknoten gibt wird wieder auf eine Ebene h�her zugegriffen und dort wiederholt.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Die Klasse Tiefensuche wird von SearchStrategy implementiert.
 */
public class Tiefensuche<T>  implements SearchStrategy<T> {
	
	/**
	 * Liefert ?????????????????.
	 * 
	 * @param wurzel des Graphen.
	 * @param ziel des Graphen.
	 * 
	 * @return Liste der Knoten
	 */
	@Override
	public NodeList<T> search(Node wurzel, Node ziel){
		NodeList liste = new NodeListImplementierung();
		return liste;
	}

	/**
	 * Liefert die einzelnen Knoten des Graphen zur�ck.
	 * 
	 * @param wurzel.
	 * 
	 * @return endergebnis, die einzelnen Knoten. 
	 */
    @Override
    public NodeList<T> getPath(Node wurzel) {

        NodeList hilfsliste = new NodeListImplementierung();
        NodeList endergebnis = new NodeListImplementierung();
        hilfsliste.add(wurzel);


        while (!hilfsliste.isEmpty()) {

            Node first = (Node) hilfsliste.peekFirst();

            if (first.getChildren() != null) {

                Node aktuell = (Node) hilfsliste.pollFirst();
                
                endergebnis.add(aktuell);

                if (!hilfsliste.isEmpty()) {
                    NodeList<Node> reverse = aktuell.getChildren();
                    NodeList<Node> invert = new NodeListImplementierung();
                 
                    for (Node kind : reverse) {
                        invert.addFirst(kind);
                    }

                    for (Node kind : invert) {
                        hilfsliste.addFirst(kind);
                    }

                } else {
                    NodeList<Node> children = aktuell.getChildren();
                    for (Node kind : children) {
                        hilfsliste.add(kind);
                    }
                }
            } else {
                endergebnis.add(hilfsliste.pollFirst());
            }


        }
        return endergebnis;
    }
}
