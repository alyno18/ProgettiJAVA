public class SequenzaDiStringheBinarie {
    private String[] seq; //memorizza la sequenza di stringhe
    private int count = 0; // memorizza il numero di stringhe presenti nell’array seq

    public SequenzaDiStringheBinarie (int n){
        this.seq = new String[n];
    }

    public boolean inserisci(String s){
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) >49){
                return false;
            }
        }
        if(this.count == this.seq.length){
            return false;
        }else{
            this.seq[this.count] = s;
            this.count++;
        }

        return true;
    }

    public int valoreStringa(int i){
        if(i < 0 || i > this.count){
            return -1;
        }else{
            return Integer.parseInt(this.seq[i], 2);
        }
    }

    public double mediaElementi(){
        double somma = 0;
        for(int i = 0;i < this.count;i++){
            somma += this.valoreStringa(i);
        }
        return (somma/this.count);
    }

    public String toString(){
        String s = "";
        for(int i = 0;i < this.count;i++){
            s += this.seq[i] +"(" +this.valoreStringa(i) +")" +"\n";
        }
        return s;
    }
}
