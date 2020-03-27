package Thread;
import java.lang.Runnable;
/*class MultiTheadDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread # "+MultiTheadDemo.currentThread().getName()+"Running'");
	}
}
public class MainThread {

	public static void main(String[] args){
	for(int i=0;i<4;i++){
		MultiTheadDemo object = new MultiTheadDemo();
		object.start();
	}
}
}*/
class MultiThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread # "+Thread.currentThread().getName()+"Running'");
	}
}
public class MainThread {
	public static void main(String[] args)
	{
		for (int i=0;i<4;i++)
		{
			 new Thread(new MultiThreadDemo()).start();
		}
	}
}