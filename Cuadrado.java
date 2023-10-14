package Presentacion;
public class Cuadrado extends Cuadrilatero {
    public Cuadrado(int lado) {
        super(0, 0, lado, 0, 0, lado, lado, lado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(vertices[1].getX(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * vertices[1].getX();
    }
}
