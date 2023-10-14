
package Presentacion;

public class Isosceles extends Triangulo {
     public Isosceles(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área específico para un triángulo isósceles
        double A = vertices[0].distanciaEntrePuntos(vertices[1]);
        double B = vertices[1].distanciaEntrePuntos(vertices[2]);
        double C = vertices[2].distanciaEntrePuntos(vertices[0]);
        
        // Encuentra la base (lado desigual) y la altura
        double base = 0;
        double altura = 0;
        if (A == B) {
            base = C;
            altura = Math.sqrt(A * A - (C / 2) * (C / 2));
        } else if (A == C) {
            base = B;
            altura = Math.sqrt(A * A - (B / 2) * (B / 2));
        } else {
            base = A;
            altura = Math.sqrt(B * B - (A / 2) * (A / 2));
        }
        
        double area = 0.5 * base * altura;
        return area;
    }
}
