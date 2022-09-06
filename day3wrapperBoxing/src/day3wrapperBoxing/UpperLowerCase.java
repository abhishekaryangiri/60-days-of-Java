package day3wrapperBoxing;

public class UpperLowerCase {
	public static void main(String[] args) {
		
		String name1 = "ABHISHEK ARYAN GIRI";
		String name2 = "abhishek aryan giri";
		String name3 = "AbhIsHeK  arYaN GiRi";
		String name = "abhishek aryan giri";
		
		// .toUpperCase()
		// .toLowerCase()
		
		String  upper = name1.toLowerCase();
		String lower = name2.toUpperCase();
		String wname = name3.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(wname);
		
		
		
		//find a character in string
		// .indexOf()
		
		System.out.println(name.indexOf("aryan"));
				
	}
}
