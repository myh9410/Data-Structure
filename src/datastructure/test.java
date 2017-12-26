package datastructure;

public class test {
	static class Node{
		public Node parent;
		public Node left;
		public Node right;
		public int key;
	}
	static class BST{
		public Node root;
		public void preOrder(Node temp){
			if (root == null)
				return;
			System.out.println(temp.key);
			if (temp.left != null)
				preOrder(temp.left);
			if (temp.right != null)
				preOrder(temp.right);
		}
		public void insert(int key){
			Node insertNode = new Node();
			insertNode.key = key;
			if (root == null)
				root = insertNode;
			else{
				Node temp = root;
				Node parent;
				while (true){
					parent = temp;
					if (temp.key < key){
						temp = temp.right;
						if (temp == null){
							parent.left = insertNode;
							insertNode.parent = parent;
							return;
						}
					}else{
						temp = temp.left;
						if (temp == null){
							parent.right = insertNode;
							insertNode.parent = parent;
							return;
						}
					}
				}
			}
		}
		public boolean delete(int key){
			Node parent = root;
			Node current = root;
			boolean isleftChild = false;
			while (current.key != key){
				parent = current;
				if (current.key > key){
					isleftChild = true;
					current = current.left;
				}else{
					isleftChild = false;
					current = current.right;
				}if (current == null){
					return false;
				}
			}
			if (current.left == null && current.right == null){
				if (current == root)
					root = null;
				if (isleftChild == true)
					parent.left = null;
				else
					parent.right = null;
			}else if (current.left == null){
				if (current == root)
					root = current.right;
				else if (isleftChild)
					parent.left = current.right;
				else
					parent.right = current.right;
			}else if (current.left != null && current.right != null){
				Node successor = getSuccessor(current);
				if (current == root)
					root = successor;
				else if (isleftChild)
					parent.left = successor;
				else
					parent.right = successor;
				successor.left = current.left;
			}
			return true;
		}
		public Node getSuccessor(Node deleteNode){
			Node successor = null;
			Node successorParent = null;
			Node current = deleteNode.right;
			while (current != null){
				successorParent = successor;
				successor = current;
				current = current.left;
			}
			if (successor != deleteNode.right){
				successorParent.left = successor.right;
				successor.right = deleteNode.right;
			}return successor;
			}
	}
}