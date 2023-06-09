import java.util.*;

import fond.io.InputWindow;
import fond.io.OutputWindow;

public class TestAnagramma {
    public static void main(String[] args) {
        OutputWindow out = new OutputWindow();
        InputWindow in = new InputWindow();

        String s = in.readString("Inserisci una parola");
		List<String> anagrammi = Anagramma.anagrammi(s);

        out.writeln("anagrammi della stringa "+s);
		out.writeln(anagrammi);

        List<String> anagrammiFiltrati = Anagramma.anagrammiInDizionario(s);
		
		out.writeln("anagrammi di senso compiuto della stringa "+s);
		out.writeln(anagrammiFiltrati);
    }
}
