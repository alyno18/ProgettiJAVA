
public class Colore {
	private int red;
	private int green;
	private int blue;
	
	public Colore(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
	
	public boolean equals(Colore c){
		return this.red==c.red && this.green==c.green && this.blue==c.blue;
	}

}
