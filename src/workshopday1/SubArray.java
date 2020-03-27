package workshopday1;

import java.io.*;

public class SubArray {
	
	public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String noOfCases = br.readLine();
	 int iArrVal;
	 for(int i=0;i< Integer.parseInt(noOfCases);i++)
     {
    	 String  noOfDistinctNumber = br.readLine();                 // Reading input from STDIN
         int iNumbers = Integer.parseInt(noOfDistinctNumber);
         int[] iArr = new int[iNumbers];
         for(int j=0;j<iNumbers;j++){
        	 iArr[i] = br.read();
             System.out.println(iArr[i]);
         }
     }	
	}
}
