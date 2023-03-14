package Esercitazione2.Esercizio4;

import fond.io.InputWindow;
import fond.io.OutputWindow;

public class Sottostringa {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        String s1 = in.readString("Inserisci la prima stringa: ");
        String s2 = in.readString("Inserisci la seconda stringa: ");
        OutputWindow out = new OutputWindow();
        if(s1.contains(s2)){
            out.writeln("La seconda stringa è contenuta nella prima");
        }
        else{
            out.writeln("La seconda stringa NON è contenuta nella prima");
        }
    }
}
