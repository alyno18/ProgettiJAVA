import java.util.*;

public class Anagramma {
    private static String rimuovi(String s, int i){
        String pre = s.substring(0,i);
		String post = s.substring(i+1);
		return pre+post;
    }

    public static List<String> anagrammi(String s){
        List<String> seq = new LinkedList<String>();

        if(s.length() == 0) {
			seq.add(s);
		}else {
			for(int i = 0;i < s.length();i++) {
				char c = s.charAt(i);
				String s1 = rimuovi(s,i);
				
				List<String> seq1 = anagrammi(s1);
				
				Iterator<String> it = seq1.iterator();
				while(it.hasNext()){
					String s2 = it.next();
					seq.add(c+s2);
				}
			}	
		}

		return seq;
    }

    public static List<String> anagrammiInDizionario(String s){
		Dizionario d = new Dizionario();
		
        List<String> anagrammi = anagrammi(s);
		Iterator<String> it = anagrammi.iterator();
        
		List<String> filtrati = new LinkedList<String>();
		
		while(it.hasNext()){
			String s1 = it.next();
			if(d.contains(s1)){
				filtrati.add(s1);
            }
		}

		return filtrati;
    }
}
