import java.util.Comparator;
import java.util.List;

public class MyTree<E extends Comparable>
{
	private Node<E> root;
	
	public MyTree()
	{
	
	}
	
	public MyTree(List<E> arr)
	{
	}
	
	// duyệt theo đệ quy
	
	// in order
	public void inOrder(Node<E> curr)
	{
		if (curr != null)
		{
			inOrder(curr.getLeft());
			System.out.println(curr.getData());
			inOrder(curr.getRight());
		}
	}
	
	// post order
	public void postOrder(Node<E> curr)
	{
		if (curr != null)
		{
			postOrder(curr.getLeft());
			postOrder(curr.getRight());
			System.out.println(curr.getData());
		}
	}
	
	// pre order
	public void preOrder(Node<E> curr)
	{
		if (curr != null)
		{
			System.out.println(curr.getData());
			preOrder(curr.getLeft());
			preOrder(curr.getRight());
		}
	}
	
	// breadth-first order
	public void breadthFirstOrder(Node<E> curr)
	{
		int height = heightOfTree(curr);
		
		for (int i = 1; i <= height; i++)
		{
			System.out.print("Level " + i + " : ");
			printSingleLevelRecursively(curr, i);
			System.out.println();
		}
		
	}
	
	private void printSingleLevelRecursively(Node<E> root, int i)
	{
		if (root == null)
		{
			return;
		}
		if (i == 1)
		{
			System.out.print(root.getData() + " ");
		}
		else if (i > 1)
		{
			printSingleLevelRecursively(root.getLeft(), i - 1);
			printSingleLevelRecursively(root.getRight(), i - 1);
		}
	}
	
	private int heightOfTree(Node<E> curr)
	{
		if (curr == null)
		{
			return 0;
		}
		int heightLeft = heightOfTree(curr.getLeft());
		int heightRight = heightOfTree(curr.getRight());
		return Math.max(heightLeft, heightRight) + 1;
	}
	
	
}
