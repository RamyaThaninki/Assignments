package week3.day1assignment2;

public class RadioButton extends Button{
	//Radio Button is Subclass of Button class
	
	public void selectRadioButton() {
		System.out.println("Radio Button Selected Successfully");
	}

	public static void main(String[] args) {
		RadioButton RB=new RadioButton();
		RB.selectRadioButton();
		RB.submit();
		RB.click();
		RB.setText("Full Name");
	}

}
