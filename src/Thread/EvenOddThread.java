package Thread;

import java.io.InterruptedIOException;

class PrintNumber{
	
	int i;
	boolean flag = false;
	synchronized void even(int i) {
		
		try{
			while(!flag){
				wait();
				//t.join();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.i =i;
		System.out.println("Even"+ i);
		flag = false;
		
		notify();
		
	}
	synchronized void odd(int i ){
		
		try{
			while(flag){
				wait();
		       //t.join();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.i = i;
		System.out.println("Odd"+ i);
		flag = true;
		notify();
	}
	
}

class OddEven implements Runnable{
     int num;
     PrintNumber obj;
     Thread t;
     boolean isEven;
	public OddEven(PrintNumber obj,boolean b) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
		isEven = b;
		t= new Thread(this,"");
		t.start();
	}

	@Override
	public void run() {
		
	num = isEven == true ? 2 : 1;
	while(true){
	if(isEven)
		obj.even(num);
	else
		obj.odd(num);
 
	num = num+2;
	}
 }
}

public class EvenOddThread {
	
	public static void main(String[]  str){
       PrintNumber obj = new PrintNumber();
       new OddEven(obj,true);
       new OddEven(obj,false);		
	}
}