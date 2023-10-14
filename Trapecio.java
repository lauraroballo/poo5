
package Presentacion;

public class Trapecio extends Cuadrilatero {
    public Trapecio(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public double calcularArea() {
        double base1 = vertices[1].distanciaEntrePuntos(vertices[2]);
        double base2 = vertices[3].distanciaEntrePuntos(vertices[0]);
        double altura = vertices[1].getY() - vertices[0].getY(); // Suponiendo que los puntos 0 y 1 son los de la base menor
        return 0.5 * (base1 + base2) * altura;
    }

    @Override
    public double calcularPerimetro() {
       
        double perimetro = 0;
        for (int i = 0; i < 3; i++) {
            perimetro += vertices[i].distanciaEntrePuntos(vertices[i + 1]);
        }
        perimetro += vertices[3].distanciaEntrePuntos(vertices[0]);
        return perimetro;
    }
}

