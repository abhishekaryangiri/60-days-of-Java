package max;

public class H extends Exception{
  H(){}
	H(String h)
	{
		super(h);
	}
	public int getAAA(int a)throws H
	{
		
		int d[]={9,3,38,5};
		if(a<d.length)
		{
			return d[a];
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
	H	hh=new H();
	try {
		int d=hh.getAAA(31);
		System.out.println(d);
	} catch (H e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
