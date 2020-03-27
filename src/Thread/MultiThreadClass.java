package Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserThread extends Thread{	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	  BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("How do you do ?");
	   
	try {
		String	in = rd.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("What you doing? ");
	  try {
		  
		  String in = rd.readLine();
		  System.out.println(in + " Sounds like funny");
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
  }
}
class ComputeLog extends Thread{
	
	public static boolean stop=false;
	
	@Override
	public void run() {
          int i=1;
          double d=0;
          try{
          while(!stop){
        	  d= Math.log(i++);
            	sleep(9);
          }
 
          System.out.println("the log of "+ i +" is "+ d);
          }
          catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
         
   public void end()
   {
	   stop = true;
   }
	
}

public class MultiThreadClass {

	public static void main(String[] str) throws InterruptedException
	{
	Thread userObj = new UserThread();
    userObj.start();
    Thread logObj = new ComputeLog();
    logObj.start();
    userObj.join();
    ((ComputeLog) logObj).end();
	}
}

