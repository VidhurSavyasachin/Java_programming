
public class BinarySearchTree {
	public static void main(String[] args) {
		Tree intree = new Tree();
		intree.insert(25);
		intree.insert(20);
		intree.insert(15);
		intree.insert(27);
		intree.insert(30);
		intree.insert(29);
		intree.insert(26);
		intree.insert(22);
		intree.insert(32);
		intree.TraverseInOrder();
		System.out.println();
		System.out.println(intree.get(99));
		System.out.println(intree.max());
		System.out.println(intree.min());
	}
}
