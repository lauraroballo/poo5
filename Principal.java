package Presentacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingrese las coordenadas de los cuadriláteros
        System.out.println("Ingrese las coordenadas del cuadrilatero 1 (x1 y1 x2 y2 x3 y3 x4 y4):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(x1, y1, x2, y2, x3, y3, x4, y4);
System.out.println("");
        // Ingrese las coordenadas del triángulo
        System.out.println("Ingrese las coordenadas del triangulo 1 (x1 y1 x2 y2 x3 y3):");
        int x1Tri = scanner.nextInt();
        int y1Tri = scanner.nextInt();
        int x2Tri = scanner.nextInt();
        int y2Tri = scanner.nextInt();
        int x3Tri = scanner.nextInt();
        int y3Tri = scanner.nextInt();
        Triangulo triangulo1 = new Triangulo(x1Tri, y1Tri, x2Tri, y2Tri, x3Tri, y3Tri);
System.out.println("");
      
        System.out.println("Ingrese el lado del cuadrado:");
        int ladoCuadrado = scanner.nextInt();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
System.out.println("");

        System.out.println("Ingrese las coordenadas del trapecio (x1 y1 x2 y2 x3 y3 x4 y4):");
        int x1Tra = scanner.nextInt();
        int y1Tra = scanner.nextInt();
        int x2Tra = scanner.nextInt();
        int y2Tra = scanner.nextInt();
        int x3Tra = scanner.nextInt();
        int y3Tra = scanner.nextInt();
        int x4Tra = scanner.nextInt();
        int y4Tra = scanner.nextInt();
        Trapecio trapecio = new Trapecio(x1Tra, y1Tra, x2Tra, y2Tra, x3Tra, y3Tra, x4Tra, y4Tra);
        
        System.out.println("");


        Escaleno escaleno1 = new Escaleno( x1, y1, x2, y2, x3, y3 );
        Rectangulo rectangulo1 = new Rectangulo(x1, y1, x2, y2, x3, y3 );
        Isosceles isosceles1 = new Isosceles( x1, y1, x2, y2, x3, y3 );

       
        System.out.println("Area y perimetro del triangulo escaleno 1:");
        System.out.println("Area: " + escaleno1.calcularArea());
        System.out.println("Perimetro: " + escaleno1.calcularPerimetro());

        System.out.println("");

        System.out.println("Area y perimetro del triangulo rectangulo 1:");
        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());

        System.out.println("");

        System.out.println("Area y perimetro del triangulo isosceles 1:");
        System.out.println("Area: " + isosceles1.calcularArea());
        System.out.println("Perimetro: " + isosceles1.calcularPerimetro());


        System.out.println("");
        // Mostrar resultados
        System.out.println("Area y perimetro del cuadrilatero 1:");
        System.out.println("Area: " + cuadrilatero1.calcularArea());
        System.out.println("Perimetro: " + cuadrilatero1.calcularPerimetro());
System.out.println("");
        System.out.println("Area y perimetro del triangulo 1:");
        System.out.println("Area: " + triangulo1.calcularArea());
        System.out.println("Perimetro: " + triangulo1.calcularPerimetro());
System.out.println("");
        System.out.println("Area y perimetro del cuadrado:");
        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
System.out.println("");
        System.out.println("Area y perimetro del trapecio:");
        System.out.println("Area: " + trapecio.calcularArea());
        System.out.println("Perimetro: " + trapecio.calcularPerimetro());

        scanner.close();
    }
}
