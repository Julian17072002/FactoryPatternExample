
class Mojito implements Factory{

	private int anzRum;

	@Override
	public void mischen() {
		System.out.println("Mojito mischen");
	}
	
	public int getAnzRum() {
		return anzRum;
	}

	public void setAnzRum(int anzRum) {
		this.anzRum = anzRum;
	}

}
