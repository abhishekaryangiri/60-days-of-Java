package binaryTree;

import java.util.Scanner;

public class Swap3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("num1 = " );
		
		int  num1 = in.nextInt();
		
		System.out.println("num2 = ");
		
		int num2 = in.nextInt();
		
		int temp;
		
		temp = num2;
		
		num2 = num1;
		
		num1 = temp;
		
		System.out.println("num1 = " + num1 + "\n num2 = " + num2);
		
	}

}
