public class SequenzaDiParole {
    private String[] seq;

    public SequenzaDiParole (String[] seq){
        this.seq = seq;
    }

    public SequenzaDiParole (String testo){
        seq = testo.split("sep");
        new SequenzaDiParole(seq).toString();
    }

    public SequenzaDiParole paroleCheContengono(String s){
        String contenuto = "";
        
        for(int i = 0;i < seq.length;i++){
            if(seq[i].indexOf(s) != -1){
                contenuto+=seq[i]+" ";
            }
        }

        return new SequenzaDiParole(contenuto);
    }

    public String toString(){
        String s = "";
        for(int i = 0;i < seq.length;i++){
            s+=seq[i]+"\n";
        }
        return s;
    }
}
