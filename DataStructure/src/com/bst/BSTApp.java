package com.bst;

class Node{
	int data;
	Node left;
	Node right;
}

class BST{
	public Node createANewNode(int val) {
		Node node = new Node();
		node.data = val;
		node.right = null;
		node.left= null;
		
		return node;
	}
	
	public Node insert(Node node, int val) {
		if(node == null) {
			return createANewNode(val);
		}
		if(val < node.data) {
			node.left = insert(node.left, val);
		}else  if(val > node.data) {
			node.right = insert(node.right, val);
		}
		return node;
	}
	
	public void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+ " ");
		inOrder(node.right);
		
	}
	
	public void dec(Node node) {
		if(node == null) {
			return;
		}
		dec(node.right);
		System.out.print(node.data+ " ");
		dec(node.left);
		
	}
	public void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+ " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public boolean checkNode(Node node, int val) {
		if(node == null) {
			return false;
		}
		boolean isPresent = false;
		while(node != null) {
			if(val < node.data) {
				node = node.left;
			}else if(val > node.data) {
				node = node.right;
			}else {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}
}

public class BSTApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST a = new BST();
		Node root = null;
		
		root = a.insert(root, 8);
		root = a.insert(root, 16);
		root = a.insert(root, 18);
		root = a.insert(root, 20);
		root = a.insert(root, 19);
		root = a.insert(root, 100);
		root = a.insert(root, 210);
		root = a.insert(root, 1);
		root = a.insert(root, 9);
		
		System.out.println("inOreder: ");
		a.inOrder(root);
		System.out.println();
		System.out.println("dec order:");
		a.dec(root);
		System.out.println();
		System.out.println("Pre order: ");
		a.preOrder(root);
		System.out.println();
		System.out.println("check the node:");
		System.out.println(a.checkNode(root, 100));
		
		
	}

}
