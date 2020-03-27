package Thread;

import java.io.InterruptedIOException;

class Produce implements Runnable{
Market m;
	public Produce(Market m) {
		this.m = m;
		new Thread(this,"Producer").start();
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true && i < 10){
	         m.put(i++);		
		}
	}	
}

class Consume implements Runnable{
    Market m;
	public Consume(Market m) {
		this.m = m;
		new Thread(this,"Consumer").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	   while(true)
	   {
		   m.get();
	   }
	}
}

class Market{
	int i;
	public boolean flag = false;
	synchronized void put(int i)
	{
		try{
			while(flag) {
				wait();
			}
		}
				
	 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.i = i;
		flag = true;
		System.out.println( "put "+ i);
		notify();
	}
	synchronized int get(){
		
		try{
			while(!flag) {
				wait();
			}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Got "+ i);
		flag = false;
		notify();
		return i;
	}
}
public class SyncThread {
	
public static void main(String[] args){
 
	Market m = new Market();
	new Produce(m);
	new Consume(m);
	
	}
}