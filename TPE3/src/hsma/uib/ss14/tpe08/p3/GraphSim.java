package hsma.uib.ss14.tpe08.p3;

import hsma.uib.ss14.tpe08.p3.suche.Breitensuche;
import hsma.uib.ss14.tpe08.p3.suche.Tiefensuche;

/**
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 */
public class GraphSim {

	public static <T> void main(String[] args) {
		

		Node<String> a = new Node<String>("A", "A");
		Node<String> b = new Node<String>("B", "B");
		Node<String> c = new Node<String>("C", "C");
		Node<String> d = new Node<String>("D", "D");
		Node<String> e = new Node<String>("E", "E");
		Node<String> f = new Node<String>("F", "F");
		Node<String> g = new Node<String>("G", "G");
		Node<String> h = new Node<String>("H", "H");
		Node<String> i = new Node<String>("I", "I");
		Node<String> j = new Node<String>("J", "J");
		Node<String> k = new Node<String>("K", "K");
		
		a.addChild(d);
		a.addChild(c);
		a.addChild(b);
		b.addChild(g);
		b.addChild(f);
		b.addChild(e);
		b.addChild(a);
		g.addChild(d);
		f.addChild(k);
		f.addChild(j);
		k.addChild(d);
		j.addChild(i);
		e.addChild(i);
		e.addChild(h);
		h.addChild(b);

		Graph<String> graph = new Graph<String>(a);
		Tiefensuche<String> tiefensuche = new Tiefensuche<String>();
		Breitensuche<String> breitensuche = new Breitensuche<String>();
		
		System.out.println(graph.search("K", breitensuche));
		System.out.println("Breitensuche: " + breitensuche.getPath());
		
		System.out.println(graph.search("K", tiefensuche));
		System.out.println("Tiefensuche: " + tiefensuche.getPath());
	}
}
