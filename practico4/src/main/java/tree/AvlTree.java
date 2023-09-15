package tree;


import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;
import korat.finitization.IClassDomain;

//Authors: Marcelo Frias

/**
 * @Invariant all x: AvlNode | x in this.root.*(left @+ right) @- null => 
 * (
 *		(x !in x.^(left @+ right)) && 
 *		(all y: AvlNode | (y in x.left.*(left @+ right) @-null) => y.element < x.element ) && 
 *		(all y: AvlNode | (y in x.right.*(left @+right) @- null) => x.element < y.element ) && 
 *		(x.left=null && x.right=null => 
 *				x.height=0) && 
 *		(x.left=null && x.right!=null => 
 *				x.height=1 && x.right.height=0) && 
 *		(x.left!=null && x.right=null => 
 *				x.height=1 && x.left.height=0) && 
 *		(x.left!=null && x.right!=null => 
 *				x.height= (x.left.height>x.right.height ? 
 *		x.left.height : x.right.height )+1 && ( 
 *		(x.left.height > x.right.height ? 
 *		x.left.height - x.right.height : 
 *		x.right.height - x.left.height ))<=1));
 */
public class AvlTree implements Serializable{

	public  static final long serialVersionUID = 1;

	private  AvlNode root;

	private int size;


	public String toString() {

		String res = this.size + "[ ";

		if (root != null) {
			res = res + root.toString();
		}
		res = res + " ]";
		return res;
	}

	/**
	 * @Ensures
	 *	(some n: AvlNode | n in this.nodes && n.data = value) <=> return = true;
	 */
	boolean contains(Integer value) {
		AvlNode current = root;
		while (current != null && current.getData().compareTo(value) != 0) {
			if (value.compareTo(current.getData())<0)
				current = current.getLeft();
			else
				current = current.getRight();
		}
		if (current == null)
			return false;
		else { 
			if (current.getData().compareTo(value) ==0)
				return true;
		}
		return true;
	}

	/**
	 * @Modifies_Everything
	 * 
	 * @Requires
	 *	value != null &&
	 *	freshNode !in this.nodes &&
	 *	freshNode != null &&
	 *	freshNode.left = null &&
	 *	freshNode.right = null;
	 *
	 * @Ensures
	 *	((some n: AvlNode | n in @old(this.nodes) && n.data = value && (
	 *		( this.nodes = @old(this.nodes) )
	 *	)) &&
	 *	((no n: AvlNode | n in @old(this.nodes) && n.data = value) => (
	 *		( this.nodes = ( @old(this.nodes) @+ freshNode ) ) &&
	 *		( freshNode.data = value )
	 *	));
	 */
	public void insert(Integer value) {
		AvlNode freshNode = new AvlNode(); 
		try {
			freshNode.setData(value);
			root = insert(root, freshNode);
			size++;
		}
		catch (RuntimeException e) {}
	}

	private AvlNode insert(AvlNode node, AvlNode freshNode) {
		if (node == null) {
			node = freshNode;
		} else if (freshNode.getData().compareTo(node.getData()) < 0)
			node.setLeft(insert(node.getLeft(), freshNode));
		else if (freshNode.getData().compareTo(node.getData()) > 0)		
			node.setRight(insert(node.getRight(), freshNode));
		else throw new RuntimeException();
		return restoreBalance(node);
	}

	/**
	 * @Modifies_Everything
	 * 
	 * @Requires
	 *	value != null;
	 *
	 * @Ensures
	 * 	(all n: AvlNode | (n in this.nodes <=> (n in @old(this.nodes) && n.data != value)));
	 */
	public void delete(Integer value) {
		AvlNode[] nodes = { null, null };
		root = delete(root, value, nodes);
	}

	private AvlNode delete(AvlNode node, Integer value, AvlNode[] nodes) {	
		if (node == null) 
			return null;
		nodes[1] = node;
		if (value.compareTo(node.getData()) < 0) {
			node.setLeft(delete(node.getLeft(), value, nodes));
		} else {
			nodes[0] = node;
			node.setRight(delete(node.getRight(), value, nodes));
		}
		if (node == nodes[1]) {
			if (nodes[0] != null && nodes[0].getData().equals(value)) {
				if (nodes[0] == nodes[1]) {
					node = node.getLeft();
				} else {
					nodes[0].setData(node.getData());
					node = node.getRight();
				}
				size--;
			}
		} else {
			node = restoreBalance(node);
		}
		return node;
	}

