package binaryTree;

public class Swap1 {
	
	//write a program to swap 2 variables
	// swapping: exchanging the values of the variables. generaly this is done with the data in memory
	// simplest method to swap 2 variables is to used third temporary variable.
	
	//define swap (a, b)
	//temp := a
	//a : b
	//b  := temp
	
	public static void main(String[] args) {
		
		int a, b, temp;
		
		a=15;
		b=27;
		System.out.println("before swapping  the value of  a &  b  were --->    " + a+ "  " + b);
		
		temp = a;
		a=b;
		b=temp;
		System.out.println("after swapping  the value of  a, & b  are --->   " +a+ "  " +b );
	}

}
