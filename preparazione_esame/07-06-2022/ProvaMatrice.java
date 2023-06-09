import fond.io.InputWindow;
import fond.io.OutputWindow;

public class ProvaMatrice {
    public static void main(String[] args) {
        OutputWindow out = new OutputWindow();
        InputWindow in = new InputWindow();

        int righe = in.readInt("Inserisci numero righe matrice");
        int col = in.readInt("Inserisci numero colonne matrice");
        int[][] mat = new int[righe][col];

        for(int i = 0;i < righe;i++){
            for(int j = 0;j < col;j++){
                mat[i][j] = in.readInt("Inserisci elemento in posizione (" +(i+1) +"," +(j+1) +")");
            }
        }

        Matrice m = new Matrice(mat);
        out.write(m.toString());

        out.write("Inserisci gli elementi della matrice 3x3\n");
        int[][] mat2 = new int[3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                mat2[i][j] = in.readInt("Inserisci elemento in posizione (" +(i+1) +"," +(j+1) +")");
            }
        }
        int rC = in.readInt("Inserisci il numero della riga del centro");
        int cC = in.readInt("Inserisci il numero della colonna del centro");

        m.sommaIntorno(rC-1, cC-1, mat2);
        out.write(m.toString());
    }
}
