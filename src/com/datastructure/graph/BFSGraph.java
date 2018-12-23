/**
 * 
 */
package com.datastructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author mandaliya
 *
 */
public class BFSGraph {

	static class Graph {
		int V;
		LinkedList<Integer> adjacencyList[];

		public Graph(int V) {
			this.V = V;

			// define the size of vertex
			adjacencyList = new LinkedList[V];
			for (int i = 0; i < V; i++) {
				adjacencyList[i] = new LinkedList<Integer>();
			}

		}

		static void addEdge(Graph graph, int src, int dest) {
			// adding the edges
			graph.adjacencyList[src].add(dest);

		}

		// print BSF tree for given source
		void printBSF(int s) {

			// mark all the vertex as not visited by default
			boolean visited[] = new boolean[V];

			// lookup queue
			LinkedList<Integer> queue = new LinkedList<Integer>();

			visited[s] = true;
			queue.add(s);

			while (queue.size() != 0) {
				// Dequeue a vertex from queue
				s = queue.poll();

				System.out.println(s + " ");

				// check all the adjace vertex of source
				Iterator<Integer> i = adjacencyList[s].iterator();

				while (i.hasNext()) {
					int n = i.next();
					if (!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}

		}
	}
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		
		graph.addEdge(graph,0, 1); 
		graph.addEdge(graph,0, 2); 
		graph.addEdge(graph,1, 2); 
		graph.addEdge(graph,2, 0); 
		graph.addEdge(graph,2, 3); 
		graph.addEdge(graph,3, 3); 
	  
	        System.out.println("Following is Breadth First Traversal "+ 
	                           "(starting from vertex 2)"); 
		graph.printBSF(2);
	}
}
