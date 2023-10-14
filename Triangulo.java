package Presentacion;



public class Triangulo extends Figura {
    protected Punto2D vertices[];

    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        vertices = new Punto2D[3];
        vertices[0] = new Punto2D(x1, y1);
        vertices[1] = new Punto2D(x2, y2);
        vertices[2] = new Punto2D(x3, y3);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo real del área
        double A = vertices[0].distanciaEntrePuntos(vertices[1]);
        double B = vertices[1].distanciaEntrePuntos(vertices[2]);
        double C = vertices[2].distanciaEntrePuntos(vertices[0]);
        double S = (A + B + C) / 2;
        double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        // Implementa el cálculo real del perímetro
        double perimetro = vertices[0].distanciaEntrePuntos(vertices[1]) +
                          vertices[1].distanciaEntrePuntos(vertices[2]) +
                          vertices[2].distanciaEntrePuntos(vertices[0]);
        return perimetro;
    }
}
