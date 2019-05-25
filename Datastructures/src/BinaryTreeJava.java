
public class BinaryTreeJava {
	Node root;
	class Node
	{
		int key;
		String name;
		Node left;
		Node right;
		Node(int key, String name){
			this.key = key;
			this.name = name;
		}
	public String toString() {
			return name + "has key " + key;
	    }
	}

	
//initialize the node.
	//if root is null, make it as root;
	// if key is less than node.key, add left else add right
	// focusNode = node.left
	

public void addNode(int key,String name) {
		Node newNode = new Node(key, name);
		if(root == null) {
			root = newNode;
		}else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key < focusNode.key) {
					//Switch focus to left child
					focusNode = focusNode.left;
					//if its null? add it
					if(focusNode == null) {
						parent.left = newNode;
						return;
					}
					
				}else {
					focusNode = focusNode.right;
					
					if(focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
public Node findNode(int key) {

	// Start at the top of the tree

	Node focusNode = root;

	// While we haven't found the Node
	// keep looking

	while (focusNode.key != key) {

		// If we should search to the left

		if (key < focusNode.key) {

			// Shift the focus Node to the left child

			focusNode = focusNode.left;

		} else {

			// Shift the focus Node to the right child

			focusNode = focusNode.right;

		}

		// The node wasn't found

		if (focusNode == null)
			return null;

	}

	return focusNode;

}
public void inOrderTraverseTree(Node focusNode) {

	if (focusNode != null) {

		// Traverse the left node

		inOrderTraverseTree(focusNode.left);

		// Visit the currently focused on node

		System.out.println(focusNode);

		// Traverse the right node

		inOrderTraverseTree(focusNode.right);

	}

}

public void preorderTraverseTree(Node focusNode) {

	if (focusNode != null) {

		System.out.println(focusNode);

		preorderTraverseTree(focusNode.left);
		preorderTraverseTree(focusNode.right);

	}

}

public void postOrderTraverseTree(Node focusNode) {

	if (focusNode != null) {

		postOrderTraverseTree(focusNode.left);
		postOrderTraverseTree(focusNode.right);

		System.out.println(focusNode);

	}

}
		public static void main(String args[]) {
			BinaryTreeJava theTree = new BinaryTreeJava();

			theTree.addNode(50, "Boss");

			theTree.addNode(25, "Vice President");

			theTree.addNode(15, "Office Manager");

			theTree.addNode(30, "Secretary");

			theTree.addNode(75, "Sales Manager");

			theTree.addNode(85, "Salesman 1");

			// Different ways to traverse binary trees

			// theTree.inOrderTraverseTree(theTree.root);

			// theTree.preorderTraverseTree(theTree.root);

			// theTree.postOrderTraverseTree(theTree.root);

			// Find the node with key 75

			System.out.println("\nNode with the key 75");

			System.out.println(theTree.findNode(75));

		}
}
