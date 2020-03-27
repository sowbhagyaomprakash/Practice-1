package sow;
import java.util.*;
public class stakex {
	public static void main(String[] args)
	{
        int i;
		Stack name= new Stack();		
	    String str="{(1+2)(3-9)}";
	for (i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if (ch == '(' || ch == '[' || ch == '{')  { name.push(ch); }
		else if(ch == ']' || ch == '}' || ch == ')')
		{
			if(name.isEmpty())
			{
				System.out.println("not balanced");
	            i=0;
				break;
			}
          //if((char)name.peek()== '(' && ch == ')' || (char)name.peek()== '{' && ch == '}' || (char)name.peek()== '[' && ch == ']')
          if((char)name.pop() != ch)
		{
        	 break;   	      	  
        }
         /* else {
        	  System.out.println("not balanced");
        	  i=0;
        	  break;
		}	*/
	  }
     }
	if(name.isEmpty()) 
	{
		System.out.print("Balanced");	
	}
	else
	{
		System.out.print("not balanced");
	}
   }
}