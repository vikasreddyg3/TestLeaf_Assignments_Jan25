package week3.day1;

import java.util.Arrays;

public class PrintDuplicatesNumbers {

	public static void main(String[] args) {
		
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicate number is : "+num[j]);
				}
			}
		}
		
		int data[]={4, 5, 6, 6, 5, 9, 4, 3};
		Arrays.sort(data);
		
		for(int i=0;i<data.length-1;i++)
		{
			if(data[i]==data[i+1])
			{
				System.out.println("Duplicate number is :"+data[i]);
			}
		}
		
		

	}

}
