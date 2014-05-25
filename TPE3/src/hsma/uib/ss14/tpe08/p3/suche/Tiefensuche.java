package hsma.uib.ss14.tpe08.p3.suche;

import hsma.uib.ss14.tpe08.p3.suche.SearchHelper;
import hsma.uib.ss14.tpe08.p3.Node;
import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;

/**
 * Klasse, welche eine Tiefensuche (PreOrder) implementiert.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */
public class Tiefensuche<T> extends SearchHelper<T> implements
		SearchStrategy<T> {

	  /**
     * Methode, welche die Suche nach einen dynamischen
     * Wert implementiert. Rekursiver Aufruf!
     *
     * @param start Startknoten des Graphen
     * @param ziel Wert, welcher gesucht werden soll
     * @return Eine Liste der Ergegbnisse
     */
    @Override
    public NodeListImpl<Node<T>> search(Node<T> start, T ziel) {
        this.getPath().clear();
        return preOrderRek(start, ziel, new NodeListImpl<Node<T>>());
    }

    /**
     * Methode, welche eine rekursive PreOrder
     * Suche über eine dynamische Node implementiert.
     *
     * @param start    Startknoten des Graphen
     * @param wert    Zu suchender Wert
     * @param ergebnisse Eine leere Liste für die Ergebnisse
     * @return Eine Liste der gefundenen Ergebnisse
     */
    private NodeListImpl<Node<T>> preOrderRek(
            Node<T> start, T wert, NodeListImpl<Node<T>> ergebnisse) {
        this.getPath().add(start);
        if (start.getValue() == wert) {
            ergebnisse.add(start);
        }
        //Es werden alle Kinder des Knoten durchlaufen
        for (Node<T> node : start.getChildren()) {
            if (!this.getPath().contains(node)) {
                preOrderRek(node, wert, ergebnisse); //Rekursiver-Aufruf
            }
        }
        return ergebnisse;
    }

}
