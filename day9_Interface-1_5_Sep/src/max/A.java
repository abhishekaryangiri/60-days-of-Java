package max;

public class A implements I{

	@Override
	public void getHondaService() {
		// TODO Auto-generated method stub
		System.out.println("getHondaService");
	}

	@Override
	public int getHondaCar() {
		System.out.println("getHondaCar");
		return 1111;
	}

}
