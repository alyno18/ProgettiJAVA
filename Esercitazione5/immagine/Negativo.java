package immagine;
public class Negativo implements Trasformazione{

	public Immagine trasforma(Immagine img){

		Immagine imOut=new Immagine(img.larghezza(), img.altezza());

		for(int i=0;i<imOut.altezza();i++)
			for(int j=0;j<imOut.larghezza();j++){
				Colore c=img.getPixel(i,j);
				int nr=255-c.getRed();
				int ng=255-c.getGreen();
				int nb=255-c.getBlue();
				Colore nc=new Colore(nr,ng,nb);
				imOut.setPixel(i,j,nc);
			}

		return imOut;

	}

}