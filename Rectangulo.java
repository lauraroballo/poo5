
package Presentacion;
public class Rectangulo extends Triangulo {
    public Rectangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área específico para un triángulo rectángulo
        double A = vertices[0].distanciaEntrePuntos(vertices[1]);
        double B = vertices[1].distanciaEntrePuntos(vertices[2]);
        double C = vertices[2].distanciaEntrePuntos(vertices[0]);
        double hipotenusa = Math.max(A, Math.max(B, C));
        double cateto1 = 0, cateto2 = 0;
        if (hipotenusa == A) {
            cateto1 = B;
            cateto2 = C;
        } else if (hipotenusa == B) {
            cateto1 = A;
            cateto2 = C;
        } else {
            cateto1 = A;
            cateto2 = B;
        }
        double area = 0.5 * cateto1 * cateto2;
        return area;
    }
}

