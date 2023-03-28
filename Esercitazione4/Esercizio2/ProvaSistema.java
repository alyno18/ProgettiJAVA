package Esercitazione4.Esercizio2;

import fond.io.*;
public class ProvaSistema {
    public static void main(String[] args){
        InputWindow in= new InputWindow();
        OutputWindow out= new OutputWindow();
        double[][] A= new double[3][5];
        double [] b= new double[3];
        for(int i=0;i<A.length;i++){
            for(int c=0;c<A[0].length;c++){
                A[i][c]= in.readDouble("Inserisci l'elemento: ("+i+":"+c+")");
            }
        }
        for(int i=0;i<b.length;i++){
                b[i]= in.readDouble("Inserisci l'elemento:"+i);
        }
        Sistema S1 =new Sistema(A,b);
        out.writeln(S1.toString());
        double[] x= new double[5];
        for(int i=0;i<A[0].length;i++){
            x[i]= in.readDouble("Inserisci l'elemento:"+i);
        }
        if(S1.verificaSistema(x)){
            out.writeln("Sistema verificato");
        }else{
            out.writeln("Sistema non verificato");
        }
    }
}