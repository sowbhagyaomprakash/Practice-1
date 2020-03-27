package workshopday1;

import java.io.*;
import java.util.Scanner;

public class KKCrush {
	
	    public static void main(String args[] ) throws Exception {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String strTestCase = br.readLine();                // Reading input from STDIN
	        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
            int noOfTestCase = Integer.parseInt(strTestCase);
            
            for(int i=0 ;i < noOfTestCase ;i++)
            {
            	String strArrSize = br.readLine();
            	int intArr = Integer.parseInt(strArrSize);         	
                
            	String inputArray = br.readLine();
                String[] strArray = inputArray.split(" ");
                
                Scanner intQues = new Scanner(System.in);
                int noOfQues = intQues.nextInt();
                
                for(int j=0;j<noOfQues;j++)
                {
                	String quesNum = br.readLine();
                	int k = 0;
                	boolean flag = false;
                	while(k < strArray.length ) {
                		if (strArray[k].equals(quesNum)){
                			flag = true;
                			break;
                		} 
                		k++;
                	}
                	if (flag)
            			System.out.println("YES");
                	else
                		System.out.println("NO");
        		}
             }  
	    }
	}