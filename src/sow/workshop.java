package sow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Handler;

public class workshop {

	public static void main(String str[])
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("input no:");
		int noOfStud= input.nextInt();
		int noOfPair= input.nextInt();
		
		System.out.println("noOfStud: "+ noOfStud +"noOfPair :"+ noOfPair);
		
		HashMap<Integer,String> map = new HashMap<>();
		
		System.out.println("map:-"+map);
	    for(int i=0;i<noOfPair;i++)
	    {
	    String val1 = input.next();
	    String val2 = input.next();
	    
	    map.put(i, val1+" "+val2);		
	    
	    System.out.println("map:-"+map);   
	    }	
	    //System.out.println("map:-"+map);
	}
}
