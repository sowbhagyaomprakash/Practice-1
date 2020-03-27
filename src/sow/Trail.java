package sow;

import java.util.Scanner;

public class Trail {
	public static void main(String[] args)
	{
		int count=1,maj_no=0, i,j=0,k=0;
	    Scanner in = new Scanner(System.in);
	    System.out.println("enter a no");    
	    i=in.nextInt();
	    System.out.println("Enter array elements");
	    int arr[]= new int[i];
	    
	    for (j=0;j<i;j++)
	    {
	        k = in.nextInt();
	        arr[j]=k;
	    }
	    int len = j/2;
	    int arr1[] = new int[len];
	    for(i=1;i<arr.length;i++)
	    {
	    	k=0;
	    	int arr3 = arr[maj_no];
	    	int arr4= arr[i];
	       if(arr3 == arr4)
	       {
	       
	    	   count++;
	         //if(count >= len)
	         //{
	        //	 arr1[k] = arr[maj_no];
	        //	 k++;
	         //}
	       }
	       else
	           {
	             count--;
	           } 
	           if(count==0)
	           {
	               count=1;
	               maj_no=i;
	           }         
        }	 
	    //for(int arr2 :arr1)
	    //System.out.println(arr2);
	    System.out.println(arr[maj_no]);
   }
}