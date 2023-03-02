import fond.io.*;

public class EsercizioTriangolo {
    public static void main(String[] args) {
        OutputWindow out = new OutputWindow();
        InputWindow in = new InputWindow();
        double x1 = in.readDouble("Coordinata x del primo punto");
        double y1 = in.readDouble("Coordinata y del primo punto");

        double x2 = in.readDouble("Coordinata x del secondo punto");
        double y2 = in.readDouble("Coordinata y del secondo punto");

        double x3 = in.readDouble("Coordinata x del terzo punto");
        double y3 = in.readDouble("Coordinata y del terzo punto");

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        Punto p3 = new Punto(x3, y3);

        Retta r1=new Retta(p1,p2);
        Retta r2=new Retta(p1,p3);

        //ortocentro
        Retta r3=r1.perpendicolare(p3);
        Retta r4=r2.perpendicolare(p2);
        Punto orto=r3.intersezione(r4);

        out.writeln("Ortocentro:");
        out.write(orto.coordX());
        out.write(" ");
        out.write(orto.coordY());

        //baricentro
        Punto pm12 = Punto.puntoMedio(p1, p2);
        Retta m1=new Retta(p3,pm12);
        Punto pm13 = Punto.puntoMedio(p1, p3);
        Retta m2=new Retta(p2,pm13);
        Punto bari=m1.intersezione(m2);

        out.writeln("Baricentro:");
        out.write(bari.coordX());
        out.write(" ");
        out.write(bari.coordY());

        //circocentro
        Retta a1=r1.perpendicolare(pm12);
        Retta a2=r2.perpendicolare(pm13);
        Punto circo=a1.intersezione(a2);

        out.writeln("Circoncentro:");
        out.write(circo.coordX());
        out.write(" ");
        out.write(circo.coordY());   
    }
}
