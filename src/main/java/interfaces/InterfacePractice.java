package interfaces;

interface ITest {
	void method1();
	void method2();
}

class MyClass implements ITest {

	@Override
	public void method1() {
		System.out.println("Meth1 of class MyClass");
	}

	@Override
	public void method2() {
		System.out.println("Meth2 of class MyClass");
	}
	
	public void method3() {
		System.out.println("Meth3 of class MyClass");
	}
	
}

public class InterfacePractice {

	public static void main(String[] args) {
		ITest t = new MyClass();
		MyClass c = new MyClass();
		
		System.out.println("Object-Reference of type Interface");
		t.method1();
		t.method2();
		
		System.out.println("\nAfter cast from object reference interface to class");
		((MyClass)t).method1();
		((MyClass)t).method2();
		((MyClass)t).method3();
		
		System.out.println("\nObject-Reference of type Class");
		c.method1();
		c.method2();
		c.method3();
	}
	
}
