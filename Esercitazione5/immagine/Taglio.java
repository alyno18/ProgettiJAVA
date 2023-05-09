package immagine;
public class Taglio implements Trasformazione {
	private int i1;
	private int j1;
	private int i2;
	private int j2;

	public Taglio(int i1, int j1, int i2, int j2) {
		super();
		this.i1 = i1;
		this.j1 = j1;
		this.i2 = i2;
		this.j2 = j2;
	}

	public Immagine trasforma(Immagine img){
		int l=j2-j1+1;
		int a=i2-i1+1;
		Immagine res=new Immagine(l,a);

		for(int i=i1;i<=i2;i++){
			for(int j=j1;j<=j2;j++){
					Colore c=img.getPixel(i, j);
					res.setPixel(i-i1, j-j1, c);
			}
		}

		return res;
	}

}
