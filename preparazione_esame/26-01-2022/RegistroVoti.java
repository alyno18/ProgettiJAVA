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
            for(int j = 0;j < voti[0].length;j++){
                somma += voti[i][j];
            }
            medie[i] = somma/voti[0].length;
        }

        return medie;
    }

    public String toString(){
        String s = "";
        for(int i = 0;i < voti.length;i++){
            s += "Nome: " +nomi[i] +"\n";
            for(int j = 0;j < voti[0].length;j++){
                s += materie[j] +": " +voti[i][j] +"\n";
            }
            s += "\n";
        }

        return s;
    }
}
