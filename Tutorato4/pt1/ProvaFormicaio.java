package Tutorato4.pt1;

import fond.io.*;

public class ProvaFormicaio {
    public static void main(String[] args) {
        InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();

        int dim = in.readInt("Inserisci la dimensione del formicaio");
        Formicaio f = new Formicaio(dim);
        out.writeln(f.toString());

        int op;
        op = in.readInt("Seleziona l'operazione che vuoi fare\n1-Inserisci\n2-Muovi\n0-Termina");

        while(op != 0){
            if(op == 1){
                int aggiugni = 1;
                int count = 0;
    
                while(aggiugni != 0){
                    if(count == 9){
                        out.writeln("Hai raggiunto il numero massimo di formiche");
                    }
                    else{
                        int riga, col;
                        boolean result;
                        riga = in.readInt("Inserisci coordinata riga");
                        col = in.readInt("Inserisci coordinata colonna");
                        result = f.aggiungiFormica(riga, col);
        
                        if(result == true){
                            out.writeln("l'inserimento è andato a buon fine");
                            out.writeln(f.toString());
                            count++;
                        }
                        else{
                            out.writeln("l'inserimento non è andato a buon fine");
                        }
        
                        aggiugni = in.readInt("Vuoi aggiungere un'altra formica? (0=NO 1=Sì)");
                    }
                }
            }else if(op == 2){
                int muovi = 1;
    
                while(muovi != 0){
                    boolean result;
                    int id, direzione;
                    id = in.readInt("Inserisci l'id della formica che vuoi muovere");
                    direzione = in.readInt("Inserisci la direzione verso la quale la formica deve muoversi (1=NORD, 2=OVEST, 3=SUD, 4=EST)");
    
                    if(direzione > 4 || direzione < 1){
                        out.writeln("Direzione errata");
                    }
                    else{
                        result = f.muoviFormica(direzione, id);
                        if(result == true){
                            out.writeln("Lo spostamento della formica è andato a buon fine");
                            out.writeln(f.toString());
                        }
                        else{
                            out.writeln("Lo spostamento della formica non è andato a buon fine");
                        }

                        muovi = in.readInt("Vuoi muovere una formica? (0=NO 1=Sì)");
                    }
                }
            }else{
                out.writeln("Numero operazione non valido");
            }

            op = in.readInt("Seleziona l'operazione che vuoi fare\n 1-Inserisci--2-Muovi--0-Termina");
        }
    }
}
