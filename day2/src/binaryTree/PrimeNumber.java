package binaryTree;

public class PrimeNumber {
	public static void main(String[] primeNumber) {
		
		int num = 53;
		int temp = 0;
		
		for( int i=2;i<=num-1;i++)
		{
			if( num%i == 0 ) 
			{
				temp += 1;
			}
			if ( temp >0 )
			{
					System.out.println(num + "  :  Not a prime number");
					break;
					
				}else {
					
					System.out.println(num+ "  : Yes it is Prime num");
					break;
				}
			}
		}
	}

