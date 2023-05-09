package immagine;

public class CambioColori implements Trasformazione {
	private Colore originale;
	private Colore nuovo;

	public CambioColori(Colore originale, Colore nuovo) {
		super();
		this.originale = originale;
		this.nuovo = nuovo;
	}

	public Immagine trasforma(Immagine img){
		int l=img.larghezza();
		int a=img.altezza();
		Immagine res=new Immagine(l,a);
		for(int i=0;i<a;i++){
			for(int j=0;j<l;j++){
				Colore c=img.getPixel(i, j);
				if(c.equals(originale))
					res.setPixel(i, j, nuovo);
				else
					res.setPixel(i, j, c);
			}
		}
		return res;
	}

}
