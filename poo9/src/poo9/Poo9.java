/*

Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package poo9;

import java.util.Locale;
import java.util.Scanner;

public class Poo9 {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        matematica.setNumero1((Math.random() * 10));
        matematica.setNumero2((Math.random() * 10));
        boolean salir=true;
        int opcion;
        while (salir) {
                while (salir) {
            System.out.println("---------------------MENU--------------------------");
            System.out.println("1-Saber cual es el mayor de los aleatorios---------");
            System.out.println("2-Calcular potencia del mayor elevado el menor-----");
            System.out.println("3-Hallar raiz del menor----------------------------");
            System.out.println("4-Mostrar los numeros generados automaticamente----");
            System.out.println("5-SALIR--------------------------------------------");
            opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("El numero mayor es: "+ matematica.devolverMayor());
                            break;
                        case 2:
                            matematica.calcularPotencia();
                            break;
                        case 3:
                            matematica.calculaRaiz();
                            break;
                        case 4:
                            System.out.println("Los numeros generados son: " + matematica.getNumero1() + " y " + matematica.getNumero2());
                            break;
                        case 5:
                            salir = false;
                        System.out.println("Saliendo...");
                        break;
                        case 6:
                            matematica.imp();
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            ;
                    }
                }
            }
            

        }
        
    
}

