public class MatriceDiInteri {
    private int[][] mat;

    public MatriceDiInteri (int[][] m){
        this.mat = m;
    }

    public boolean rigaDistinti(int i){
        int count = 0;
        for(int j = 0;j < mat[0].length;j++){
            for(int k = 0;k < mat[0].length;k++) {
                if(this.mat[i][j] == this.mat[i][k]){
                    count++;
                }
            }
            if(count > 1){
                return false;
            }
            count = 0;
        }
        return true;
    }

    public MatriceDiInteri estraiSottomatrice(int k){
        int[][] sottoMat= new int[k][k];
        for(int i = 0;i < k;i++){
            for(int j = 0;j < k;j++){
                sottoMat[i][j] = mat[i][j];
            }
        }

        return new MatriceDiInteri(sottoMat);
    }

    public String toString (){
        String str = "";
        for(int i = 0;i < mat[0].length;i++){
            for(int j = 0;j < mat[0].length;j++){
                str+=this.mat[i][j] +" ";
            }
            str+="\n";
        }
        return str;
    }
}