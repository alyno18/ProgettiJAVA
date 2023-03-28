package Esercitazione4.Esercizio3;

import fond.io.*;

public class ProvaTartaglia {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        int n= in.readInt("Inserire le righe del triangolo");
        Tartaglia t = new Tartaglia(n);
        out.write(t.toString());

        int i= in.readInt("Inserire le riga del triangolo");
        int r[]= t.getRiga(i);
        String s="\nRiga n°"+i+":";

        for(int k=0;k<r.length;k++){
            if(r[k]!=0){
                s+=r[k]+" ";
            }
        }
        
        out.write(s);

    }
}
