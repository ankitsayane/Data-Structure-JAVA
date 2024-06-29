package com.operations;

public class BinarySearchTree {
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root;
	public BinarySearchTree() {
		this.root = null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		Node temp = root;
		while(true) {
			if(temp.data > data) {
				if(temp.left != null) {
					temp = temp.left;
				}else {
					temp.left = newNode;
					break;
				}
			}else {
				if(temp.right != null) {
					temp = temp.right;
				}else {
					temp.right = newNode;
					break;
				}
			}
		}
	}
	
	
	//height of tree
	private int height(Node root) {
		if(root == null) {
			return 0;
		}
		int heightLeft = height(root.left);
		int heightRight = height(root.right);
		int h = Math.max(heightLeft, heightRight);
		return 1 + h;
	}
	public void height() {
		System.out.println("Height of Tree - "+height(root));
	}
	
	//max element in tree
	private int maxNode(Node root) {
		if(root == null) {
			return 0;
		}
		int max = root.data;
		int maxR = maxNode(root.right);
		max = Math.max(max, maxR);
		return max;
	}
	public void maxNode() {
		System.out.println("Maximum Ele - "+maxNode(root));
	}
	
	//min element in tree
		private int minNode(Node root) {
			if(root == null) {
				return 0;
			}
			int min = root.data;
			int minL = maxNode(root.left);
			min = Math.min(min, minL);
			return min;
		}
		public void minNode() {
			System.out.println("Minimum Ele - "+minNode(root));
		}
		
		public Node[] binarySearchWithParent(int data) {
			Node temp = root, parent = null;
			while(temp != null) {
				if(data == temp.data) {
					return new Node[] {temp, parent};
				}
				parent = temp;
				if(data < temp.data) {
					temp = temp.left;
				}else {
					temp = temp.right;
				}
			}
			return new Node[] {null, null};
		}
		
	//delete
		private void deleteNode(Node root, int data) {
		    Node[] arr = binarySearchWithParent(data);
		    Node trav = arr[0];
		    Node parent = arr[1];
		    
		    if (trav == null) {
		        System.out.println("Node not found");
		        return;
		    }

		    // Node has two children
		    if (trav.left != null && trav.right != null) {
		        parent = trav;
		        Node succ = trav.right;
		        while (succ.left != null) {
		            parent = succ;
		            succ = succ.left;
		        }
		        trav.data = succ.data;
		        trav = succ;  // Now, trav points to the successor which needs to be deleted
		    }

		    // Node has at most one child
		    Node child = (trav.left != null) ? trav.left : trav.right;

		    if (trav == root) {
		        root = child;
		    } else if (trav == parent.left) {
		        parent.left = child;
		    } else {
		        parent.right = child;
		    }
		}

		public void delete(int data) {
		    deleteNode(root, data);
		}
}
