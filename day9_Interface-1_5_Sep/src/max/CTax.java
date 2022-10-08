package max;

public abstract class CTax implements GOVTax{

	@Override
	public void tax() {
		System.out.println("Congresss im");
		
	}

	public abstract void gst() ;

}
