package Esercitazione4.Esercizio3;

public class Tartaglia {
    private int n;
    private int[][] triangolo;

    public Tartaglia(int n){
        this.n = n;
        this.triangolo = new int[n][n*2-1];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < (n*2-1);j++){
                triangolo[i][j] = 0;
            }
        }

        triangolo[0][n-1] = 1;

        for(int i = 1;i < n;i++){
            for(int j = 0;j < (n*2-1);j++){
                if(j != 0 && j != n*2-2){
                    triangolo[i][j] = triangolo[i-1][j-1] + triangolo[i-1][j+1];
                }
                else if(i == n-1 && (j != 0 || j != n*2-2)){
                    triangolo[i][j] = 1;
                }
            }
        }
    }

    public int[] getRiga(int i){
        int[] riga = new int[triangolo[0].length];
        for(int j = 0;j < triangolo[0].length;j++){
            riga[j] = triangolo[i-1][j];
        }
        return riga;
    }

    public String toString(){
        String s = "";
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n*2-1;j++){
                if(triangolo[i][j] == 0){
                    s+=" ";
                }
                else{
                    s+=triangolo[i][j];
                }
            }
            s+="\n";
        }
        return s;
    }
}
