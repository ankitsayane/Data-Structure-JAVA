package com.bst;

public class BSTtester {

	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		
		b.addNode(50);
		b.addNode(70);
		b.addNode(60);
		b.addNode(25);
		b.addNode(30);
		b.addNode(10);
		
		b.preorder();
		b.inorder();
		b.postorder();

	}

}
