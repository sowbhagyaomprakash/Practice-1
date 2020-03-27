package workshopday1;

class Abc {
	
	static Abc obj = null;
	public int x=10;
	private Abc(){ }
	static public Abc getInstance()
	{
		if(obj ==null)
		obj = new Abc();		
	    return obj;
	}
}
public class SingletonClass{
	public static void main(String[] args){
	
	Abc a= Abc.getInstance();
	Abc b = Abc.getInstance();
	a.x = a.x+10;
	System.out.println(a.x+"  "+b.x);
	}
}
