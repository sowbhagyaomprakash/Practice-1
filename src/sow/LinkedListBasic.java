package sow;

class BasicNode {
	int data;
	BasicNode next = null;
	
	BasicNode(int val){
		this.data = val;	
	}
}

public class LinkedListBasic {
BasicNode head;
BasicNode temp;

void push(int d){
		
     if(head == null)
		head = new BasicNode(d);
     else
     {
    	 temp = head;   
    	 while(temp.next != null){
     		 temp = temp.next;   	         
    	 }
    	 BasicNode New_node = new BasicNode(d);
         temp.next = New_node;   
     }
}

void printlinkedList() {
	//sorting linked list
	sortList();
	
	if(head == null)
		return;
	else
	{
		temp = head;
		 while(temp != null)
		{
			System.out.print("-->"+ temp.data);
			temp= temp.next;
		}
 }
}

void sortList(){
	
	BasicNode current = head;
	BasicNode next = head.next;
	int temp;
	while (current != null){

		while(next != null){
			
			if(current.data > next.data)
			{
	           temp = current.data;
	           current.data = next.data;
	           next.data = temp;
			}
				next = next.next;
		}
		current= current.next;
		if(current!=null){
		next = current.next;
		}
	}
}
public static void main(String str[]){
	
	LinkedListBasic obj= new LinkedListBasic();
	int[] arr = { 9,2,0,7,3,5,1,};
	
	for (int i=0;i< arr.length;i++)
		obj.push(arr[i]);
	
	obj.printlinkedList();
  }
}