package hsma.uib.ss14.tpe08.p3;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */

public class Simulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node a = new Node("A", "hallo");
		Graph gr = new Graph(a);

		Node b = new Node("B", 1);
		Node c = new Node("C", true);
		Node d = new Node("D", "morgen");
		Node e = new Node("E", 2.0);
		Node f = new Node("F", false);
		Node g = new Node("G", "tsch�ss");
		Node h = new Node("H", 3);
		Node i = new Node("C", 'c');
		Node j = new Node("B", 1);

		a.addChild(b, c, d);
		c.addChild(e, f, g);
		g.addChild(h);
		d.addChild(c);

		NodeListImplementierung<Node> bs = new NodeListImplementierung<Node>();
		
		bs.add(a);
		bs.add(b);
		bs.add(c);
		bs.add(d);
		bs.add(e);
		bs.add(f);
		bs.add(g);
		bs.add(c);
		bs.add(h);
		bs.add(e);
		bs.add(f);
		bs.add(g);
		bs.add(h);

		NodeListImplementierung<Node> ts = new NodeListImplementierung<Node>();

		ts.add(a);
		ts.add(b);
		ts.add(c);
		ts.add(e);
		ts.add(f);
		ts.add(g);
		ts.add(h);
		ts.add(d);
		ts.add(c);
		ts.add(e);
		ts.add(f);
		ts.add(g);
		ts.add(h);

		System.out.println("Breitensuche:");
		System.out.println(bs.toString());
		System.out.println("Tiefensuche:");
		System.out.println(ts.toString());

		System.out.println("Tiefensuche getPath:");
		System.out.println(gr.getPath(new Tiefensuche()).toString());
		System.out.println("Breitensuche getPath:");
		System.out.println(gr.getPath(new Breitensuche()).toString());
		
		System.out.println(a.getChildren());
		System.out.println(c.getChildren());
		System.out.println(g.getChildren());
		System.out.println(d.getChildren());

	
		System.out.println(bs.add(b));
		System.out.println(ts.add(b));
		
		System.out.println(gr.wurzel);
		
		System.out.println(gr.knoten);
		
		

	}

}
