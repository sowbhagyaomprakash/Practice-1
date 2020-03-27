package Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserThreadRunnable implements Runnable{	
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
class ComputeLogRunnable implements Runnable{
	
	public static boolean stop=false;
	
	@Override
	public void run()  {
		try{
          int i=1;
          double d=0;
          while(!stop){
        	  d= Math.log(i++);
            	sleep(9);
             }
          System.out.println("the log of "+ i +" is "+ d);
		}
         
 public void end()
   {
	   stop = true;
   }	
}

public class RunnableClassImplement {
	
	public static void main(String[] str) throws InterruptedException{
		Thread userObj = new Thread( new UserThreadRunnable());
		userObj.start();
		ComputeLogRunnable obj = new ComputeLogRunnable();
		Thread logObj = new Thread(obj);
		logObj.start();
		userObj.join();
		obj.end();	
	}
}