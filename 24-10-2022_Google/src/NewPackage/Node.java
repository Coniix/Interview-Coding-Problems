package NewPackage;
import java.util.*;

public class Node {

	  private int val;
	  private Node left;
	  private Node right;

	  public Node (int val, Node left, Node right) {

	    this.val = val;
	    this.left = left;
	    this.right = right;

	  }
	  public Node (int val, Node left) {
		    this.val = val;
		    this.left = left;
		    this.right = null;
		  }

	  public Node (int val) {
	    this.val = val;
	    this.left = null;
	    this.right = null;
	  }

	  public Node left() { return this.left; }

	  public Node right() { return this.right; }

	  public int val() { return this.val; }
	  
	  public String serialize() {
		    return toString(0);
	  }

	  public String toString (int indent) {

	    String spacer = "  ";
	    String bump = String.join("", Collections.nCopies(indent, spacer));

	    StringBuilder sb = new StringBuilder(bump);
	    sb.append("Node: ");

	    bump = bump + spacer;

	    if (val == 0) {
	      sb.append(val);

	    } else {
	      sb.append(val);
	    }

	    if (this.left != null) {
	      sb.append("\n");
	      sb.append(this.left.toString(indent+1));
	    }

	    if (this.right != null) {
	      sb.append("\n");
	      sb.append(this.right.toString(indent+1));
	    }

	    return sb.toString();

	  }
	  
	public int countUnival(Node root) {
		int totalCount = 0;

		if(root == null) {
			return 0;
		}
		
		totalCount += countUnival(root.left) + countUnival(root.right);
		
		if(isUnival(root)) {
			totalCount += 1;
		}
				
		return totalCount;
	}
	
	public boolean isUnival(Node root) {

		if(root == null) {
			return true;
		}
		
		if(root.left != null && root.left.val != root.val) {
			return false;
		}
		
		if(root.right != null && root.right.val != root.val) {
			return false;
		}
		
		if(isUnival(root.left) && isUnival(root.right)) {
			return true;
		}
		
		return false;
	}
}

