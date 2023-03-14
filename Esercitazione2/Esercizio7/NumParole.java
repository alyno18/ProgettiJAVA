package Esercitazione2.Esercizio7;

import fond.io.InputWindow;
import fond.io.OutputWindow;

public class NumParole {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        String str = in.readString("Inserisci una frase: ");
        String[] strSplit = str.split("\\s+");
        OutputWindow out = new OutputWindow();
        out.writeln("Ecco il numero di parole: " +strSplit.length);
    }
}
