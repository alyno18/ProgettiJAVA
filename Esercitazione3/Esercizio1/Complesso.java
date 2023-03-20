public class Complesso{
    private double re, im;

    public Complesso (double re, double im){
        this.re = re;
        this.im = im;
    }

    public double modulo(){
        double modulo = Math.sqrt(this.re*this.re+this.im*this.im);
        return modulo;
    }

    public Complesso coniugato(){
        return new Complesso(this.re, -this.im);
    }

    public Complesso somma(Complesso c){
        return new Complesso(this.re+c.re, this.im+c.im);
    }

    public Complesso prodotto(Complesso c){
        return new Complesso(this.re*c.re-this.im*c.im, this.im*c.re+this.re*c.im);
    }

    public String toString(){
        String s = "" +this.re +"+" +this.im +"i";
        return s;
    }
}