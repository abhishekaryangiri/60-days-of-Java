package binaryTree;

public class PrimeNumber {
	public static void main(String[] primeNumber) {
		
		for( int i=1;i<=40;i++)
		{
			int num = 23;
			int count = 0;
			if( num%i==0 && num%num==0) {
				count++;
				if(count==2) {
					System.out.println(num+"  :  Yes it is Prime num");
				}else {
					System.out.println(num+ "  :  Not a prime number");
				}
			}
		}
	}
}
