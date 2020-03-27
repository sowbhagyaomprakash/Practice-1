
package sow;

public class MaxNum{
	public static void main(String[] agrs) {
			
		int[] arr={5,6,89,3,4,100,99};		
			int max1=arr[0],max2=arr[0],max3=arr[0];
			
				for(int i=1;i<arr.length;i++) {
					if(arr[i] < max2 && arr[i] > max3 )
							max3 = arr[i];
					else if(arr[i] < max1  && arr[i] > max2) {
						max3=max2;
						max2=arr[i];
					}
					else if (arr[i] > max1) {
						 
							max2 = max1;
							max1 = arr[i];
					}		
					
			/*if(first<arr[i]){
				first = arr[i];
			}else if(second<arr[i]){
				second = first;
				first=arr[i];
			}*/
		}
			System.out.println("max1 "+max1+" max2 "+max2+" max3 "+max3);
	}
	
	
}