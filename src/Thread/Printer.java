package Thread;

public class Printer {
	
	static Thread t1 = new Thread(new PrintEven());
	static Thread t2 = new Thread(new PrintOdd());

	public static void main(String[] args)
	{		
	t1.start();
	t2.start();
	}
}
class PrintEven implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i+=2)
		{
			System.out.println("even no "+i);
		    Printer.t1.
		}
	}
}
class PrintOdd implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i+=2)
		{
			System.out.println("odd no "+i);
		}
	}
}