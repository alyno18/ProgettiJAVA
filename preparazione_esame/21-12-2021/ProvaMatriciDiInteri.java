import fond.io.InputWindow;
import fond.io.OutputWindow;

public class ProvaMatriciDiInteri {
    public static void main(String[] args) {
        OutputWindow out = new OutputWindow();
        InputWindow in = new InputWindow();

        int dim = in.readInt("Inserisici dimensione matrice");
        int[][] mat= new int[dim][dim];

        for(int i = 0;i < dim;i++){
            for(int j = 0;j < dim;j++){
                mat[i][j] = in.readInt("Inserisci elemento in posizione (" +i +";" +j +")");
            }
        }

        MatriceDiInteri mdi = new MatriceDiInteri(mat);
        out.write(mdi.toString());

        int riga;
        boolean result;
        riga = in.readInt("Inserisci indice riga da verificare (0 per terminare)");
        while(riga != 0){
            if(riga > dim || riga < 0){
                out.writeln("Indice errato!");
            }else{
                result = mdi.rigaDistinti(riga-1);

                if(result == true){
                    out.writeln("La riga " +riga +" ha tutti elementi distinti");
                }
                else{
                    out.writeln("La riga " +riga +" non ha tutti elementi distinti");
                }
            }
            riga = in.readInt("Inserisci indice riga da verificare (0 per terminare)");
        }

        int indiceSottoMat = in.readInt("Inserisci indice massimo sotto matrice (0 per terminare)");
        while(indiceSottoMat != 0){
            if(indiceSottoMat > dim || indiceSottoMat < 0){
                out.writeln("Indice errato!");
            }else{
                MatriceDiInteri sottoMat = mdi.estraiSottomatrice(indiceSottoMat);
                out.write(sottoMat.toString());
            }
            indiceSottoMat = in.readInt("Inserisci indice massimo sotto matrice (0 per terminare)");
        }
    }
}
