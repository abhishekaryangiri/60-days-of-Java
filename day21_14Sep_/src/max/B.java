package max;

public class B extends Exception{
	B(){}
	B(String s)
	{
		super(s);
	}
	
	public String mul(int a, int b)throws B,AB
	{
		if(a==0 && b!=0)
		{
			throw new B(ProUtility.getValueee("a"));
		}
		
		else if(a!=0 && b==0)
		{
			throw new B(ProUtility.getValueee("b"));
		}
		else if(a==0 && b==0)
		{
			throw new AB(ProUtility.getValueee("ab"));
		}
		else
		{
			int c=a*b;
			return "Multiply is = "+c;
		}
		
		
		
		
	
		
	}

}
