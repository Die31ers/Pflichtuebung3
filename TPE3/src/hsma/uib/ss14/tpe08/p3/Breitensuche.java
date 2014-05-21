package hsma.uib.ss14.tpe08.p3;

/**
 * Breitensuche sucht nach bestimmten Knoten im Graphen.
 * Sucht zuerst in allen Elternknoten einer Ebene nach den Knoten,
 * bevor die Suche auf die Kindknoten zugreift.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Die Klasse Breitensuche wird von SearchStrategy implementiert.
 * 
 */
public class Breitensuche<T> implements SearchStrategy<T> {

	/**
	 * Liefert den gesuchten Knoten zur�ck.
	 * 
	 * @param wurzel des Graphen.
	 * @param ziel des Graphen.
	 * 
	 * @return endergebnis, den gesuchten Knoten.
	 * 
	 */
    @Override
    public NodeList<T> search(Node wurzel, Node ziel) {

        NodeList hilfsliste = new NodeListImplementierung();
        NodeList endergebnis = new NodeListImplementierung();


        if (wurzel != null) {
            hilfsliste.addFirst(wurzel);

           if(hilfsliste.getLast().equals(ziel)) {
            endergebnis.add(hilfsliste.getLast());
           }
        }
        while (hilfsliste.size() != 0) {
        	

            Node eltern = (Node) hilfsliste.getLast();

            if (eltern.getChildren().size() != 0) {  
                
                NodeList<Node> kinder = eltern.getChildren();
               
                for (Node kind : kinder) {
                    hilfsliste.addFirst(kind);

                    if(kind.equals(ziel)) {
                    endergebnis.add(kind);
                    }
                }
            }

            hilfsliste.removeLast();

        }
        return endergebnis;

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


        if (wurzel != null) {
            hilfsliste.addFirst(wurzel);
            endergebnis.add(hilfsliste.getLast());
        }
        while (hilfsliste.size() != 0) {


            Node eltern = (Node) hilfsliste.getLast();

            if (eltern.getChildren().size() != 0) { 
               
                NodeList<Node> kinder = eltern.getChildren();
              
                for (Node kind : kinder) {
                    hilfsliste.addFirst(kind);
                    endergebnis.add(kind);
                }
            }

            hilfsliste.removeLast();

        }
        return endergebnis;
    }
}
