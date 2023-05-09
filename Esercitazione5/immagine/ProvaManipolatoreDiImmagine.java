package immagine;

public class ProvaManipolatoreDiImmagine {

	public static void main(String[] args) {
		ManipolatoreDiImmagine mdi=new ManipolatoreDiImmagine("Esercitazione5/immagine/immagine.png");

		//modificare a piacere
		//mdi.aggiungiTrasformazione(new CambioColori(new Colore(255,0,0),new Colore(127,127,127)));
		//mdi.aggiungiTrasformazione(new Negativo());
		//mdi.aggiungiTrasformazione(new Riflessione(true));
		//mdi.aggiungiTrasformazione(new Taglio(100,100,200,200));
		mdi.aggiungiTrasformazione(new BiancoENero());

		mdi.trasforma();
		mdi.scriviSuFile("Esercitazione5/immagine/output2.jpg");
		System.out.println("FINE");

	}

}
