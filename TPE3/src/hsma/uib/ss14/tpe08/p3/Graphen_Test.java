package hsma.uib.ss14.tpe08.p3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */

public class Graphen_Test {

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

	@Test
	public void getPath() {
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

		assertEquals(bs.toString(), gr.getPath(new Breitensuche()).toString());
		assertEquals(ts.toString(), gr.getPath(new Tiefensuche()).toString());

	}

	@Test
	public void obKinder() {

		a.addChild(b, c, d);
		c.addChild(e, f, g);
		g.addChild(h);
		d.addChild(c);
		h.addChild(j);

		assertEquals(a.kindknoten, a.getChildren());
		assertEquals(c.kindknoten, c.getChildren());
		assertEquals(g.kindknoten, g.getChildren());
		assertEquals(d.kindknoten, d.getChildren());
		assertEquals(h.kindknoten, h.getChildren());
		assertEquals(f.kindknoten, f.getChildren());

	}

	@Test
	public void testSearch() {

		a.addChild(b, c, d);
		c.addChild(e, f, g);
		g.addChild(h);
		h.addChild(j);

		NodeListImplementierung<Node> bs = new NodeListImplementierung<Node>();
		bs.add(b);

		NodeListImplementierung<Node> ts = new NodeListImplementierung<Node>();

		assertEquals(bs.toString(), gr.search(new Breitensuche(), j).toString());
		assertEquals(ts.toString(), gr.search(new Tiefensuche(), b).toString());

	}

}
