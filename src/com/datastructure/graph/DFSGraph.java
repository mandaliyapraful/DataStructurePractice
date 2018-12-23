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
public class DFSGraph {

	static class Graph {
		int V;
		LinkedList<Integer> adjLinkedList[];

		public Graph(int V) {
			this.V = V;

			adjLinkedList = new LinkedList[V];

			for (int i = 0; i < V; i++) {
				adjLinkedList[i] = new LinkedList<Integer>();
			}
		}

		static void addEdge(Graph graph, int src, int dest) {
			graph.adjLinkedList[src].add(dest);
			// graph.adjLinkedList[dest].add(src);
		}

		void prinfDFS(int v, boolean visited[]) {
			visited[v] = true;

			System.out.print(v + " ");

			Iterator<Integer> i = adjLinkedList[v].iterator();

			while (i.hasNext()) {
				int vet = i.next();
				if (!visited[vet]) {
					prinfDFS(vet, visited);
				}

			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(4);

		Graph.addEdge(graph, 0, 1);
		Graph.addEdge(graph, 0, 2);
		Graph.addEdge(graph, 1, 2);
		Graph.addEdge(graph, 2, 0);
		Graph.addEdge(graph, 2, 3);
		Graph.addEdge(graph, 3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		//the new boolean array is use to mark the visited node
		//can extract a method also for doing same
		graph.prinfDFS(2, new boolean[graph.V]);
	}

}
