package ques2.com.gl.dataStructureAssignment.transactionsMNC;

public class Main {

	public static void main(String[] args) {
		test(50, 30, 60, 10, 55);
	}

	public static void test(int a, int b, int c, int d, int e) {

		BSTtoSkewedConverter converter = new BSTtoSkewedConverter();
		Node root = new Node(a);
		root.left = new Node(b);
		root.right = new Node(c);
		root.left.left = new Node(d);
		root.right.left = new Node(e);

		converter.printOut(converter.flattenToSkewed(root));
	}

}
