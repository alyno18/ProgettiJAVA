public class Sequenza {
    Object[] seq;
    int size;
    
    public Sequenza(int dimMax){
        seq = new Object[dimMax];
        size = 0;
    }

    public int lunghezza(){
        return seq.length;
    }

    public boolean inserisci(Object o){
        if(size == seq.length){
            return false;
        }else{
            seq[size] = o;
            size++;
            return true;
        }
    }

    public int contiene(Object o){
        for(int i = 0;i < size;i++){
            if(seq[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public boolean rimuovi(Object o){
        if(this.contiene(o) == -1){
            return false;
        }else{
            for(int i = this.contiene(o);i < size-1;i++)
				seq[i] = seq[i+1];
			seq[size-1] = null;
			size--;
            seq[this.contiene(o)] = seq[this.contiene(o)+1];
            seq[this.contiene(o)] = null;
            size--;
            return true;
        }
    }

    public String toString(){
		String s="[";
		for(int i=0;i<size;i++){
			s+=seq[i];
			if(i!=size-1)
				s+=", ";
		}
		s+="]";
		return s;
	}
}
