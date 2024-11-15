package gitcomm;

public class Main {
	Login login=new Login();
	UserProfile up;
	public static void main(String[] args) {
		System.out.println("Welcome to the application!");
		greetUser();
	}

	public static void greetUser() {
		System.out.println("Hello, User!");
	}
	public void authenticate() {
		try {
			login.authenticate("Nehal","123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void profile() {
		up=new UserProfile("Nehal","123");
		up.displayProfile();
		}
	 
}
