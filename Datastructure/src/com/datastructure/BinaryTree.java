package com.datastructure;

public class BinaryTree {
	private static BinaryTree t = new BinaryTree();
	
Node root;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	BinaryTree(){
		root=null;
		
	}
	
	
public static void main(String[] args) {
	BinaryTree tr = new BinaryTree();
	tr.root= new Node(1);
	tr.root.left=new Node(2);
	tr.root.right= new Node(3);
	tr.root.left.left= new Node(4);

	
}
}


class Node{
	int key;
	Node left,right;
	public Node(int Key){
		key=this.key;
		left=right=null;
	}
}