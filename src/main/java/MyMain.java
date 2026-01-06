import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMain {

	public static void main(String[] args) {
		
		List<String> myStringList = new ArrayList<>();
		List<String> myStringList2 = new ArrayList<>();
		List<String> myStringList3 = new ArrayList<>();
		
		Set<String> myStringSet = new HashSet<>();
		String[] myArray = {"Hello", "You", "Are", "Lonesome", "Tonight", "You"};
		myStringSet.addAll(Arrays.asList(myArray));
		myStringSet.add("Are");
		
		System.out.println(myStringSet);
		
		myStringList.add("Hello");
		myStringList.add("World");
		
		myStringList2.add("Hi");
		myStringList2.add("Mars");
		myStringList2.add("and");
		myStringList2.add("Venus");
		
		myStringList3.add("How");
		myStringList3.add("are");
		myStringList3.add("you");
		
		myStringList.addAll(myStringList2);
		myStringList.addAll(myStringList3);
		
		System.out.println(myStringList);
		myStringList.clear();
		System.out.println(myStringList);
		System.out.println(myStringList2);
		
		myStringList2.remove("Venus");
		System.out.println(myStringList2);
		
		
	}
	
}
