package hsma.uib.ss14.tpe08.p3;

import java.util.*;

class Knoten {
	String name;
	boolean markiert;
	ArrayList<Knoten> nachbarn;

	Knoten(String s) {
		name = s;
		nachbarn = new ArrayList<Knoten>();
	}

	public String toString() {
		return name;
	}
}

class Graph1 {

	int knotenZahl;
	Knoten[] knotenArray;

	Graph1() {
		Knoten a = new Knoten("A"), b = new Knoten("B"), c = new Knoten("C"), d = new Knoten(
				"D"), e = new Knoten("E"), f = new Knoten("F"), g = new Knoten(
				"G"), h = new Knoten("H"), i = new Knoten("I"), k = new Knoten(
				"K"), l = new Knoten("L"), m = new Knoten("M"), n = new Knoten(
				"N"), o = new Knoten("O"), p = new Knoten("P");

		Knoten[] ka = { a, b, c, d, e, f, g, h, i, k, l, m, n, o, p };
		knotenArray = ka;
		knotenZahl = ka.length;

		// Kanten definieren
		b.nachbarn.add(a);
		d.nachbarn.add(e);
		d.nachbarn.add(c);
		d.nachbarn.add(b);
		e.nachbarn.add(h);
		f.nachbarn.add(d);
		f.nachbarn.add(i);
		g.nachbarn.add(h);
		h.nachbarn.add(n);
		h.nachbarn.add(l);
		h.nachbarn.add(f);
		k.nachbarn.add(g);
		l.nachbarn.add(n);
		l.nachbarn.add(i);
		m.nachbarn.add(k);
		n.nachbarn.add(p);
		n.nachbarn.add(o);
		p.nachbarn.add(m);
	}

	void resetMarken() {
		for (Knoten k : knotenArray)
			k.markiert = false;
	}

	int index(Knoten k) {
		for (int i = 0; i < knotenZahl; i++)
			if (k == knotenArray[i])
				return i;
		return -1;
	}

	int index(String s) {
		for (int i = 0; i < knotenZahl; i++)
			if (s.equals(knotenArray[i].name))
				return i;
		return -1;
	}

	Knoten find(String s) {
		for (int i = 0; i < knotenZahl; i++)
			if (s.equals(knotenArray[i].name))
				return knotenArray[i];
		return null;
	}

	boolean kante(int k1, Knoten k2) {
		for (Knoten k : knotenArray[k1].nachbarn)
			if (k == k2)
				return true;
		return false;
	}

	/*
	 * boolean kante(Knoten k1, Knoten k2){ for (int i=0; i < knotenZahl; i++)
	 * if (k1 == knotenArray[i]) return kante(i,k2); return false; }
	 */

	boolean kante(Knoten k1, Knoten k2) {
		for (Knoten i1 : knotenArray)
			if (i1 == k1)
				for (Knoten i2 : k1.nachbarn)
					if (i2 == k2)
						return true;
		return false;
	}

	void nachbarn() {
		for (Knoten k1 : knotenArray)
			for (Knoten k2 : k1.nachbarn)
				System.out.println("Kante von " + k1 + " nach " + k2
						+ " vorhanden");
	}

	void tiefenSuche(Knoten k) {
		resetMarken();
		rekTiefenSuche(k);
	}

	void rekTiefenSuche(Knoten k) {
		k.markiert = true;
		System.out.println(k);
		for (Knoten n : k.nachbarn)
			if (!n.markiert)
				rekTiefenSuche(n);
	}

	void breitenSuche(Knoten k) {
		resetMarken();
		LinkedList<Knoten> queue = new LinkedList<Knoten>();
		k.markiert = true;
		queue.add(k);
		while (!queue.isEmpty()) {
			Knoten kq = queue.removeFirst();
			System.out.println(kq);
			for (Knoten n : kq.nachbarn)
				if (!n.markiert) {
					n.markiert = true;
					queue.add(n);
				}
		}
	}

}

public class GraphT {

	static String start = "G";

	public static void main(String args[]) {
		System.out.println("Graph Tester");
		Graph1 g = new Graph1();
		Knoten k = g.find(start);
		if (k == null)
			System.out.println("Knoten " + start + " nicht im Graph gefunden!");
		else {
			System.out.println("Tiefensuche");
			g.tiefenSuche(k);
			System.out.println("Breitensuche");
			g.breitenSuche(k);
		}

	}
}
