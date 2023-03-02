import fond.io.*;

public class EsercizioParallelogramma {
    public static void main(String[] args) {
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

        Retta r1 = new Retta(p1, p2);
        Retta r2 = new Retta(p1, p3);

        Retta r3 = r1.parallela(p3);
        Retta r4 = r2.parallela(p2);

        Punto p4 = r4.intersezione(r3);

        OutputWindow out = new OutputWindow();
        out.writeln("Coordinata x: "+(p4.coordX()));
        out.writeln("Coordinata y: "+(p4.coordY()));
    }
}
