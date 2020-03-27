package Basic;
public class Binding {
	private static int i;
	static class SuperClass{
		Binding obj = new Binding();
		  void print()
		{
			System.out.println("Super class");
		}
	}
	static class SubClass extends SuperClass{
		 void print()
		{
			System.out.println("Sub class");
		}
	}
	
public static void main(String[] args)
  {
	SuperClass A = new SuperClass();
	SuperClass B = new SubClass();
	A.print();
    B.print();
  }
}