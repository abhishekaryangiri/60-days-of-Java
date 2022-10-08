package max;

public class BTax extends CTax{

	@Override
	public void gst() {
		System.out.println("gst");
		
	}
	
	public static void main(String[] args) {
		GOVTax bTax=	new BTax();
		bTax.gst();
		bTax.tax();
	}

}
