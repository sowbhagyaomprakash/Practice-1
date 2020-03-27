package Thread;

public class PrintEvenOdd {

	public static void main(String[] args){
		
		Print obj= new Print();
		Thread t1= new Thread(new FindEvenOdd(obj ,10, false ));
		Thread t2= new Thread(new FindEvenOdd(obj,10,true));
		t2.start();
		t1.start();
	}
}
class FindEvenOdd implements Runnable{
    Print print ;
    int max,number;
    boolean isEvenNumber;
    
	public FindEvenOdd(Print obj, int i, boolean b) {
		// TODO Auto-generated constructor stub
		this.print= obj;
		this.max= i;
		this.isEvenNumber=b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		number = isEvenNumber == true ? 2 :1;
		while(number <= max ){
			if(isEvenNumber)
				print.FindEven(number);
			else
				print.FindOdd(number);
		
		number+=2;
		}
	}
}

class Print{
	
	boolean isOdd = false;
	
synchronized void FindEven(int num){


	//while(isOdd == false){
		try{	
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	//}
	System.out.println("even "+num);
	isOdd =false;
	notifyAll();
}

synchronized void FindOdd(int num){
	
	while(isOdd == true){
		try{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	System.out.println("odd "+num);
	isOdd =true;
	notifyAll();	
}
}