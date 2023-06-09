public class Matrice {
    private int[][] mat;

    public Matrice(int[][] m){
        this.mat = new int [m.length][m[0].length];

        for(int i = 0;i < this.mat.length;i++){
            for(int j = 0;j < this.mat[0].length;j++){
                this.mat[i][j] = m[i][j];
            }
        }
    }

    public int sommaIntorno(int i, int j, int[][] a){
        int somma = 0;
        int difR = 0;
        int difC = 0;
        if(i>2){
            difR = this.mat.length - a.length + 1;
        }else if(j>2){
            difC = this.mat.length - a.length + 1;
        }
        for(int x = i-1;x < i+2;x++){
            for(int k = j-1;k < j+2;k++){
                if(x != -1 && k != -1 && (x-difR) < 3 && (k-difC) < 3){
                    if(x != i || k != j){
                        somma += this.mat[x][k] + a[x-difR][k-difC];
                        this.mat[x][k] += a[x-difR][k-difC];
                    }
                }
            }
        }

        return somma;
    }

    public int[] intornoMinimo(){
        int riga = 0;
        int col = 0;

        int[][] a = new int[3][3];
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[0].length;j++){
                a[i][j] = 0;
            }
        }

        int sommaIntorno = this.sommaIntorno(0, 0, a);
        for(int i = 0;i < this.mat.length;i++){
            for(int j = 0;j < this.mat[0].length;j++){
                if(sommaIntorno > this.sommaIntorno(sommaIntorno, j, a)){
                    sommaIntorno = this.sommaIntorno(i, j, a);
                    riga = i;
                    col = j;
                }
                
            }
        }

        return new int[] {riga, col};
    }

    public String toString (){
        String str = "Ecco la matrice:\n";
        for(int i = 0;i < mat[0].length;i++){
            for(int j = 0;j < mat[0].length;j++){
                str+=this.mat[i][j] +" ";
            }
            str+="\n";
        }
        return str;
    }
}
