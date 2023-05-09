package immagine;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class ManipolatoreDiImmagine {
	private BufferedImage img;
	private List<Trasformazione> trasformazioni;

	public ManipolatoreDiImmagine(String fileName){
		try {
			img=ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		trasformazioni= new ArrayList<>();
	}

	public void aggiungiTrasformazione(Trasformazione t){
		trasformazioni.add(t);
	}

	public void trasforma(){
		Raster raster=img.getRaster();
		int l=raster.getWidth();
		int a=raster.getHeight();
		Immagine image=new Immagine(l,a);

		for(int i=0;i<a;i++){
			for(int j=0;j<l;j++){
				int[] p=raster.getPixel(j, i, new int[3]);
				image.setPixel(i, j, new Colore(p[0],p[1],p[2]));
			}
		}

		for(Trasformazione t: trasformazioni){
			image=t.trasforma(image);
		}

		l=image.larghezza();
		a=image.altezza();
		BufferedImage img2=new BufferedImage(l,a,BufferedImage.TYPE_INT_RGB);
		WritableRaster rast2=img2.getRaster();

		for(int i=0;i<a;i++)
			for(int j=0;j<l;j++){
				Colore c=image.getPixel(i, j);
				int[] b=new int[3];
				b[0]=c.getRed();
				b[1]=c.getGreen();
				b[2]=c.getBlue();
				rast2.setPixel(j, i, b);
			}
		img=img2;
	}

	public void scriviSuFile(String fileName){
		try {
			ImageIO.write(img, "jpg", new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



}
