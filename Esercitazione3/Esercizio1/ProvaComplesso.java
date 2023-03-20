import fond.io.InputWindow;
import fond.io.OutputWindow;

public class ProvaComplesso {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        double re1 = in.readDouble("Inserisci la parte reale del primo numero: ");
        double im1 = in.readDouble("Inserisci la parte immaginaria del primo numero: ");
        double re2 = in.readDouble("Inserisci la parte reale del secondo numero: ");
        double im2 = in.readDouble("Inserisci la parte immaginaria del secondo numero: ");
        Complesso c1 = new Complesso(re1, im1);
        Complesso c2 = new Complesso(re2, im2);
        double modulo1 = c1.modulo();
        out.write("Modulo del primo: " +modulo1 +"\n");
        double modulo2 = c2.modulo();
        out.write("Modulo del secondo: " +modulo2 +"\n");
        Complesso coniugato1 = c1.coniugato();
        Complesso coniugato2 = c2.coniugato();
        Complesso somma = c1.somma(c2);
        Complesso prodotto = c1.prodotto(c2);
        out.write("Coniugato del primo: " +coniugato1.toString() +"\n" +"Coniugato del secondo: "+coniugato2.toString() +"\n");
        out.write("Somma: " +somma.toString() +"\n" +"Prodotto: " +prodotto.toString() +"\n");
    }
}