package max;
//Robust EH  MU
public class A {
	public void add(int a, int b)
	{
		System.out.println("add "+(a+b));
	}
	public void div(int a, int b)
	{
		try
		{
			if(b!=0)
			  {
	   int c	=a/b;
	System.out.println("Div "+c);
			  }
	
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		catch(ArithmeticException e)
		{  
			e.printStackTrace();
			//System.exit(1);
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("finally");
		}
	
	}
	public void mul(int a, int b)
	{
		System.out.println("mul "+(a*b));
	}

}
