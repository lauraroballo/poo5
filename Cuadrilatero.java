package Presentacion;

public class Cuadrilatero extends Figura {
    protected Punto2D vertices[];
    
    public Cuadrilatero(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        vertices = new Punto2D[4];
        vertices[0] = new Punto2D(x1, y1);
        vertices[1] = new Punto2D(x2, y2);
        vertices[2] = new Punto2D(x3, y3);
        vertices[3] = new Punto2D(x4, y4);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo real del área
        double area = 0.5 * Math.abs(
            vertices[0].getX() * vertices[1].getY() +
            vertices[1].getX() * vertices[2].getY() +
            vertices[2].getX() * vertices[3].getY() +
            vertices[3].getX() * vertices[0].getY() -
            vertices[1].getX() * vertices[0].getY() -
            vertices[2].getX() * vertices[1].getY() -
            vertices[3].getX() * vertices[2].getY() -
            vertices[0].getX() * vertices[3].getY()
        );
        return area;
    }

    @Override
    public double calcularPerimetro() {
        // Implementa el cálculo real del perímetro
        double perimetro = 0;
        for (int i = 0; i < 3; i++) {
            perimetro += vertices[i].distanciaEntrePuntos(vertices[i + 1]);
        }
        perimetro += vertices[3].distanciaEntrePuntos(vertices[0]);
        return perimetro;
    }
}
