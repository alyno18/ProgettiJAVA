public class Retta{

	private double m; // coefficiente angolare
	private double q; // termine noto


	public Retta (Punto p1, Punto p2){
		if(p1.coordX()!=p2.coordX()){
			// determina m e q
			this.m = (p2.coordY()-p1.coordY())/(p2.coordX()-p1.coordX());
			this.q = (p2.coordX()*p1.coordY() - p1.coordX()*p2.coordY())/(p2.coordX()-p1.coordX());
		}else{
			this.m=Double.POSITIVE_INFINITY;
			this.q=p1.coordX();
		}
	}

	public Retta parallela (Punto p){
		if(this.m==Double.POSITIVE_INFINITY){
			return new Retta(p,new Punto(p.coordX(),p.coordY()+1));
		}else{
			double nq=p.coordY()-this.m*p.coordX();
			return new Retta(p,new Punto(p.coordX()+1,this.m*(p.coordX()+1)+nq));
		}
	}

	public Retta perpendicolare (Punto p){
		if(this.m==0){ // retta orizzontale
			return new Retta(p,new Punto(p.coordX(),p.coordY()+1));
		}else if(this.m==Double.POSITIVE_INFINITY){ // retta verticale
			return new Retta(p,new Punto(p.coordX()+1,p.coordY()));
		}else{
			double m1=-1/m;
			double nq=p.coordY()-m1*p.coordX();
			return new Retta(p,new Punto(p.coordX()+1,m1*(p.coordX()+1)+nq));
		}
	}

	public Punto intersezione(Retta r){
		if(this.m==r.m)
			return null;

		double xa,ya;
		if(this.m!=Double.POSITIVE_INFINITY && r.m!=Double.POSITIVE_INFINITY){
			xa=(r.q-this.q)/(this.m-r.m);
			ya=this.m*xa+this.q;

		}else if(this.m!=Double.POSITIVE_INFINITY){
			xa=r.q;
			ya=this.m*xa+this.q;
		}else{
			xa=this.q;
			ya=r.m*xa+r.q;
		}

		return new Punto(xa,ya);
	}

	public String toString(){

		if(this.m==Double.POSITIVE_INFINITY)
			return "x="+this.q;
		else if(this.m==0)
			return "y="+this.q;
		else if(this.q<0)
			return "y="+this.m+"x"+this.q;
		else
			return "y="+this.m+"x+"+this.q;
	}

}