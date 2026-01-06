
class Data<T> {
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}

class MyArray<T> {
	T[] dataArray = (T[]) new Object[10];
	int length = 0;
	
	public void append(T data) {
		dataArray[length++] = data; 
	}
	
	public void display() {
		for (int i = 0; i < length; i++) {
				System.out.print(dataArray[i]);
		}
		System.out.println();
	}
}

class MyArray2<T extends Number> {
	T[] dataArray = (T[]) new Object[10];
	int length = 0;
	
	public void append(T data) {
		dataArray[length++] = data; 
	}
	
	public void display() {
		for (int i = 0; i < length; i++) {
				System.out.print(dataArray[i]);
		}
		System.out.println();
	}
}

class MyMapArray<K, V> {
	int arraySize = 10;
	int counter = 0;
	private K[] myKey = (K[]) new Object[arraySize];
	private V[] myValue = (V[]) new Object[arraySize];
	
	public MyMapArray() {
		
	}
	
	public MyMapArray(K myKey, V myValue) {
		this.myKey[counter] = myKey;
		this.myValue[counter++] = myValue;
	}
	
	public void add(K myKey, V myValue) {
		this.myKey[counter] = myKey;
		this.myValue[counter++] = myValue;
	}
	
	@Override
	public String toString() {
		String info = "MyMapArray{ ";
		
		for (int i = 0; i < counter; i++) {
			info += ("key=" + myKey[i] + ",value=" + myValue[i]);
			if (i < counter - 1)
				info += ", ";
		}
		
		info += " }\n";
		
		return info;
	}
}

public class GenericDemo {	
	
	public static void main(String[] args) {
	
		Data<String> data = new Data<String>();
		data.setData("Hello World!");
		System.out.println(data.getData());
		
		Data<Integer> intData = new Data<>();
		intData.setData(10);
		System.out.println(intData.getData());
		
		MyArray<String> myArray = new MyArray<>();
		myArray.append("Hello");
		myArray.display();
		myArray.append("World");
		myArray.display();
		myArray.append("How");
		myArray.display();
		myArray.append("Are");
		myArray.display();
		myArray.append("You");
		myArray.display();
		
		MyArray myNewArray = new MyArray();
		myNewArray.append("Hi");
		myNewArray.display();
		myNewArray.append("There");
		myNewArray.display();
		myNewArray.append(10);
		myNewArray.display();
	
		MyMapArray<String, Integer> myMap = new MyMapArray<>();
		myMap.add("Marco", 12);
		myMap.add("Monica", 18);
		System.out.println(myMap);
		
		MyArray2<Integer> myNumberArray = new MyArray2<>();
		
		
	}

	/*
	public void badCodeWithoutGeneric() {
		Object obj = new String("Hello World!");
		System.out.println(obj);
		
		String str = (String) obj;
		System.out.println(str);
		
		obj = new Integer(10);
		System.out.println(obj);
		
		str = String.valueOf(obj);
		System.out.println(str);
		
		Object arrayObj[] = new Object[3];
		
		arrayObj[0] = "hi";
		arrayObj[1] = "bye";
		arrayObj[2] = new Integer(10);
		
		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
//		String elementStr = "";		
//		for (int i = 0; i < arrayObj.length; i++) {
//			elementStr = (String)arrayObj[i];
//		}
	}
	*/
}
