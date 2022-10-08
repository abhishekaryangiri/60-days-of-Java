package binaryTree;

import java.util.Scanner;

public class Swap2{
	public static void main(String[] args) {
		int x, y, z;
		Scanner in = new Scanner(System.in);
		
		System.out.println("import the first number: ");
		
		x = in.nextInt();
		
		System.out.println("input the second number: ");
		
		y = in.nextInt();
		
		z = x;
		x = y;
		y = z;
		
		
		System.out.println("swap values are  " + x + " and " + y);
		
	}

}
