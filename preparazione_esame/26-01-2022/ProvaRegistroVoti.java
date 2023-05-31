import fond.io.InputWindow;
import fond.io.OutputWindow;

public class ProvaRegistroVoti {
    public static void main(String[] args) {
        OutputWindow out = new OutputWindow();
        InputWindow in = new InputWindow();

        int numStu = in.readInt("Inserisci numero studenti");
        int numMat = in.readInt("Inserisci numero materie");

        String[] stu = new String [numStu];
        String[] mat = new String [numMat];

        for(int i = 0;i < numStu;i++){
            stu[i] = in.readString("Inserisci studente in posizione (" +(i+1) +")");
        }

        for(int i = 0;i < numMat;i++){
            mat[i] = in.readString("Inserisci materia in posizione (" +(i+1) +")");
        }

        RegistroVoti r = new RegistroVoti(stu, mat);

        double[] medie = r.medieVoti();
        out.writeln("Ecco le medie dei voti:");
        for(int i = 0;i < medie.length;i++){
            out.writeln(stu[i] +":");
            for(int j = 0;j < stu.length;j++){
                out.writeln(mat[i] +":" +medie[i]);
            }
            out.write("\n");
        }
        
        out.write(r.toString());
    }
}
