package Basic;

 class Singlton {
	static Singlton instance =null;
	int x=10;
	
 private Singlton() {
		// TODO Auto-generated constructor stub
	System.out.println("singleton costructor");	
	}
 
	static Singlton getInstance(){
		if(instance == null) 
		{
		   instance = new Singlton();
		}
		return instance;
	}	
}

class Main
{
	public static void main(String[] str){
		Singlton obj1 = Singlton.getInstance();		
		Singlton obj2 = Singlton.getInstance();
		obj1.x= obj1.x + 100; 
		//obj2.x = obj2.x+200;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}