	/**
	 * @Ensures
	 *	return = #(this.nodes)
	 */
	int size() {
		if (!repOK())
			return -1;
		return size;
	}



	private AvlNode restoreBalance(AvlNode node) {
		int l_Height = node.getLeft()  == null ? 0 : node.getLeft().getHeight();
		int r_Height = node.getRight() == null ? 0 : node.getRight().getHeight();

		if (l_Height > r_Height) {
			int ll_Height = node.getLeft().getLeft()  == null ? 0 : node.getLeft().getLeft().getHeight();
			int lr_Height = node.getLeft().getRight() == null ? 0 : node.getLeft().getRight().getHeight();
			if (ll_Height < lr_Height)
				node.setLeft(rotateLeft(node.getLeft()));
			node = rotateRight(node);

		} else if (l_Height < r_Height){
			int rl_Height = node.getRight().getLeft()  == null ? 0 : node.getRight().getLeft().getHeight();
			int rr_Height = node.getRight().getRight() == null ? 0 : node.getRight().getRight().getHeight();
			if (rl_Height > rr_Height)
				node.setRight(rotateRight(node.getRight()));
			node = rotateLeft(node);
		}

		fixHeights(node);
		return node;
	}

	private AvlNode rotateLeft(AvlNode node) {
		AvlNode r_node = node.getRight();
		AvlNode rl_node = r_node.getLeft();
		r_node.setLeft(node);
		node.setRight(rl_node);
		fixHeights(node);
		fixHeights(r_node);
		return r_node;
	}

	private AvlNode rotateRight(AvlNode rt) {
		AvlNode l_node = rt.getLeft();
		AvlNode lr_node = l_node.getRight();
		l_node.setRight(rt);
		rt.setLeft(lr_node);
		fixHeights(l_node);
		fixHeights(rt);
		return l_node;
	}

	private void fixHeights(AvlNode node) {
		int leftHeight = node.getLeft() == null ? 0 : node.getLeft().getHeight();
		int rightHeight = node.getRight() == null ? 0 : node.getRight().getHeight();
		node.setHeight(1 + (leftHeight > rightHeight ? leftHeight : rightHeight));
	}



	//******************************************************
	//***** From now on functions for checking the repOk ***
	//******************************************************

	/***Breadth first KORAT-TUNNEADO*/
	public boolean repOK() {
		// checks that empty tree has size zero
		if (root == null)
			return size == 0;
		// checks that the input is a tree
		if (!isAcyclic())
			return false;
		// checks that data is ordered
		if (!isOrdered(root))
			return false;
		// checks that size is consistent
		if (numNodes(root) != size)
			return false;
		if(!isBalanced())
			return false;
		return true;
	}


