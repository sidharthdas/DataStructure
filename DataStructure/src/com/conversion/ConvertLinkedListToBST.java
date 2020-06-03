package com.conversion;

class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
}

class LNode {
	int data;
	LNode next;

	public LNode(int data) {
		this.data = data;
	}
}

class BST {
	public BSTNode createANewBSTNode(int val) {
		BSTNode BSTNode = new BSTNode();
		BSTNode.data = val;
		BSTNode.right = null;
		BSTNode.left = null;

		return BSTNode;
	}

	public BSTNode insert(BSTNode BSTNode, int val) {
		if (BSTNode == null) {
			return createANewBSTNode(val);
		}
		if (val < BSTNode.data) {
			BSTNode.left = insert(BSTNode.left, val);
		} else if (val > BSTNode.data) {
			BSTNode.right = insert(BSTNode.right, val);
		}
		return BSTNode;
	}

	public void inOrder(BSTNode BSTNode) {
		if (BSTNode == null) {
			return;
		}
		inOrder(BSTNode.left);
		System.out.print(BSTNode.data + " ");
		inOrder(BSTNode.right);

	}

	public void dec(BSTNode BSTNode) {
		if (BSTNode == null) {
			return;
		}
		dec(BSTNode.right);
		System.out.print(BSTNode.data + " ");
		dec(BSTNode.left);

	}

	public void preOrder(BSTNode BSTNode) {
		if (BSTNode == null) {
			return;
		}
		System.out.print(BSTNode.data + " ");
		preOrder(BSTNode.left);
		preOrder(BSTNode.right);
	}

	public boolean checkBSTNode(BSTNode BSTNode, int val) {
		if (BSTNode == null) {
			return false;
		}
		boolean isPresent = false;
		while (BSTNode != null) {
			if (val < BSTNode.data) {
				BSTNode = BSTNode.left;
			} else if (val > BSTNode.data) {
				BSTNode = BSTNode.right;
			} else {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}

}

class LinkedList {

	LNode head;

	public LinkedList insert(LinkedList l, int val) {
		LNode newNode = new LNode(val);
		if (l.head == null) {
			l.head = newNode;
		} else {
			LNode last = l.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return l;
	}

	public void printList(LinkedList l) {
		LNode currNode = l.head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

}

public class ConvertLinkedListToBST {

	public BSTNode insertLinkedListValueInBST(LinkedList l, BSTNode node) {
		LNode currNode = l.head;
		BST a = new BST();
		while (currNode != null) {
			node = a.insert(node, currNode.data);
			currNode = currNode.next;
		}
		return node;
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		ConvertLinkedListToBST b = new ConvertLinkedListToBST();
		BST a = new BST();

		l = l.insert(l, 9);
		l = l.insert(l, 10);
		l = l.insert(l, 8);
		l = l.insert(l, 20);
		l = l.insert(l, 19);
		l = l.insert(l, 1);

		System.out.println("Linked list: ");
		l.printList(l);
		System.out.println();
		System.out.println("________________________________________________________________________________________");

		System.out.println("Linkedlist to BST: ");
		BSTNode root = null;
		root = b.insertLinkedListValueInBST(l, root);
		a.inOrder(root);

		// insert linkedlist values in the bst

	}

}
