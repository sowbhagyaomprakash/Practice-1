package sow;

public class QuickSort {
	
	static int partition(int[] arr,int low,int high){
		
		int pivot = arr[low];	// pivot as lowest element
		int i = low - 1; // index of lower element.
		for (int j=low; j<=high;j++){
			if (arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			for (int k=0; k<arr.length; k++)
				System.out.print(arr[k]);
			System.out.println();
		}			
		int temp = arr[i];
		arr[i] = arr[low];	// arr[low] is pivot
		arr[low] = temp;
		
		return i;
	}
	static void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
	     if(low < high)
	     {
	    	 int pi= partition(arr,low,high);
	    	 sort(arr, low, pi -1);
	    	 sort(arr, pi+1, high);
	     }
	}
	public static void main(String[] args) {	
		int[] arr = {1,8,5,3,9,6,2};
		int n=arr.length;
		//QuickSort qic = new QuickSort();
		sort(arr,0,n-1);
		System.out.println("---Final---");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);			
		}
	}
	
}
