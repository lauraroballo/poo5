package Presentacion;

public class Escaleno extends Triangulo {
    public Escaleno(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área específico para un triángulo escaleno
        double A = vertices[0].distanciaEntrePuntos(vertices[1]);
        double B = vertices[1].distanciaEntrePuntos(vertices[2]);
        double C = vertices[2].distanciaEntrePuntos(vertices[0]);
        double S = (A + B + C) / 2;
        double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
        return area;
    }
}

