public class Esame {
    private String materia;
    private String data;
    private int voto;

    public Esame(String materia, String data, int voto) {
        this.materia = materia;
        this.data = data;
        this.voto = voto;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Esame [materia=" + materia + ", data=" + data + ", voto=" + voto + "]";
    }

    
    
}
