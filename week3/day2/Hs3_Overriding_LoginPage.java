package week3.day2;

public class Hs3_Overriding_LoginPage extends Hs3_Overriding_BasePage {
	
	@Override
	public void performCommonTasks()
	{
		super.performCommonTasks();
		System.out.println("Perform common task from Login page class");
	}
	
	public static void main(String[] args) {
		
		Hs3_Overriding_LoginPage obj =new Hs3_Overriding_LoginPage();

		obj.performCommonTasks();
		
		Hs3_Overriding_BasePage obj1=new Hs3_Overriding_BasePage();
		obj1.clickElement();
		obj1.enterText();
		obj1.findElement();
		obj1.performCommonTasks();
	}

}
