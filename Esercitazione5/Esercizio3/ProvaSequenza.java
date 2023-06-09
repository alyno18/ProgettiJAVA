import fond.io.OutputWindow;

public class ProvaSequenza {
    public static void main(String[] args) {
        Sequenza seq=new Sequenza(10);
        OutputWindow out = new OutputWindow();
		seq.inserisci("Uno");
		seq.inserisci("Due");
		seq.inserisci("Tre");

		out.writeln("Sequenza inserita");
		out.writeln(seq.toString());

		out.writeln("Posizione dell'elemento \"Uno\": "+seq.contiene("Uno"));
		out.writeln("Posizione dell'elemento \"Quattro\": "+seq.contiene("Quattro"));

		seq.rimuovi("Due");
		out.writeln("Sequenza dopo la prima rimozione");
		out.writeln(seq.toString());

		seq.rimuovi("Sei");
		out.writeln("Sequenza dopo la seconda rimozione");
		out.writeln(seq.toString());
    }
}
