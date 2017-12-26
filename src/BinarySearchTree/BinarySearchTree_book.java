package BinarySearchTree;

public class BinarySearchTree_book {
	static class Node{
		public double key;
		public Object position;
		public Node parent;
		public Node leftChild;
		public Node rightChild;
	}
	
	static class BinaryTree{
		private Node root;
		public BinaryTree(){
			root = null;
		}
		public Node root(){
			return root;
		}
		public void preOrder(Node temp){
			if (root == null)
				return;
			System.out.print(temp.key + " ");
			if (temp.leftChild != null)
				preOrder(temp.leftChild);
			if (temp.rightChild != null)
				preOrder(temp.rightChild);
		}
	
		public void inOrder(Node temp){
			if (temp == null)
				return;
			if (temp.leftChild != null)
				inOrder(temp.leftChild);
			System.out.print(temp.key + " ");
			if (temp.rightChild != null)
				inOrder(temp.rightChild);
		}
		
		public void postOrder(Node temp){
			if (temp == null)
				return;
			if (temp.leftChild != null)
				postOrder(temp.leftChild);
			if (temp.rightChild != null)
				postOrder(temp.rightChild);
			System.out.print(temp.key + " ");
		}
		
		
		
		public Node find(double key){
			Node temp = root;
			while (temp.key != key){
				if (temp == null)
					return null;
				else
				
				if (key < temp.key)
					temp = temp.leftChild;
				else 
					temp = temp.rightChild;
			}
			return temp;
		}
		
		public void insert(double key){
			Node insertNode = new Node();
			insertNode.key = key;
						
			if (root == null)
				root = insertNode;
			
			else
			{
				Node temp = root;
				Node parent;
				while (true){
					parent = temp;
					if (temp.key < key){
						temp = temp.rightChild;
						if (temp == null){
							parent.rightChild = insertNode;
							insertNode.parent = parent;
							return;
						}
					}
						
					else{
						temp = temp.leftChild;
						if (temp == null){
							parent.leftChild = insertNode;
							insertNode.parent = parent;
							return;
						}
							
					}
				}
			}
		}
		
		public boolean delete(double key){
			Node temp = root;
			Node parent = temp;
			
			while (temp.key != key){
				if (temp == null)
					return false;
				//해당 key가 없는 경우
				
				parent = temp;
				
				if(key < temp.key)
					temp = temp.leftChild;
				else
					temp = temp.rightChild;
			}//key값이 같은 노드를 찾아가는 과정
				
			if (temp.leftChild == null && temp.rightChild == null){
				if (temp == root)
					root = null;
				else if (temp == parent.leftChild)
					parent.leftChild = null;
				else
					parent.rightChild = null;
			}
			
			else if(temp.leftChild == null){
				if (temp == root)
					root = temp.rightChild;
				else if (temp == parent.leftChild)
					parent.leftChild = temp.rightChild;
				else
					parent.rightChild = temp.rightChild;
			}else if(temp.rightChild == null){
				if (temp == root)
					root = temp.leftChild;
				else if (temp == parent.leftChild)
					parent.leftChild = temp.leftChild;
				else
					parent.rightChild = temp.leftChild;
			}
			
			else{
				Node candidateLeftChild = null;
				Node candidateRightChild = null;
				Node candidate;
				Node subtree;
				Node tempParent;
				int leftcount = 0, rightcount = 0;
				
				if (temp.leftChild != null){
					candidateLeftChild = temp.leftChild;
					leftcount ++;
					while (candidateLeftChild.rightChild != null){
						candidateLeftChild = candidateLeftChild.rightChild;
						leftcount ++;
						}
				}
				
				if (temp.rightChild != null){
					candidateRightChild = temp.rightChild;
					rightcount ++;
					while(candidateRightChild.leftChild != null){
						candidateRightChild = candidateRightChild.leftChild;
						rightcount ++;
					}
				}
				
				if (leftcount > rightcount){
					candidate = candidateLeftChild;
					if (candidateLeftChild.leftChild != null)
						candidateLeftChild.parent = candidateLeftChild.leftChild;
				}else{
					candidate = candidateRightChild;
					if (candidateRightChild.rightChild != null)
						candidateRightChild.parent = candidateRightChild.rightChild;
				}
				
				if (temp == root)
					root = candidate;
				else if (temp == parent.leftChild)
					parent.leftChild = candidate;
				else
					parent.rightChild = candidate;
			}
			
			return true;
		}
	}
}