	private boolean isBalanced(){
		LinkedList<AvlNode> queue = new LinkedList<AvlNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			AvlNode current = (AvlNode) queue.removeFirst();
			int l_Height = current.getLeft() == null ? 0 : current.getLeft().getHeight();
			int r_Height = current.getRight() == null ? 0 : current.getRight().getHeight();
			int difference = l_Height - r_Height;
			if (difference < -1 || difference > 1)
				return false; // Not balanced.
			int max = l_Height > r_Height ? l_Height : r_Height;
			if (current.getHeight() != 1 + max)
				return false; // Wrong height.
			if (current.getLeft() != null) {
				queue.add(current.getLeft());
			}
			if (current.getRight() != null) {
				queue.add(current.getRight());
			}
		}
		return true;


	}

	private boolean isAcyclic() {
		Set<AvlNode> visited = new HashSet<AvlNode>();
		visited.add(root);
		LinkedList<AvlNode> workList = new LinkedList<AvlNode>();
		workList.add(root);
		while (!workList.isEmpty()) {
			AvlNode current = (AvlNode) workList.removeFirst();
			if (current.getLeft() != null) {
				// checks that the tree has no cycle
				if (!visited.add(current.getLeft()))
					return false;
				workList.add(current.getLeft());
			}
			if (current.getRight() != null) {
				// checks that the tree has no cycle
				if (!visited.add(current.getRight()))
					return false;
				workList.add(current.getRight());
			}
		}
		return true;
	}


	private int numNodes(AvlNode n) {
		if (n == null)
			return 0;
		return 1 + numNodes(n.getLeft()) + numNodes(n.getRight());
	}




	private boolean isOrdered(AvlNode n) {
		return n == null || isOrdered(n, null, null);
	}

	private boolean isOrdered(AvlNode n, Integer min, Integer max) { 	
		if (n.getData() == null)
			return false;

		if ((min != null && n.getData().compareTo(min)<=0) ||
				(max != null && n.getData().compareTo(max)>=0))
			return false;
		if (n.getLeft() != null)
			if (!isOrdered(n.getLeft(), min, n.getData()))
				return false;
		if (n.getRight() != null)
			if (!isOrdered(n.getRight(), n.getData(), max))
				return false;
		return true;
	}




	//******************************************************
	//***** From now on functions for checking the repOk ***
	//******************************************************

	public boolean repOK_2() { 

		LinkedList<AvlNode> allNodes = new LinkedList<AvlNode>();
		HashSet<Integer> allData = new HashSet<Integer>();
		LinkedList<AvlNode> stack = new LinkedList<AvlNode>();

		if (root != null)
			stack.push(root);

		while (!stack.isEmpty()) {
			AvlNode node = stack.pop();
			if (!allNodes.add(node))
				return false; // Not acyclic.
			if (node.getData() == null)
				return false; // Null data.
			if (!allData.add(node.getData()))
				return false; // Repeated data.
			if (node.getLeft() != null)
				stack.push(node.getLeft());
			if (node.getRight() != null)
				stack.push(node.getRight());
		}

		if (!isOrdered_1(root))
			return false;
		AvlNode node = null;
		for(int i = 0; i<allNodes.size();i++){
			node = allNodes.get(i);	
			int l_Height = node.getLeft() == null ? 0 : node.getLeft().getHeight();
			int r_Height = node.getRight() == null ? 0 : node.getRight().getHeight();
			int difference = l_Height - r_Height;
			if (difference < -1 || difference > 1)
				return false; // Not balanced.
			int max = l_Height > r_Height ? l_Height : r_Height;
			if (node.getHeight() != 1 + max)
				return false; // Wrong height.
		}

		if (allNodes.size() != size)
			return false; // Wrong size.

		return true;
	}

	private boolean isOrdered_1(AvlNode n) {
		return n == null || isOrdered_1(n, null, null);
	}

	private boolean isOrdered_1(AvlNode n, Integer min, Integer max) { 	
		if (n.getData() == null)
			return false;

		if ((min != null && n.getData().compareTo(min)<0) ||
				(max != null && n.getData().compareTo(max)>0))
			return false;

		if (n.getLeft() != null)
			if (!isOrdered_1(n.getLeft(), min, n.getData()))
				return false;
		if (n.getRight() != null)
			if (!isOrdered_1(n.getRight(), n.getData(), max))
				return false;
		return true;
	}


	/**
	 *  To generate AvlTrees that have a given number of nodes, the Korat
	 *  search algorithm uses the ﬁnitization method.
	 *  In this method we specify bounds on th number of objects to be used to 
	 *  construct instances of the data structure, as well as possible values 
	 *  stored in the ﬁelds of those objects.
	 */
	 	public static IFinitization finAvlTree(int numAvlNode, int minSize,
			int maxSize,int numData) throws Exception {

		IFinitization f = FinitizationFactory.create(AvlTree.class);

		IObjSet entry = f.createObjSet(AvlNode.class, numAvlNode);
		entry.setNullAllowed(true);

		IIntSet sizes = f.createIntSet(minSize, maxSize);

		IIntSet height = f.createIntSet(0, numAvlNode);

		IObjSet elems = f.createObjSet(Integer.class);
		IClassDomain elemsClassDomain = f.createClassDomain(Integer.class);
		elemsClassDomain.includeInIsomorphismCheck(false);
		for (int i = 1; i <= numData; i++)
			elemsClassDomain.addObject(new Integer(i));
		elems.addClassDomain(elemsClassDomain);
		elems.setNullAllowed(false); //not null allowed

		f.set("root", entry);
		f.set("size", sizes);
		f.set(AvlNode.class, "data", elems);
		f.set("AvlNode.height", height);        
		f.set("AvlNode.left", entry);
		f.set("AvlNode.right", entry);

		return f;

	}	


}
