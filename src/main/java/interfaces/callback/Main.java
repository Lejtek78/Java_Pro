package interfaces.callback;

public class Main {

	public static void main(String[] args) {
		
		Store myStore = new Store();
		
		myStore.register(new Customer("Monica"));
		myStore.register(new Customer("Marco"));
		myStore.register(new Customer("Stefan"));
		
		myStore.inviteSale();
	}
	
}
