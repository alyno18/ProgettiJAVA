public class RegistroVoti {
    private String[] nomi;
    private String[] materie;
    private double[][] voti;

    public RegistroVoti (String[] nomi, String[] materie){
        this.nomi = nomi;
        this.materie = materie;
        this.voti = new double[nomi.length][materie.length];

        for(int i = 0;i < voti.length;i++){
            for(int j = 0;j < voti[0].length;j++){
                voti[i][j] = 0.0;
            }
        }
    }

    public boolean registraVoto (String nome, String materia, double voto){
        int posNome = -1;
        int posMateria = -1;
        for(int i = 0;i < nomi.length;i++){
            if(nomi[i].equals(nome)){
                posNome = i;
            }
        }

        for(int i = 0;i < materie.length;i++){
            if(materie[i].equals(materia)){
                posMateria = i;
            }
        }

        if(posNome < 0 || posMateria < 0){
            return false;
        }else{
            voti[posNome][posMateria] = voto;
            return true;
        }
    }

    public double[] medieVoti(){
        double[] medie = new double[voti.length];
        double somma = 0.0;

        for(int i = 0;i < voti.length;i++){
            somma = 0.0;
            for(int j = 0;j < voti[0].length;j++){
                somma += voti[i][j];
            }
            medie[i] = somma/voti[0].length;
        }

        return medie;
    }

    public String[] insufficiente(String m){
        int posM = -1;

        for(int i = 0;i < this.materie.length;i++){
            if(this.materie[i].equals(m)){
                posM = i;
            }
        }

        int count = 0;
        if(posM > 0){
        for(int i = 0;i < this.nomi.length;i++){
            if(voti[i][posM] < 6.0){
                count++;
            }
        }
        }

        String[] insufficiente;
        int j = 0;
        if(count > 0){
            insufficiente = new String[count];
            while(j < count){
                for(int i = 0;i < this.nomi.length;i++){
                    if(voti[i][posM] < 6.0){
                        insufficiente[j] = nomi[i];
                        j++;
                    }
                }
            }
            return insufficiente;
        }else{
            insufficiente = new String[1];
            insufficiente[0] = "";
            return insufficiente;
        }
    }

    public String toString(){
        String s = "\t";

        for(int i = 0;i < this.materie.length;i++){
            s += "\t" +this.materie[i];
        }
        s += "\n";

        for(int i = 0;i < voti.length;i++){
            s += nomi[i];
            for(int j = 0;j < voti[0].length;j++){
                s += "\t" +voti[i][j];
            }
            s += "\n";
        }

        return s;
    }
}
