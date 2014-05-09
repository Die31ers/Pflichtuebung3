package hsma.uib.ss14.tpe08.p3;

import java.util.HashSet;
import java.util.Queue;

public class Breitensuche implements SearchStrategy{
	@Override
	public void search(Node start) {
		Queue <Node> vertexQueue = (Queue<Node>) new NodeListImpl<Node>();
		HashSet<Node> visitedVertices = new HashSet<Node>();

		visitedVertices.add(start);
		vertexQueue.add(start);
		while (!vertexQueue.isEmpty()) {
			Node currentVisit = vertexQueue.poll();
			//System.out.println("Visiting " + currentVisit.getName());
			while (vertexQueue.size() > 0) {
				if (!visitedVertices.contains(start)) {
					vertexQueue.add(start);
					visitedVertices.add(start);
				}
			}
		}

	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPath() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * 
	 */

}
