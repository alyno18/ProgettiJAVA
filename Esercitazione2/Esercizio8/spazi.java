package Esercitazione2.Esercizio8;

import fond.io.InputWindow;
import fond.io.OutputWindow;

public class spazi {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        String str = in.readString("Inserisci una stringa: ");
        OutputWindow out = new OutputWindow();
        out.writeln("Stringa senza spazi all'inizio e alla fine: " +str.trim());
    }
}
