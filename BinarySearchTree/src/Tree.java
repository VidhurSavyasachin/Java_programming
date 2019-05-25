 
public class Tree {
	
	private TreeNode root;
	public void insert(int value ) {
		if(root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	public void TraverseInOrder() {
		if(root != null) {
			root.traverseInorder();
		}
	}
	public void delete(int value) {
		root = delete(root , value);
	}
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if(subtreeRoot == null)
			{
				return subtreeRoot;
			}
		if(value < subtreeRoot.getData()) {
			subtreeRoot.setLeftNode(delete(subtreeRoot.getLeftNode(),value));
		}else if(value > subtreeRoot.getData()) {
			subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), value));
		}else {
			//Cases 0 and 1: deletes has 0 or 1 child
			if(subtreeRoot.getLeftNode() == null) {
				return subtreeRoot.getRightNode();
			}else if(subtreeRoot.getRightNode() == null) {
				return subtreeRoot.getLeftNode();
			}
		
		
		}
		return subtreeRoot;
				
	}
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		return null;
	}
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
	}
	public int max() {
		if(root == null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
		}
	}
}
