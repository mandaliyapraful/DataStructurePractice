/**
 * 
 */
package com.datastructure.tree;

/**
 * @author mandaliya
 *
 */
public class BinaryTree {
	
	//Root Node
	Node root;
	
	public BinaryTree(int key) {
		root = new Node(key);
	}
	
	public BinaryTree() {
		root = null;
	}
	
	public void display(){
		System.out.println("Tree");
		while(root != null){
			System.out.println(" "+root.key+" ");
			System.out.println(" /   \\");
			System.out.println(root.left.key+"   "+root.right.key);
			root = root.left;
		}
	}
	public void InOrder(){
		printInOrder(root);
	}
	private void printInOrder(Node node) {
		if(node == null){
			return;
		}
		
		//Left
		printInOrder(node.left);
		
		//print
		System.out.print(node.key+" ");
		
		//right
		printInOrder(node.right);
	}

	
	public void printpreOrder(Node node){
		if(node == null){
			return;
		}
		//print root
		System.out.print(node.key+" ");
		//visit left
		printpreOrder(node.left);
		//visit right
		printpreOrder(node.right);
	}
	
	public void printPostOrder(Node node){
		if(node == null){
			return;
		}
		//visit left
		printPostOrder(node.left);
		//vist right
		printPostOrder(node.right);
		//print root
		System.out.print(node.key+" ");
		
	}
	
	public void levelOrder(){
		int h = height(root);
		int i;
		System.out.println(h);
		for(i = 1;i <= h;i++){
			printLeveLOrder(root,i);
		}
	}
	private void printLeveLOrder(Node node, int level) {
		if(node == null){
			return;
		}
		if(level == 1){
			System.out.print(node.key+" ");
		}else if(level > 1){
			//print left
			printLeveLOrder(node.left, level-1);
			//print right
			printLeveLOrder(node.right, level-1);
		}
	}

	private int height(Node node) { 
		if(node == null){
			return 0;
		}else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			if(lheight >= rheight){
				return (lheight+1);
			}else{
				return (rheight+1);
			}
		}
	}
	
	public void addNode(int key){
		Node new_Node = new Node(key);
		if(root == null){
			root = new_Node;
		}else{
			Node focus_Node = root;
			Node parent;
			while(true){
				parent = focus_Node;
				if(key < focus_Node.key){
					focus_Node = focus_Node.left;
					if(focus_Node == null){
						parent.left = new_Node;
						return;
					}
				}else{
					focus_Node = focus_Node.right;
					if(focus_Node == null){
						parent.right = new_Node;
						return;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
/*		
		binaryTree.root = new Node(1);
		
		binaryTree.root.left = new Node(2);
		
		binaryTree.root.right = new Node(3);
		
		binaryTree.root.right.left = new Node(6);

		binaryTree.root.right.right = new Node(7);
		
		binaryTree.root.left.left = new Node(4);
		
		binaryTree.root.left.right = new Node(5);*/
		
		binaryTree.addNode(50);
		binaryTree.addNode(25);
		binaryTree.addNode(15);
		binaryTree.addNode(30);
		binaryTree.addNode(75);
		binaryTree.addNode(85);
		/*
		 * Tree structure
				50
			   /  \
			 25    30
		    /  \     \
	 	  15   30     85
	 	*/
		System.out.println("InOrder");
		binaryTree.printInOrder(binaryTree.root);
		System.out.println();
		System.out.println("PreOder");
		binaryTree.printpreOrder(binaryTree.root);
		System.out.println();
		System.out.println("PostOrder");
		binaryTree.printPostOrder(binaryTree.root);
		System.out.println();
		System.out.println("LevelOrder");
		System.out.println();
		binaryTree.levelOrder();
		
	}

}
