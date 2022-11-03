package NewPackage;
 
/*
This problem was asked by Google.
Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
For example, given the following Node class
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
The following test should pass:
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'


Question was originally phrased for python but has been completed in Java below and in the Node.java file.
 * 
Author: Conor Evans
 */
public class Main {

	public static void main(String[] args) {
		Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
		
		//Node node = new Node("test", new Node("left"), new Node(null));

		System.out.print(Node.fromString(node.serialize()).left().left().val().equals("left.left"));
		}
	
	
}
