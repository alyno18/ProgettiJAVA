package Esercitazione4.Esercizio2;

public class Sistema {
    private double[][] A; // matrice dei coefficienti
    private double[] b; // vettore dei termini noti

    public Sistema(double[][] A, double[] b){
        this.A = A;
        this.b = b;
    }

    public boolean verificaEquazione(int i, double[] x){
        int somma = 0;
        for(int j = 0;j < x.length;j++){
            somma+=A[i][j]*x[j];
        }

        if(b[i] == somma)
            return true;
        else
            return false;
    }

    public boolean verificaSistema(double[] x){
        for(int j = 0;j < A.length;j++){
            if(verificaEquazione(j, x) == false)
                return false;
        }
        return true;
    }

    public String stampaEquazione(int i){
        String str = "";
        for(int j = 0;j < A[0].length;j++){
            str+=A[i][j]+"x +";
        }
        str+="="+b[i]+"\n";

        return str;
    }

    public String toString(){
        String str = "";
        for(int i = 0;i < A.length;i++){
            str+=stampaEquazione(i);
        }

        return str;
    }
}
