package week3.day2;

public class Hs1_Elements extends Hs1_Button{
	
	public static void main(String[] args) {
		
		Hs1_Elements obj=new Hs1_Elements();
		obj.click();
		obj.setText("Vikas");
		obj.submit();
		
		Hs1_Button btn=new Hs1_Button();
		btn.click();
		btn.setText("vikas from button class obj");
		btn.submit();
		
		Hs1_CheckBoxButton checkBtn=new Hs1_CheckBoxButton();
		checkBtn.click();
		checkBtn.clickCheckButton();
		checkBtn.setText("vikas from Check Box Button class obj");
		checkBtn.submit();
	
		Hs1_RadioButton radiobtn=new Hs1_RadioButton();
		radiobtn.click();
		radiobtn.setText("Vikas from Radio Button class obj");
		radiobtn.selectRadioButton();
		radiobtn.submit();
		
		Hs1_TextField textField=new Hs1_TextField();
		textField.click();
		textField.getText();
		textField.setText("Vikas from TextField class obj");
		
		HS1_WebElementParent parent=new HS1_WebElementParent();
		parent.click();
		parent.setText("Vikas from parent class obj");
	
		
	}

}
