package workshopday1;

public class Subset {

	public static void main(String[] args){
		char[] set={'a','b','c'};
		printSubset(set);
	}
	static void printSubset(char[] set)
	{
		int n = set.length;
		for(int i=0;i<(1<<n);i++)
		{
			System.out.print("{");
			for(int j=0;j<n;j++)
			{
				int k = i & (1<<j);
		        
				if((k) > 0)
			     System.out.print(set[j]+" ");			
		}
			System.out.print("}");
		}
	}
}
