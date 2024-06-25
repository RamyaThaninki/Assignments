package week3.day1assignment2;

public class TextField extends WebElement {
	//TextField is a Base class of WebElement
	public void getText() {
		System.out.println("getText : hbffhbijeij");

	}

	public static void main(String[] args) {
		TextField TF=new TextField();
		TF.getText();
		TF.click();
		TF.setText("Sri");

	}

}
