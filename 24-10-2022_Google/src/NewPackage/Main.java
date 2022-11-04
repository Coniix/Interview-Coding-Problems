package NewPackage;

/*
This problem was asked by Google.
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
Given the root to a binary tree, count the number of unival subtrees.
For example, the following tree has 5 unival subtrees:
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1


Author: Conor Evans
 */
public class Main {
	
	public static void main(String[] args)
	{
		Node node = new Node(0, new Node(1), new Node(0, new Node(1, new Node(1), new Node(1)), new Node(0)));

		System.out.println(node.toString(0));
		System.out.println(node.countUnival(node));

	}
}
