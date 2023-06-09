import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Iterator;

public class Dizionario extends TreeSet<String>{
    private static String fileName="Esercitazione6/Esercizio1-2/660000_parole_italiane.txt";

    public Dizionario(){
        super();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s;
            while((s=br.readLine())!=null){
                this.add(s);
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("File "+fileName+" non trovato");
        }catch (IOException ioe) {
            System.out.println("Errore di I/O");
        }
    }

    public static void main(String[] args) {
        Dizionario sset=new Dizionario();

        Iterator<String> it=sset.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}