package Tutorato4.pt1;

public class Formicaio {

    private int dim;
    private int[][] formicaio;

    public Formicaio (int dim){
        this.dim = dim;
        this.formicaio = new int[dim][dim];
        for(int i = 0;i < dim;i++){
            for(int j = 0;j < dim;j++){
                formicaio[i][j] = 0;
            }
        }
    }

    public boolean aggiungiFormica (int i, int j){
        if(i > dim || j > dim){
            return false; //coordinate errate
        }
        else if(occupata(i-1, j-1) == true){
            return false; //caselle occupata
        }
        else{
            formicaio[i-1][j-1] = new Formica(i-1, j-1).getId(); //creata e aggiunta una nuova formica al formicaio
            return true;
        }
    }

    public boolean muoviFormica (int direzione, int id){
        int riga = -1; //inizializzati a -1 per evitare problemi con le coordinate a zero
        int col = -1;

        for(int i = 0;i < dim;i++){ //for per cercare l'id della formica
            for(int j = 0;j < dim;j++){
                if(formicaio[i][j] == id){
                    riga = i;
                    col = j;
                }
            }
        }

        if(riga < 0 && col < 0){
            return false; //id non valido
        }
        else{
            formicaio[riga][col] = 0;
            if(direzione == 1){
                if(riga-1 == -1 || occupata(riga-1, col) == true){
                    return false; //casella occupata o spostamento non valido
                }else{
                    formicaio[riga-1][col] = id;
                    return true; //spostamento effettuato
                }
            }else if(direzione == 2){
                if(col-1 == -1 || occupata(riga, col-1) == true){
                    return false; //casella occupata o spostamento non valido
                }else{
                    formicaio[riga][col-1] = id;
                    return true; //spostamento effettuato
                }
            }else if(direzione == 3){
                if(riga+1 == dim || occupata(riga+1, col) == true){
                    return false; //casella occupata o spostamento non valido
                }else{
                    formicaio[riga+1][col] = id;
                    return true; //spostamento effettuato
                }
            }else{
                if(col+1 == dim || occupata(riga, col+1) == true){
                    return false; //casella occupata o spostamento non valido
                }else{
                    formicaio[riga][col+1] = id;
                    return true; //spostamento effettuato
                }
            }
        }
    }

    public boolean occupata (int i, int j){
        if(formicaio[i][j] != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString (){
        String str = "";
        for(int i = 0;i < dim;i++){
            for(int j = 0;j < dim;j++){
                str+="Id: " +formicaio[i][j] +"Posizione: " +(i+1) +(j+1) +"\n";
            }
        }
        return str;
    }
}
