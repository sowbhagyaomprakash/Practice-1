package sow;
public class Anagram {
public static boolean checkAnagrams(String str1, String str2) {
	boolean flag = true;
	int[] ch1 = new int[26];
	
	if(str1.length() == str2.length())
	{
		for(int i=0; i < str1.length();i++)
		{
			char c = str1.charAt(i);
			int t = c - 'a';
		    System.out.println(t);
		    ch1[t]++;	
		}
	
		for(int i =0;i<str2.length();i++)
		{
			char c = str2.charAt(i);
			int t = c - 'a';
			if (ch1[t] >= 1)
				ch1[t]--;
			else{
				flag = false;
				break;
			}
		}
	}
	else 
		return false;
	return flag;
}
public static void main(String[] args){

	String str1 = "asdfg";
	String str2 = "asdaa";
	
	if (checkAnagrams(str1, str2)) 
		System.out.println("Anagram");
	else
		System.out.println("Not an Anagram");
}
}
