package practice.bst;


class Node{
	
	int data;
	Node left;
	Node right;
}

class BST{
	
	public Node createNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
	}
	
	public Node insert(Node node, int data) {
		if(node == null) {
			return createNewNode(data);
		}
		if(data < node.data) {
			node.left = insert(node.left, data);
		} else if(data >  node.data) {
			node.right = insert(node.right, data);
		}
		
		return node;
	}
	
	public boolean checkNode(Node node,int val) {
		if(node == null) {
			return  false;
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
	public void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	public int height(Node node) {
		if(node == null) {
			return 0;
		}
		int lefth = height(node.left);
		int righth = height(node.right);
		
		if(lefth >righth) {
			return lefth+1;
		}else {
			return righth+1;
		}
	}
	public Node mirror(Node node) {
		if(node == null) {
			return null;
		}
		Node lefth = mirror(node.left);
		Node righth = mirror(node.right);
		
		node.left = righth;
		node.right = lefth;
		
		return node;
	}
}

public class BSTApp {
	
	public static void main(String[] args) {
		
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
		
		System.out.println("check the node:");
		System.out.println(a.checkNode(root, 100));
		
		root = a.mirror(root);
		a.inOrder(root);
		System.out.println();
		
		System.out.println(a.height(root));
		
	}

}
