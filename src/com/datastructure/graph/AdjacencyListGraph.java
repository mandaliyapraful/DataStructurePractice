/**
 * 
 */
package com.datastructure.graph;

import java.util.LinkedList;

/**
 * @author mandaliya
 *
 */
public class AdjacencyListGraph {

	static class Graph {
		int V;
		LinkedList<Integer> adjListArray[];

		// Graph
		Graph(int V) {
			this.V = V;

			// define the size of array
			adjListArray = new LinkedList[V];

			// creating new list for each vertex
			for (int i = 0; i < V; i++) {
				adjListArray[i] = new LinkedList<Integer>();
			}
		}
	}

	// Adds an edge to an undirected graph
	static void addEdge(Graph graph, int src, int desc) {
		// Add an edge from src to desc
		graph.adjListArray[src].add(desc);

		// since gragh is undirected , add edge from dest src also
		graph.adjListArray[desc].add(src);
	}

	// print the graph
	static void printGraph(Graph graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("Head ");
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// create the graph

		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		
		//print graph
		printGraph(graph);
	}
}
