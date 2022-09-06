package binaryTree;

public class Break {

	public static void main(String[] usingBreak) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>1; j--)
//				break;
			{
				System.out.println(i+" "+j);
				break;
				//i will run onlly once
				//break inside j so j will be out
				//break will out the value of i+j  in every loop
				//every time the value of i will be added once
				//like i=1 then j=3 again
				//i=2--> j=3
				//i=3 --> j=3
			}
		}
	}
}
