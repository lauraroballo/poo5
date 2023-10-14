package Presentacion;

public class Punto2D {
    private int x;
    private int y;

    public Punto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanciaEntrePuntos(Punto2D otroPunto) {
        int dx = x - otroPunto.getX();
        int dy = y - otroPunto.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
