package sow;

public class ReversString {

	
	public static void main(String[] args){
		
		
		String statement="I like programming";
		String[] reversStr= statement.split(" ");
		String strAns = "";
		StringBuilder strAns3,strAns2;
		for (int i=reversStr.length-1;i>=0;i--)
		{
			strAns += reversStr[i] + " ";
			strAns2 = reversStr.toString();
			strAns3 = strAns2.reverse();
		}
		System.out.println(strAns);
		
	}
}
