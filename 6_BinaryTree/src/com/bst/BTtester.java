package com.bst;

public class BTtester {

	public static void main(String[] args) {
		BinaryTreeImpl b = new BinaryTreeImpl();
		
		b.root = b.add(12);
		b.root.left = b.add(10);
		b.root.right = b.add(50);
		b.root.left.right = b.add(15);
		b.root.left.left = b.add(20);
		
		b.preorder();
		b.inorder();
		b.postorder();
		b.countNode();
		b.countLeafNode();
		b.CountNodesWithValue(50);
		b.height();

	}

}
