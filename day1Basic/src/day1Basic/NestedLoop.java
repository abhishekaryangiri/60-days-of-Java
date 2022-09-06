package day1Basic;

public class NestedLoop {

	public static void main(String[] loopinsideloop) {
		
		//nested Loop-> loop inside loop
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>1;j--)
			{
				//System.out.println("i is: "+ " "+i+ " " +" j is: "+" " + j);
				System.out.println("if  i ->   " +i + " then  j ->   " + j);
			}
		}
		
		System.out.println("<---New problem start from here--->");
		
		//another nested loop
		
		for(int a=1; a<=10; a++)
		{
			for(int b=10;b>=1;b--)
			{
				System.out.println(a+"   <-->   " + b);
			}
		}
		//debug-->click debug icon->then cli
	}
}
