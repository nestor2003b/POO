package poo4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo =new Rectangulo();
        Scanner scan= new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la base del rectangulo en cm.");
        int base = scan.nextInt();
        System.out.println("Ingrese la altura del rectangulo en cm.");
        int altura = scan.nextInt();
        rectangulo.crearRectangulo(base, altura);
        rectangulo.calcularSuperficie(base, altura, altura);
        rectangulo.calcularPerimetro(base, altura, altura);
       rectangulo.dibujarRectangulo(base, altura);
    }
}


