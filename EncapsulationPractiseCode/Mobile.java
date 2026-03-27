package EncapsulationPractiseCode;

public class Mobile {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() >= 8) {
			this.password = password;
			System.out.println("Valid User ... ! ");
		} else {
			System.out.println("Enter password greater than 8 char ");
		}

	}

}
