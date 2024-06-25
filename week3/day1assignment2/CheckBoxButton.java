package week3.day1assignment2;

public class CheckBoxButton extends Button{
	//CheckBoxButton is subclass of Button class
	public void clickCheckButton() {
		System.out.println("Clicked CheckButton Successfully");
	}

	public static void main(String[] args) {
		CheckBoxButton CBB = new CheckBoxButton();
		CBB.clickCheckButton();
		CBB.submit();
		CBB.click();
		CBB.setText("Thaninki");

	}

}
