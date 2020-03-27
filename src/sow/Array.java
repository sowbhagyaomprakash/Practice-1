package sow;

import java.util.Scanner;

/**
 * TODO: Document me!
 *
 * @author osowbhagya
 *
 */
public class Array {
    public static void main(String[] str)
    {
    int count=1,maj_no=0, i,j,k;
    Scanner in = new Scanner(System.in);
    System.out.println("enter a no");    
     i=in.next();
    System.out.println("Enter array elements");
    int arr[]= new int[i];
    for (j=0;j<i;j++)
    {
        k = in.nextInt();
        arr[j]=k;
    }
    
    /*for(int arr1 : arr)
    {
        System.out.print(arr1+ " ");
    }*/
    for(i=1;i<arr.length;i++)
    {
       if(arr[maj_no] == arr[i])
       {
         count++;  
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
    count=0;
    for(i=0;i<arr.length;i++)
    {
        if(arr[maj_no]==arr[i])
        {
            count++;
        }
    }
    j=(arr.length/2);
    if(count >= j) 
    {
        System.out.println("majourity element found:"+arr[maj_no]);
    }
    else
    {
      System.out.println("not found");            
    }    
  }
}
