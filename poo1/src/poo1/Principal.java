/*/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
package poo1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      Libro libro=new Libro();
      Scanner scan= new Scanner(System.in).useDelimiter("\n");
      
        System.out.println("Ingrese el título del libro:");
        String titulo=scan.next();
        
        System.out.println("Ingrese el autor del libro:");
        String autor=scan.next();
        
        System.out.println("Ingrese el ISBN del libro:");
        String isbn=scan.next();
        
        System.out.println("Ingrese la cantidad del páginas del libro:");
        int numeropaginas=scan.nextInt();
      
        
        libro.cargarLibro(autor, isbn, titulo, numeropaginas);
      
        libro.mostrarLibro();
    }
    
}
      
