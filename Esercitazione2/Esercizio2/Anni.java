package Esercitazione2.Esercizio2;

import java.time.*;
import fond.io.*;

import fond.io.InputWindow;

public class Anni {
    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();
        InputWindow in = new InputWindow();
        String str = in.readString("Inserisci la tua data di nascita (gg/mm/aaaa): ");
        String[] data = str.split("/");

        LocalDate birthdate = LocalDate.of(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
        Period p = Period.between(birthdate, oggi);

        OutputWindow out = new OutputWindow();
        out.writeln("Hai " +p.getYears() +"anni");
    }
}
