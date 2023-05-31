import fond.io.InputWindow;
import fond.io.OutputWindow;

public class ProvaSequenzaDiStringheBinarie {
    public static void main(String[] args) {
        OutputWindow out = new OutputWindow();
        InputWindow in = new InputWindow();

        int dim = in.readInt("Inserisci il numero di stringhe vuoi inserire");
        SequenzaDiStringheBinarie s = new SequenzaDiStringheBinarie(dim);

        String str;
        boolean result;
        str = in.readString("Inserisci la prima stringa (-1 per terminare)");
        while (str.compareTo("-1") != 0) {
            result = s.inserisci(str);
            if(result == false){
                out.writeln("Hai sbagliato qualcosa");
            }else{
                out.writeln("Inserimento andato a buon fine\nEcco la sequenza:");
                out.writeln(s.toString());
            }

            str = in.readString("Inserisci la prima stringa (-1 per terminare)");
        }

        out.writeln("La media della sequenza inserita:\n" +s.mediaElementi());
    }
}
