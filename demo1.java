package Practice_Day_25;

import java.util.ArrayList; //java.util package are present ArrayList class
import java.util.Collection;
import java.util.Iterator;

public class demo1 {
//ArrayList
	public static void main(String[] args) {
		//Created ArrayList
		
		ArrayList<String> employees=new ArrayList<>();
		
		//Add element with help of add() method
		employees.add("Rahul");
		employees.add("Anurag");
		employees.add("Omkar");
		employees.add("Om");
		employees.add("Shreya");
		employees.add("Neha");
		employees.add("Raveena");
		employees.add("Vijay");
		employees.add("Diya");
		employees.add("Ashish");
		
		//Display the employees name
		System.out.println(employees);
		
//		//Updating the employees name with help of set() method
		employees.set(1, "Prince");
		System.out.println("\nUpdate the employees Name :"+employees);
		
//		//remove the employees name at index with help of remove() method
		employees.remove(9);
		System.out.println("\nRemove the index base remove employees name :"+employees);
		
		//remove the employees name at values with help of remove() method
		employees.remove("Rahul");
		System.out.println("\nRemove the value base remove employees name :"+employees);
		
		//check the employees present are not with help of contains() method
		employees.contains("Diya");
		System.out.println("\ncheck the employees present are not :"+employees);
		
		//check the employees index with help of get() method
		System.out.println("\ncheck the employees index :"+employees.get(5));
		
		//clear the all employees name clear() method
//		employees.clear();
//		System.out.println("clear the all employees name "+employees);
		
		//Iteration using For each Loop
		System.out.println("Iteration using For each Loop");
		for(String emp:employees) {
			System.out.println(emp);
		}
		
		//Iteration using Iterator
		Iterator<String> iterator=employees.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		Collections.sort(employees);
		System.out.println(employees);

	}

}
