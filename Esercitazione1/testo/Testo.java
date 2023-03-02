public class Testo {
	private String contenuto;

	public Testo(String s) {
		contenuto=s;
	}

	public String inverso(){
		StringBuilder sb=new StringBuilder();
		for(int i=contenuto.length()-1;i>=0;i--)
			sb.append(contenuto.charAt(i));
		return sb.toString();
	}

	public String contenuto(){
		return contenuto;
	}

}
