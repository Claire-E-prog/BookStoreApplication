
public class AudioCD extends SalesItem {
	
	String label;
	int playingTime;

	public AudioCD(int code, double price, int quantity, String label, int playingTime) {
		super(code, price, quantity);
		this.label = label;
		this.playingTime = playingTime;
	}
	


	@Override
	public double monthlyPromo() {
		double cdPromo = 0.05 * price;
		return cdPromo;
	}



	@Override
	public String toString() {
		return "AudioCD [label=" + label + ", playingTime=" + playingTime + ", code=" + code + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	

}
