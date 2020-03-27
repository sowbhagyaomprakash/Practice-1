package sow;
//import sow.FileWorkshop;
import java.util.Scanner;

class res_count {
	static Object lock = new Object();
	static int iCount = 0;
    /*static int getInstance () {
    	
    	return iCount;
	}*/
    static int setInstance() {
    	synchronized (lock) {
			return iCount++;
		}
	}
}
class EvenThread implements Runnable {
		
	   public void run() {
		while (true) {
		int i = 0;
		try {
			Thread.sleep(5);
			 i = res_count.setInstance();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i > 100)
			break;
		
		if (i %2 == 0)
			System.out.println( "Even thread :"+i );
		}
	}
	   
}

class OddThread implements Runnable {
	public void run() {
		while (true) {
			int i = 0;
			try {
				Thread.sleep(5);
				i = res_count.setInstance();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (i > 100)
			break;
		if (i % 2 != 0)
			System.out.println( "Odd thread :"+i );
		}
	}
}
public class Workshop1 {
	
	public static void main(String[] args){
		//start Even thread
	    Thread even = new Thread(new EvenThread());
		even.start();
		// start odd thread
		Thread odd = new Thread(new OddThread());
		odd.start();
	}
}