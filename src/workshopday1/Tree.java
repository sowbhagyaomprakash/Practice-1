package workshopday1;

class Node {
	
	int item;
	Node left;
	Node right;
	
	public Node(int value)
	{
		item = value;
	    left = right = null;
	}
	public Node()
	{
		left = null;
		right = null;
	}
	int get(){
		return item;
	}
}
class BinarySearchTree{
 public	Node root;
	public BinarySearchTree()
	{
		root = null;
	}
   public void insert(int data)
   {
	   Node newNode = new Node();
	   
	   
   }
}	
	

public class Tree{
    
	public static void main(String[] args)
	{
		Tree bt  = new Tree();
		bt.root= new Node(1);
	    
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);	
	}
}

