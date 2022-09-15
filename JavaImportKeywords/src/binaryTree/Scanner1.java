package binaryTree;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before swap  " + a + " ," + b);

		
		a = a+b;
		b = a-b;
		a = a-b;
		
	System.out.println("After swapping  " + a + " ," + b);

	}

}
