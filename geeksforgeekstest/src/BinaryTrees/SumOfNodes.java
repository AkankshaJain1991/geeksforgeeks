package BinaryTrees;

class Node{
	public int data;
	public Node left;
	public Node right;
	
	public Node(int data)
	{
		this.data = data;
		left = right = null;
	}
	
	public String toString() {
        return "Node value=" + data + "";
    }
}

public class SumOfNodes {
	
	
	
	public static Node root;
	
	public int printsum(Node node)
	{
		if(node == null)
			return 0;
		
		int sum = 0;
		sum =node.data;
		sum = sum + printsum(node.left);
		sum = sum + printsum(node.right);
		System.out.println("the final sum is: "+ sum);
		return sum;
	}
	
	public void insert(int data)
	{
		root = insertNode(root, data);
	}
	
	public Node insertNode(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		else 
		{
			if(root.data>data)
			{
				root.left = insertNode(root.left, data);
			}
			else 
				root.right = insertNode(root.right, data);
		}
		return root;
	}
	
	public void display(Node root)
	{
		//System.out.println("the tree is: ");
		if(root == null)return;
		
		
		display(root.left);
		System.out.print(root.data+" ");
		display(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNodes tree = new SumOfNodes();
//		tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
		
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		
		tree.display(root);
		System.out.println();
		System.out.println(tree.printsum(root));
		

	}

}
