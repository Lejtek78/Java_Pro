package unit_testing.model;

public class User {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String uuid;
	private String password;
	private String repeatPassword;
	
	public User(String firstName, String lastName, String email, String uuid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.uuid = uuid;
	}

	public String getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getUuid() {
		return uuid;
	}

	public String getPassword() {
		return password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}
	
}
