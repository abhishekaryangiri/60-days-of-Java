package day1Basic;

public class IfElse {

	public static void main(String[] ifelsecondition) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=1; j--)
//				break;
			{
				
				if(i==j) {
//					if(i!=j) {                     //1 3, 2 3, 3 2
				System.out.println(i+" "+j);
				break;
				//i wii run only once
				//break inside j so j will be out
				//break will out the value of i+j  in every loop
				//every time the value of i will be added once
			
			}
			}
		}
	}
}
