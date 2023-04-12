import java.io.*;

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
