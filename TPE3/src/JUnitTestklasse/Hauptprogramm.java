package JUnitTestklasse;

import java.awt.List;
import java.util.LinkedList;

import Graph_List_ListImpl.*;
import Node.*;
import SearchStrategy.SearchStrategy;

public class Hauptprogramm {
	public static void main(String[] args) {
		String a = "Sido - Weihnachtszeit";
		String b = "Swagboy 9000 - nerv ich alle in facebook";
		String c = "Bushido - Lass mich allein";
		LinkedList liste = new LinkedList();

		liste.add(a);
		liste.add(b);
		liste.add(c);
		System.out.println(liste.get(0));
	}
}
