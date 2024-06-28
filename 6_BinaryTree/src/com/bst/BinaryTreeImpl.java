package com.bst;

public class BinaryTreeImpl {
	
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	Node root;
	public BinaryTreeImpl() {
		root = null;
	}
	
	//insert node
	public Node add(int data) {
		Node newNode = new Node(data);
		return newNode;
	}
	
	//preorder traversal
	private void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public void preorder() {
		preorder(root);
		System.out.println();
	}
	
	//inorder traversal
	private void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	
	//postorder traversal
	private void postorder(Node root) {
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	public void postorder() {
		postorder(root);
		System.out.println();
	}
	
	// count total nodes
	private int countNode(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + countNode(root.left) +countNode(root.right);
	}
	public void countNode() {
		System.out.println("Total Nodes - "+countNode(root));
	}
	
	
	//count total leaf nodes in tree
	private int countLeafNode(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return countLeafNode(root.left) + countLeafNode(root.right);
	}
	public void countLeafNode() {
		System.out.println("Total Leaf Nodes - "+countLeafNode(root));
	}
	
	//count no. of nodes with passed value
	private int CountNodesWithValue(Node root, int data){
		if(root == null) {
			return 0;
		}
		int count = (root.data == data) ? 1 : 0;
		count += CountNodesWithValue(root.left, data);
		count += CountNodesWithValue(root.right, data);
		return count;
	}
	public void CountNodesWithValue(int value) {
		System.out.println("No. of Node of "+value+" - "+CountNodesWithValue(root, value));
	}
	
	
	//height of tree
	private int height(Node root) {
		if(root == null) {
			return -1;
		}
		int hl = height(root.left);
		int hr = height(root.right);
		int max = (hl > hr) ? hl : hr;
		return 1 + max;
	}
	public void height() {
		System.out.println("Height of tree - "+height(root));
	}
}
