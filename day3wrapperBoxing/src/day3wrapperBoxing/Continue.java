package day3wrapperBoxing;

public class Continue {
	public static void main(String[] conti) {
		for( int i=0;i<10;i++)
		{
			if( i==1 || i == 5  || i ==7  || i ==9)
			{
				continue;
				//skip that
			}
			System.out.println(i);
		}
		
		
		System.out.println("<<<<<<<<<<New program>>>>>>>>>>");
		//Switch problem
		//select one of many code bloks to be exicuted
		//switch expression is exicuted once
		//value of exp is comp with the value of each
		//if there is a match, the associated block of code is exicuted
		//break & default keywords are optional
		
		int day = 7;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thrusday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
		
		
		
	}

}
