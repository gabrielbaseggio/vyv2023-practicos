package tree;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class AvlNode implements Serializable{

	public  static final long serialVersionUID = 1;

	private /*@ nullable @*/Integer data; 
	private int height;

	private  AvlNode left;

	private  AvlNode right;

	
	public AvlNode() {}


	public String toStrings() {
		Set<AvlNode> visited = new HashSet<AvlNode>();
		visited.add(this);
		return tostring(visited);
	}

	private String tostring(Set<AvlNode> visited) {
		StringBuffer buf = new StringBuffer();
		
		buf.append(" {");
		if (left != null)
			if (visited.add(left))
				buf.append(left.tostring(visited));
			else
				buf.append("!tree");

		buf.append("" + this.tostringInfoNode() + "");
		if (right != null)
			if (visited.add(right))
				buf.append(right.tostring(visited));
			else
				buf.append("!tree");
		buf.append("} ");
		return buf.toString();
	}

	
	public String toString() {
		String res = "< ";
		res = res + getData() + ", ";
		if (this.getLeft() != null) {
			res = res + this.getLeft().toString();
		}else {
			res = res +  "null, ";
		}
		if (this.getRight() != null) {
			res = res + this.getRight().toString();
		}else {
			res = res +  " null ";
		}
		return res + " > ";
	}


	private String tostringInfoNode() {
		StringBuffer buf = new StringBuffer();
		buf.append(" (");
		buf.append("" + this.data + ",");
		return buf.toString();
	}

	
	public Integer getData() {
		return data;
	}


	public void setData(Integer data) {
		this.data = data;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public AvlNode getLeft() {
		return left;
	}


	public void setLeft(AvlNode left) {
		this.left = left;
	}


	public AvlNode getRight() {
		return right;
	}


	public void setRight(AvlNode right) {
		this.right = right;
	}
	
	
	


}

