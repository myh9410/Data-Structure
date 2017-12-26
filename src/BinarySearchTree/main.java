package BinarySearchTree;

import BinarySearchTree.BinarySearchTree_book.BinaryTree;

public class main {
	public static void main(String args[]){
		int value;
		BinaryTree tree = new BinaryTree();
		
		tree.insert(26);
		tree.insert(50);
		tree.insert(10);
		tree.insert(25);
		tree.insert(40);
		tree.insert(5);
		tree.insert(17);
		tree.insert(29);
		tree.insert(38);
		tree.insert(70);
		tree.insert(90);
		
		tree.preOrder(tree.root());
		System.out.println();
		tree.inOrder(tree.root());
		System.out.println();
		tree.postOrder(tree.root());
		System.out.println();
		
	}
}
