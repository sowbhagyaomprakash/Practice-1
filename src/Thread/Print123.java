package Thread;

import java.util.concurrent.locks.ReentrantLock;

class Foo{
	/*ReentrantLock re;
	public Foo(ReentrantLock re){	
	 this.re= re;
	}
	*/
	int num=0;
		synchronized public void first() throws InterruptedException{
		while (num !=0){
			wait();
		}
		System.out.println("First");
		num = 1;
		notifyAll();
		
	}
	synchronized public void second() throws InterruptedException{
		while(num!=1 ){
			wait();
		}
		System.out.println("Second");
		num = 2;
		notifyAll();
		
	}
	synchronized public void third() throws InterruptedException{
	
		while(num!= 2 ){
			wait();
		}
		System.out.println("Second");
		num = 3;
		notifyAll();
	}
}

class First implements Runnable{
	
	Foo obj;
	String str;
	public  First(Foo obj, String str) {
		// TODO Auto-generated constructor stub
		this.obj= obj;
		this.str = str;
		new Thread(this,str).start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				obj.first();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}

class Second implements Runnable{
	
	Foo obj;
	String str;
	public  Second(Foo obj, String str) {
		// TODO Auto-generated constructor stub
		this.obj= obj;
		this.str = str;
		new Thread(this,str).start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				obj.first();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Print123  {

	public static void main(String[] str){
		//ReentrantLock re = new ReentrantLock();
		//Foo obj = new Foo(re);
		Foo obj = new Foo();
		 new First(obj,"1");
		 new Second(obj,"2");
		 //new PrintThread(obj,"3");
		
		
	}	
}