package week3.day1assignments;

public class LoginTestData extends TestData{
	// - enterUsername()
	// - enterPassword()
	public void enterUsername() {
		System.out.println("Username : Ramya");
	}
	public void enterPassword() {
		System.out.println("Password : *********");

	}

	public static void main(String[] args) {
		LoginTestData LTD = new LoginTestData();
		LTD.enterCredentials();
		LTD.navigateToHomePage();
		LTD.enterUsername();
		LTD.enterPassword();

	}

}
