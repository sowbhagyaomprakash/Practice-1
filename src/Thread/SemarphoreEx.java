package Thread;
import java.util.concurrent.Semaphore;

class Shared{
	static int count=0;
}

class MyThread extends Thread{
	Semaphore sem;
	String str;
	
	public MyThread(Semaphore sem , String threadName){
		super(threadName);
		this.sem = sem;
		this.str = threadName;
	}
	
	public void run()
	{	
		if(this.getName().equals("A")){
	
			System.out.println("Starting of thread "+ str);
		try {
			sem.acquire();
			
			for(int i=0;i<5;i++){
				Shared.count++;
				
			System.out.println("Count "+ Shared.count);	
			Thread.sleep(1000);
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		sem.release();
	   }
	}
		else{
		   System.out.println("Strating of thread"+ str);
		   try{
		    sem.acquire();
	    	for(int i=0 ;i<5;i++){
	    		Shared.count--;
	    		System.out.println("Count "+ Shared.count);
	    	}
		   }
		   catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   finally{
		   sem.release();
		  }	
		}
	}
}

public class SemarphoreEx {

	public static void main(String[] str) throws InterruptedException{
	
		Semaphore sem = new Semaphore(1);
		
		MyThread sem1 = new MyThread(sem, "A");
		MyThread sem2 = new MyThread(sem, "B");
		
		sem1.start();
		sem2.start();
				
		sem1.join();
		sem2.join();
		
		System.out.println("Count "+ Shared.count);
	}
}
