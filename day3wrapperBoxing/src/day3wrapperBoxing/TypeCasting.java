package day3wrapperBoxing;

public class TypeCasting {
	public static void main(String[] castingT) {
		
		//type casting-> when you assign a value of one primitive data type to another data type
		//in java there are two type of TC
		
		//1. Widening Casting-> Automatically->convert to a smaller type to a large type size
		// byte->short->char->int->long->float->double
		
		//Narrowing Casting-> Mannually-> converting a larger type to a smaller size type
		//double->float->long->int->char->short->byte
		
		//Weidening Casting
		
		int num = 12;
		double numDub = num;
		
		System.out.println(num);              //12
		System.out.println(numDub);       //  12.0
		
		
		//Narrowing Casting
		
		double numDub1 = 12.88;
		int num1 = (int) numDub1;   //double to int
		
		System.out.println(num1);
		
		
	}

}
