package week3.day1assignment2;

public class Button extends WebElement {
	//Button is subclass of webElement
	public void submit() {
		System.out.println("Submited Successfully");
	}

	public static void main(String[] args) {
		Button B=new Button();
		B.submit();
		B.click();
		B.setText("Ramya");

	}

}
