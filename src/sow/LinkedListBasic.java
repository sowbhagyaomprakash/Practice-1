package sow;

class BasicN {
	int data;
	BasicN next = null;
	BasicN(int val){
		this.data = val;	
	}
}
public class LinkedListBasic {
BasicN head;
BasicN temp;
void push(int d){
     if(head == null)
		head = new BasicN(d);
     else
     {
    	 temp = head;   
    	 while(temp.next != null){
     		 temp = temp.next;   	         
    	 }
    	 BasicN New_node = new BasicN(d);
         temp.next = New_node;   
     }
}
void printlinkedList() {
	//sorting linked list
	//sortList();
	if(head == null){
        System.out.println("empty list");
		return;
	}
	else
	{
		temp = head;
		 while(temp != null)
		{
			System.out.print("-->"+ temp.data);
			temp= temp.next;
		}
 }
	 System.out.println();
}

void sortList(){
	if(head == null || head.next == null) return;
	BasicN current = head;
	BasicN next = head.next;
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
void reverseList(){
	
	// for 0 and 1 node.
	if(head == null || head.next == null)
		return;
	
	// for 2 node.
	if(head.next != null && head.next.next == null) {
	
		BasicN temp= head.next;
		head.next = null;
		temp.next = head;
		head = temp;	
		return;
	}
	
	// For other case.
	BasicN prev = head;
	BasicN current = head.next;
	BasicN temp =current.next;
	
	while(current.next !=null){	
		current.next =prev;
		prev=current;
		current = temp;
		temp=temp.next;
		current.next = prev;
	}
	head.next = null;
	head=current;
}
public static void main(String str[]){
	LinkedListBasic obj= new LinkedListBasic();
	int[] arr = {1,2};
	for (int i=0;i< arr.length;i++)
		obj.push(arr[i]);
	obj.printlinkedList();
	obj.reverseList();
	obj.printlinkedList();
  }
}