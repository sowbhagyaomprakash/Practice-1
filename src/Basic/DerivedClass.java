package Basic;
 class InheritanceClass {
	 String n;
	 int i;
	public InheritanceClass() {
		// TODO Auto-generated constructor stu
		System.out.println("No arg constructor A " );
	}
	InheritanceClass(String name){
		System.out.println("Base class inheritance "+ name);
	}	
  void add(int x, int y){
	  System.out.println("ADD : "+ (x+y));
  }
 }
class DerivedClass extends InheritanceClass
{
	public DerivedClass() {
		super("name");
			System.out.println("No arg constructor B");
	}
	public DerivedClass(String name){
		//super(name,7);
		System.out.println("Derived arg Constructor called ");
	}
	 void add(int x,int y){
    System.out.println("ADD : "+(x*y));
	}
	public static void main(String[] str)
	{
		DerivedClass obj = new DerivedClass();
		obj.add(8,1);
		//InheritanceClass obj1 = new InheritanceClass("sdfds");
	}	
}