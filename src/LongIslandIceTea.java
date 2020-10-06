
public class LongIslandIceTea implements Factory{

	private int anzVodka;

	@Override
	public void mischen() {
		System.out.println("LongIslandIceTea mischen");
	}
	
	public int getAnzRum() {
		return anzVodka;
	}

	public void setAnzRum(int anzVodka) {
		this.anzVodka = anzVodka;
	}

}
