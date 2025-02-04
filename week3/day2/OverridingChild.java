package week3.day2;

public class OverridingChild extends OverridingParent{
	
	public void takeSnap()
	{
		super.takeSnap();
		System.out.println("Take snap from child");
	}
	
	public static void main(String[] args) {
		
		OverridingChild or=new OverridingChild();
		or.takeSnap();
		or.reportStep();
		
		
	}

}
