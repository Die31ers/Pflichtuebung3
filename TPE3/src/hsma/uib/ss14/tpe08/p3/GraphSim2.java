package hsma.uib.ss14.tpe08.p3;

import hsma.uib.ss14.tpe08.p3.suche.Breitensuche;
import hsma.uib.ss14.tpe08.p3.suche.Tiefensuche;

/**
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 */
public class GraphSim2 {

	public static <T> void main(String[] args) {

		Tiefensuche<String> tiefensuche = new Tiefensuche<String>();
		Breitensuche<String> breitensuche = new Breitensuche<String>();
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
		Node<String> l = new Node<String>("L", "L");
		Node<String> m = new Node<String>("M", "M");
		Node<String> n = new Node<String>("N", "N");
		Node<String> o = new Node<String>("O", "O");
		Node<String> p = new Node<String>("P", "P");

		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		e.addChild(h);
		e.addChild(i);
		f.addChild(j);
		f.addChild(k);
		c.addChild(l);
		c.addChild(m);
		m.addChild(n);
		d.addChild(o);
		d.addChild(p);

		Graph<String> graph = new Graph<String>(a);
		System.out.println(graph.search("P", tiefensuche));
		System.out.println("Tiefensuche: " + tiefensuche.getPath());
		System.out.println(graph.search("P", breitensuche));
		System.out.println("Breitensuche: " + breitensuche.getPath());

	}
}
