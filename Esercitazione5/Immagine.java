
public class Immagine {
	
	private Colore[][] pixels;
	
	public Immagine(int larghezza, int altezza) {
		this.pixels = new Colore[altezza][larghezza];
		for(int i=0;i<pixels.length;i++)
			for(int j=0;j<pixels[0].length;j++)
				this.pixels[i][j]=new Colore(255,255,255);
	}
	
	public Colore getPixel(int i, int j){
		return pixels[i][j];
	}
	
	public void setPixel(int i, int j, Colore c){
		this.pixels[i][j]=c;
	}
	
	public int larghezza(){
		return pixels[0].length;
	}
	
	public int altezza(){
		return pixels.length;
	}
	
	

}
