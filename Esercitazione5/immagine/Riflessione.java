package immagine;
public class Riflessione implements Trasformazione{
	private boolean orizzontale;

	public Riflessione(boolean orizzontale) {
		this.orizzontale = orizzontale;
	}

	public Immagine trasforma(Immagine img){
		int l=img.larghezza();
		int a=img.altezza();
		Immagine res=new Immagine(l,a);

		if(orizzontale){
			for(int i=0;i<a;i++){
				for(int j=0;j<l;j++){
					Colore c=img.getPixel(i, j);
					res.setPixel(i, l-j-1, c);
				}
			}
		}else{
			for(int i=0;i<a;i++){
				for(int j=0;j<l;j++){
					Colore c=img.getPixel(i, j);
					res.setPixel(a-i-1, j, c);
				}
			}
		}


		return res;
	}
}
