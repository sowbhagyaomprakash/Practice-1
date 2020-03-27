package sow;

class Node {
	int data;
	Node next;
	Node prev;
	
	private Node(){
		// no implementation
	}
	
	Node(int val){
		this.data = val;
	
	}
}
	
public class Linkedlist {
	
	Node head = null;
	Node cur=null;
	Node temp=null;
	Node prev=null;
	Node next = null;
	
	void push(int num)
	{
		if (head == null ){
			head = new Node(num);
		} else {
			Node temp = head;
			while(temp.next!= null) {
				temp = temp.next;
			}
			Node new_node = new Node(num);
			temp.next = new_node;
		}
	}
	
   void printList()
   {
	   Node node = head;
	   while(node!=null)
	   {
		   System.out.println(node.data);
		   node=node.next;
	   }
   }
   void reverse()
   {
	    cur = head;
	    prev = null;
	    
	   while(cur!= null){
		   next = cur.next;
		   cur.next = prev;
		   prev = cur;
		   cur = next;
	   }
	   head = prev;
	   
   }
   
   void deleteNth(int level){
	    temp = head;
	   prev =null;
	   int count = 1;
	   
	   while(temp != null) {
		   if (level == 1){
			   head = head.next;
			   break;
		   }
		   
		   if (count == level){
			   prev.next = temp.next;
			   break;
		   }
		   prev = temp;
		   temp = temp.next;
		   count++;
	   }
	   
   }
   
   void insertAtNth(int level, int value) {
	 int count =1;
	 if(level == 1)
	{
	 temp = new Node(value);
	 temp.next = head;
	 head = temp;
	 }
	else {
	 while(temp!=null){
		 prev= temp;
		 temp=temp.next;
         next = temp.next;		
		 count++;
		if(count == level)
		{
				
		}
       }
	 }
   }
   
   public void reverse(Node node){
	   if (node.next != null){
		   reverse(node.next);
		   node.next = node;
	   } else {
		   head = node;
		   node.next = ;
	   }
	   
   }
	public static void main(String[] args)
	{
		Linkedlist linkedlist = new Linkedlist();
		for(int i=0;i<8;i++)
	        linkedlist.push(i);
		
		// linkedlist.printList();		
		// linkedlist.reverse();
		linkedlist.reverse(linkedlist.head);
		// linkedlist.deleteNth(4);
		// linkedlist.insertAtNth(1, 9);
		linkedlist.printList();		
		
	}
}