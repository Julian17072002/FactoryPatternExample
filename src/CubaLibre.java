
public class CubaLibre implements Factory{

	private int anzJackDaniels;

	@Override
	public void mischen() {
		System.out.println("CubaLibre mischen");
	}
	
	public int getAnzRum() {
		return anzJackDaniels;
	}

	public void setAnzRum(int anzJackDaniels) {
		this.anzJackDaniels = anzJackDaniels;
	}

}
