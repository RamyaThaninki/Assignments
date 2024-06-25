package week3.methodoverridingassignment;

public class BasePage {
	// findElement(), clickElement(), enterText() and performCommonTasks()
	//Created methods
	public void findElement() {
		System.out.println("Find Element using Xpath");
	}
	public void clickElement() {
		System.out.println("Click the Element");
	}
	public void enterText(String Text) {
		System.out.println("Entered Text is :" + Text);
	}
	public void performCommonTasks() {
		System.out.println("Performing common task");
	}
	public static void main(String[] args) {
		BasePage BP=new BasePage();
		BP.findElement();
		BP.clickElement();
		BP.enterText("Dispalyed required data");
		BP.performCommonTasks();
	}

}
