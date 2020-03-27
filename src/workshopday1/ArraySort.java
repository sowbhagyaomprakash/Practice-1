package workshopday1;

public class ArraySort {
	
	public static void main(String[] args)
	{
	
    int arr[] = {4,5,6,2,1,8,10,9,7,3};
	SortNum obj= new SortNum();
	obj.sort(arr);
		System.out.println("Sorted Array" );
	//	for(int i=0;i<10 ;i++)
		//		System.out.println(arr[i]);
	}
}

class SortNum{
	void sort(int[] arr) {
		
		int i=0,j=arr.length-1,k=0;
		while(i<j)
		{			
			  if(arr[i] > arr[j]){
				  k=arr[i];
				  arr[i]=arr[j];
				  arr[j]=k;
				  i++;
			  }else{
			
				  
			  }
	}
	
		System.out.println("Sorted array");
		for(int m=0;m<10;m++)
		{
			System.out.println(arr[m]);
			
		}
	}	
}
