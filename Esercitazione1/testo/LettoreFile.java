import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LettoreFile {

	private String nomefile;

	public LettoreFile(String nomefile) {
		this.nomefile=nomefile;
	}

	public Testo leggiFile() {
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(nomefile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder sb=new StringBuilder();
		String s;
		try {
			while((s=br.readLine())!=null) {
				sb.append(s+"\n");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new Testo(sb.toString());
	}

}
