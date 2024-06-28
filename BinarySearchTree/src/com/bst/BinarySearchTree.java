package com.bst;

public class BinarySearchTree {
	
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	Node root;
	public BinarySearchTree() {
		root = null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node trav = root;
		while(true) {
			if(data < trav.data) {
				if(trav.left != null) {
					trav = trav.left;
				}else {
					trav.left = newNode;
					break;
				}
			}
			else {
				if(trav.right != null) {
					trav = trav.right;
				}else {
					trav.right = newNode;
					break;
				}
			}
		}
	}
	
	public void preorder(Node trav) {
		if(trav==null) {
			return;
		}
		System.out.print(trav.data + " ");
		preorder(trav.left);
		preorder(trav.right);
	}
	// wrapper method for calling in main function
	public void preorder() {
		preorder(root);
		System.out.println();
	}
	
	public void inorder(Node trav) {
		if(trav==null) {
			return;
		}
		inorder(trav.left);
		System.out.print(trav.data + " ");
		inorder(trav.right);
	}
	//wrapper method
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	public void postorder(Node trav) {
		if(trav==null) {
			return;
		}
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + " ");
	}
	//wrapper function
	public void postorder() {
		postorder(root);
		System.out.println();
	}
	
}
