package sow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rev {
	    public static void main(String[] args) {
	        StringBuilder input;
	        System.out.println("Enter the input string");
	        try
	        {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            input = br.readLine();
	            System.out.println(input);
	            char[] try1= input.toCharArray();
	            System.out.println(try1);
	            for (int i=try1.length-1;i>=0;i--)
	            System.out.print(try1[i]);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}

