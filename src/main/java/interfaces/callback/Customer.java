package interfaces.callback;

public class Customer implements Member {

	String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	@Override
	public void callback() {
		System.out.println("OK, I will visit " + name);
	}

}
