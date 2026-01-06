package interfaces;

abstract class FunctionalAbstractClass {
	abstract public void abstractMethod1();
}

@FunctionalInterface
interface MyFunctionalInterface {
	public void abstractMethod1();
}

abstract class AbstractClass {
	abstract public void abstractMethod1();
	abstract public void abstractMethod2();
}

interface MyInterface {
	public void abstractMethod1();
	public void abstractMethod2();
}

class Testing implements MyInterface {

	@Override
	public void abstractMethod1() {
		
	}

	@Override
	public void abstractMethod2() {
		
	}

		
}

class Testing2 extends AbstractClass {

	@Override
	public void abstractMethod1() {
		
	}

	@Override
	public void abstractMethod2() {
		
	}
	
}

abstract class Test1 {
	public void method1() { 
		System.out.println("Hello");
	};
	
	public void method2() { 
		System.out.println("World");
	};
	
	abstract public void method3();
}

class Test2 extends Test1 {
	
	@Override
	public void method2() {
		System.out.println("Mars");
	}

	@Override
	public void method3() {
		
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
	
		Test2 test2 = new Test2();
		
		test2.method1();
		test2.method2();
		
		MyFunctionalInterface myClass = () -> {
			System.out.println("Hi");
		};
		
		// Polymorphism
		MyInterface myInterface = new Testing();
		AbstractClass myAbstractClass = new Testing2();
		
	}
	
}



