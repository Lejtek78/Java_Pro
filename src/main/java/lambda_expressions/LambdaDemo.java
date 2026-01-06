package lambda_expressions;

@FunctionalInterface
interface MyLambda {
	public void display();
}

class My implements MyLambda {
	@Override
	public void display() {
		System.out.println("Hello World");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		My m = new My();
		m.display();

		MyLambda m2 = new My();
		m2.display();

		MyLambda m3 = new MyLambda() {
			@Override
			public void display() {
				System.out.println("Hello Mars");
			}
		};

		m3.display();

		MyLambda m4 = () -> {
			System.out.println("Hello Venus");
		};

		m4.display();
		
	}
	
}
