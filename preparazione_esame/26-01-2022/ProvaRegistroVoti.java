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

        

        int voto = in.readInt("Inserisci il voto che vuoi inserire (0 per terminare)");
        while(voto > 0){
            for(int i = 0;i < numStu;i++){
                for(int j = 0;j < numMat;j++){
                    boolean result  = r.registraVoto(in.readString("Inserisci nome"), in.readString("Inserisci materia"), in.readInt("Inserisci voto"));
                    if(result){
                        out.write("Inserimento andato a buon fine");
                    }else{
                        out.write("Inserimento non andato a buon fine");
                    }
                }
            }
        }

        out.write("\nRegistro:\n" +r.toString());

        double[] medie = r.medieVoti();
        out.write("Ecco le medie dei voti:\n");
        for(int i = 0;i < medie.length;i++){
            out.write(stu[i] +":" +medie[i] +"\n");
        }

        String m = in.readString("Inserisci materia");
        String[] insufficenze = r.insufficiente(m);
        if(insufficenze[0] == ""){
            out.write("Nessuna insufficenza");
        }else{
            for(int i = 0;i < insufficenze.length;i++){
                out.write("\nNome: " +insufficenze[i]);
            }
        }
    }
}
