package interfaces.callback;

public class Store {

	Member[] mem = new Member[100];
	int count = 0;
	
	void register(Member m) {
		mem[count++] = m;
	}
	
	void inviteSale() {
		for (int i = 0; i < count; i++) {
			mem[i].callback();
		}
	}
	
}
