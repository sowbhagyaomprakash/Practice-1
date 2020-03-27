package workshopday1;
import java.io.*;
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Strplay {
	    
	public static void main(String args[] ) throws Exception {
	        //BufferedReader
	        int i=0,j=0,k=0;
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String strNoOfMobile = br.readLine();                // Reading input from STDIN
	       // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        int noOfMobile = Integer.parseInt(strNoOfMobile);
	        
	        String[][] mobileArr = new String[noOfMobile][5];
	        
	        for(i=0;i < noOfMobile;i++)
	        {	        
	        String modileDetails = br.readLine();
	        String[] strArray = modileDetails.split(" ");
	           for(j=0;j<5;j++)
	           {
	        	 mobileArr[i][j] = strArray[j];
	           }	        
	        }    	  
	        String strNoOfQues = br.readLine();
	        int noOfQues = Integer.parseInt(strNoOfQues);
	        String[][] QuesArr = new String[noOfQues][4];
	        for( i=0;i<noOfQues;i++)
	        {
	        	String purchaseDtls = br.readLine();
		        String[] strQuesArr = purchaseDtls.split(" ");
	            for(j=0;j<4;j++)
	            {
	         	   QuesArr[i][j] = strQuesArr[j];
	         	   
	         	   
	         	   
	       	    }    
	        }
	        
	        
	       /* for(i=0;i<noOfQues;i++)
	        {
	        	for(j=0;j<4;j++)
	        	{
	        		System.out.print(QuesArr[i][j]+" ");
	        	}		
	        	System.out.println(" ");
	        }*/
	         //Scanner
	         // Scanner s = new Scanner(System.in);
	         //String name = s.nextLine();                 // Reading input from
}
}
