public class Main
{
	public static void main(String[] args)
	{
		
		MyTree<Integer> numbers = new MyTree<>();
		
		Node<Integer> root = new Node<>();
		root.setData(4);
		
		Node<Integer> left1 = new Node<>();
		left1.setData(2);
		Node<Integer> right1 = new Node<>();
		right1.setData(6);
		Node<Integer> left2 = new Node<>();
		left2.setData(1);
		
		Node<Integer> rightLeft2 = new Node<>();
		rightLeft2.setData(5);
		Node<Integer> rightRight2 = new Node<>();
		rightRight2.setData(10);
		
		Node<Integer> leftLeftLeft3 = new Node<>();
		leftLeftLeft3.setData(-1);
		left2.setLeft(leftLeftLeft3);
		root.setLeft(left1);
		root.setRight(right1);
		
		left1.setLeft(left2);
		
		right1.setLeft(rightLeft2);
		right1.setRight(rightRight2);
		
		numbers.inOrder(root);
		/**
		 *          root                       4
		 *          /  \                     /  \
		 *      left1  right1               2    6
		 *       /                         /    / \
		 *   left2                        1    5  10
		 *                               /
		 *                              -1
		 * */
		
	}
}