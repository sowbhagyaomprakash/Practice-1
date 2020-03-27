package sow;

public class MergeSort {

    static void merge(int[] arr, int l, int i, int r) {
	
			
	}
	
	static void sort(int[] arr,int l,int r){
		if(l<r)
		{
			int i=(l+r)/2;
			//sort first and second halves
			sort(arr,l,i);
			sort(arr,i+1,r);
			//merge sorted arr
			merge(arr,l,i,r);
		}
	}
	
	public static void main(String[] args){
		
		int[] arr={2,1,4,6,7,3,9};
		
		sort(arr,0,arr.length-1);
	
	}
}
