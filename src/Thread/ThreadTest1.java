package Thread;

class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Thread 1 state "+ ThreadTest1.thrd1.getState());
	try{
	ThreadTest1.thrd1.join();
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("Thread 1 state "+ ThreadTest1.thrd1.getState());
	
	}
}

public class ThreadTest1 implements Runnable
{
    static ThreadTest1 obj=new ThreadTest1(); 
    static Thread thrd1 = new Thread(obj);
	
	public static void main(String[] args){	
		System.out.println("Thread 1 state "+thrd1.getState());
				thrd1.start();
		System.out.println("Thread 1 state "+thrd1.getState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
         ThreadTest2 obj = new ThreadTest2();
		 Thread thrd2 = new Thread( obj);
		
		System.out.println(" Thread 2 state "+ thrd2.getState());
		
		thrd2.start();
		System.out.println("Thread 2 state "+ thrd2.getState());
		System.out.println("Thread 1 state "+thrd1.getState());
		
		try{			
		thrd1.sleep(1500);
		}
		catch(InterruptedException e)
		{			
		e.printStackTrace();	
		}		

		System.out.println("Thread 2 state "+ thrd2.getState());		
		
		try{
		 thrd2.getPriority();	
		}
        catch(Exception e ){
	    e.toString();
        }
		
		try{
			thrd2.getState();
			thrd2.notify();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}