
public class Margarita implements Factory{

	private int anzRamazzotti;

	@Override
	public void mischen() {
		System.out.println("Margarita mischen");
	}
	
	public int getAnzRum() {
		return anzRamazzotti;
	}

	public void setAnzRum(int anzRamazzotti) {
		this.anzRamazzotti = anzRamazzotti;
	}

}
