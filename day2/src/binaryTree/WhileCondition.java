package binaryTree;

public class WhileCondition {
	public static void main(String[] whilecond) {
		
		for(int i=1;i<=5;i++)
		{
			for( int j=5;j>1;j--) {
				while(i<j)
					//loops throw a block of code as long as specified cond. is true
				{
					System.out.println("i =   "+i+"     " + "   j  =   "+j);
					//infinite run
				}
			}
		}
	}

}
