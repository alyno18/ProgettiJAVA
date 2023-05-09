package immagine;

public class BiancoENero implements Trasformazione{

	public Immagine trasforma(Immagine img){
		int l=img.larghezza();
		int a=img.altezza();
		Immagine res=new Immagine(l,a);
		for(int i=0;i<a;i++){
			for(int j=0;j<l;j++){
				Colore c=img.getPixel(i, j);
				double value=0.2126*c.getRed()+0.7152*c.getGreen()+0.0722*c.getBlue();
				res.setPixel(i, j, new Colore((int)value,(int)value,(int)value));
			}
		}
		return res;
	}

}
