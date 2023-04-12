package Tutorato4.pt1;

public class Formica{
    
    private int i, j; //coordinate
    private static int id = 0; //l'id parte da 1 perchè la matrice e inizializzata con tutti zeri (l'id sarà sequenziale)

    public Formica (int i, int j){
        this.i = i;
        this.j = j;
        id+=1;
    }

    public int getId() {
        return id;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public static int getLastId (){
        return id-1;
    }
}