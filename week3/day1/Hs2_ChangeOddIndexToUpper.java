package week3.day1;

public class Hs2_ChangeOddIndexToUpper {
	
	public String changeOddIndexUpper(String test)
	{
		char up =' ';
		//char[] charArray = test.toCharArray();
		String outPut="";
		for(int i=0;i<=test.length()-1;i++)
		{
			if(i%2!=0)
			{
				up=test.toUpperCase().charAt(i);
				//System.out.print(up);
				outPut=outPut+up;
			}
			else
			{
			  //System.out.print(test.charAt(i));
				outPut=outPut+test.charAt(i);
			}
				
			
		}
		return outPut;	

	}

	public static void main(String[] args) {
		
		Hs2_ChangeOddIndexToUpper obj = new Hs2_ChangeOddIndexToUpper();
		String changeOddIndexUpper = obj.changeOddIndexUpper("change");
		System.out.println(changeOddIndexUpper);
	}

}
