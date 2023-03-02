import fond.io.*;
public class ProvaTesto{

    public static void main(String[] args){
        OutputWindow out=new OutputWindow();
        LettoreFile leggi = new LettoreFile("testo1.txt");
        Testo t = leggi.leggiFile();
        out.writeln("Testo letto: ");
        out.writeln(t.contenuto());
        out.writeln("Testo invertito: ");
        out.writeln(t.inverso());

        ScrittoreFile scrivi = new ScrittoreFile("testo2.txt");
        String s = t.inverso();
        Testo t1 = new Testo(s);
        scrivi.scriviFile(t1);
    }
}