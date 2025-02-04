package week3.day1;

import java.util.Arrays;

public class HS1_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="stops";
		String s2="potssvika";
		
		boolean b=true;
		if(s1.length()!=s2.length())
		{
			b=false;
			//System.out.println("Length is not equal,so its not a anagram : "+b);
			
		}
		else
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		    b=Arrays.equals(ch1, ch2);
			
		}
		if(b==true)
		{
			System.out.println("its a Anagram");
		}
		else
		{
			System.out.println("its not a Anagram");
		}
	}
}
