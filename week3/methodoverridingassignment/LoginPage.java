package week3.methodoverridingassignment;

public class LoginPage extends BasePage {
	//LoginPage is subclass of BasePage class
	@Override public void performCommonTasks() {
		System.out.println("This is overrided method");
	}
	
	public static void main(String[] args) {
		LoginPage LP=new LoginPage();
		LP.findElement();
		LP.clickElement();
		LP.enterText("Ramya");
		//here performCommonTasks method is override with subclass data
		LP.performCommonTasks();
	}

}
