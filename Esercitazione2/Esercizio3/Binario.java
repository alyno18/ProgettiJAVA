package Esercitazione2.Esercizio3;
import fond.io.*;

import fond.io.InputWindow;

public class Binario {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        String num = in.readString("Inserisci un numero binario: ");
        int binario = Integer.parseInt(num, 2);
        OutputWindow out = new OutputWindow();
        out.writeln("Ecco il numero in decimale: " +binario);
    }
}
