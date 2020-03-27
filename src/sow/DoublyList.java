package sow;
import sow.Node;;

class Node1{
	
	int data;
	Node1 prev;
	Node1 next;
	
	public Node1(int data){
		this.data=data;
	
	}	
}
public class DoublyList {
    Node1 head;
    Node1 temp;
    Node1 next_head;
    
	void insert(int val){
		
		if(head==null){	
			head = new Node1(val);			
		}
		else{
			temp=head;
			
			while(temp.next != null){                			 
				temp = temp.next;			  
			}
			temp = new Node1(val);
			
		}
		
	}
	
	void printList()
	{	
	if(head == null) return;
    
	temp = head;
	while(temp.next!=null)
	{
		System.out.println(temp.data);
	 temp = temp.next;	
	}
}
	
	public static void main(String[] args){
    
		DoublyList dList = new DoublyList();
		for(int i=1;i<5;i++)
			dList.insert(i);
		
		dList.printList();
		
	}
}
