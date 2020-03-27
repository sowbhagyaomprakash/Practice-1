package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

class MyLock implements Runnable {
	ReentrantLock re;
	String n;
	public MyLock(ReentrantLock re, String name) {
		this.re = re;
        this.n = name;
	}

	public void run(){
	    boolean done= false;
	    	  
	    	while(!done){
	    		//outer lock
	    		boolean b= re.tryLock();
	    
	    		if(b){
	    	  try{
	    		Date d = new Date();
	    		SimpleDateFormat ft = new SimpleDateFormat();
	    		System.out.println("task name "+n  +" outer lock aquired at "+ ft.format(d));
	    		System.out.println("Lock count "+re.getHoldCount());
	    		Thread.sleep(1500);
	    		
	    		//inner lock
	    		re.lock();
	    		try{
	    			Date date = new Date();
	    			SimpleDateFormat sft = new SimpleDateFormat();
	    			System.out.println("task name "+ n+ "inner lock aquired at "+ sft.format(date));
	    			System.out.println("lock count "+ re.getHoldCount());
	    			Thread.sleep(1500);
	    			done = true;	
	    		}
	    		catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		finally{
	    			
	    			System.out.println("Release inner lock " + n );
	    			re.unlock();
	    			System.out.println("lock count "+ re.getHoldCount());
	    		}
	    	}
	    	 catch(Exception e){
	    	   	e.printStackTrace();
	    	    }
	    	  finally{
	    		  System.out.println("Releas outer lock "+ n);
	    		  re.unlock();
	    		  System.out.println("lock count "+ re.getHoldCount());
	    	  }
	    	  
	    	  
	    	}
	    		else
	    		{
                      System.out.println("task name "+ n +" waiting for lock");
                      try{
                    	  Thread.sleep(1500);  	  
                      }
                      catch(Exception e){
                    	  e.printStackTrace();
                      }
	    		}
	    	}
	}
}

public class ReentrantEx {

	public static void main(String[] str){
	  ReentrantLock re = new ReentrantLock();
	  Thread m1= new Thread(new MyLock(re,"job1"));
	  Thread m2 =new Thread(new MyLock(re,"job2"));
	  Thread m3 = new Thread(new MyLock(re,"job3"));
	   
      m1.start();
      m2.start();
      m3.start();
	}
}