/*

Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.

 */
package poo7;

import java.util.Locale;
import java.util.Scanner;

public class Poo7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int imc1, imc2, imc3, imc4;
        double cantidadMayores = 0, cantidadBajo = 0, cantidadIdeal = 0;
        boolean edad1, edad2, edad3, edad4;
         int opc;
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        imc1 = persona1.calcularIMC();
        imc2 = persona2.calcularIMC();
        imc3 = persona3.calcularIMC();
        imc4 = persona4.calcularIMC();

        edad1 = persona1.esMayorDeEdad();
        edad2 = persona2.esMayorDeEdad();
        edad3 = persona3.esMayorDeEdad();
        edad4 = persona4.esMayorDeEdad();
        do {
           
            System.out.println("-------------MENU-------------------");
            System.out.println("1-Ver imc y si es mayor la persona 1");
            System.out.println("2-Ver imc y si es mayor la persona 2");
            System.out.println("3-Ver imc y si es mayor la persona 3");
            System.out.println("-Ver imc y si es mayor la persona 4");
            System.out.println("5-Salir y ver procentajes totales");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    if (imc1 == -1) {
                        System.out.println("La persona 1 está por debajo del peso ideal. ");
                        cantidadBajo++;
                    } else if (imc1 == 0) {
                        System.out.println("La persona 1 está en su peso ideal. ");

                    } else {
                        System.out.println("La persona 1 esta por encima del peso ideal. ");
                    }
                    if (edad1) {
                        System.out.println("La persona 1 es mayor de edad. ");
                        cantidadMayores++;

                    } else {
                        System.out.println("La persona 1 es menor de edad. ");
                    }
                    break;
                case 2:
                    if (imc2 == -1) {
                        System.out.println("La persona 2 está por debajo del peso ideal. ");
                        cantidadBajo++;
                    } else if (imc2 == 0) {
                        System.out.println("La persona 2 está en su peso ideal. ");

                    } else {
                        System.out.println("La persona 2 esta por encima del peso ideal. ");
                    }
                    if (edad2) {
                        System.out.println("La persona 2 es mayor de edad. ");
                        cantidadMayores++;

                    } else {
                        System.out.println("La persona 2 es menor de edad. ");
                    }
                    break;
                case 3:
                    if (imc3 == -1) {
                        System.out.println("La persona 3 está por debajo del peso ideal. ");
                        cantidadBajo++;
                    } else if (imc3 == 0) {
                        System.out.println("La persona 3 está en su peso ideal. ");

                    } else {
                        System.out.println("La persona 3 esta por encima del peso ideal. ");
                    }
                    if (edad3) {
                        System.out.println("La persona 3 es mayor de edad. ");
                        cantidadMayores++;

                    } else {
                        System.out.println("La persona 3 es menor de edad. ");
                    }
                    break;
                case 4:
                    if (imc4 == -1) {
                        System.out.println("La persona 4 está por debajo del peso ideal. ");
                        cantidadBajo++;
                    } else if (imc4 == 0) {
                        System.out.println("La persona 4 está en su peso ideal. ");

                    } else {
                        System.out.println("La persona 4 esta por encima del peso ideal. ");
                    }
                    if (edad4) {
                        System.out.println("La persona 4 es mayor de edad. ");
                        cantidadMayores++;

                    } else {
                        System.out.println("La persona 1 es menor de edad. ");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERROR! Ingrese una opcion valida. ");

            }
        }while (opc!=5);
        
        System.out.printf("El porcentaje de personas con peso por debajo del ideal es de ",(cantidadBajo/4)*100);
        System.out.printf("El porcentaje de personas que están en su peso ideal es de ",(cantidadIdeal/4)*100);
        System.out.printf("El porcentaje de personas con peso por encima del ideal es de ",((4-(cantidadIdeal+cantidadBajo))/4)*100);
        System.out.printf("El porcentaje de personas mayores de edad es ", ((cantidadMayores) / 4) * 100);
        System.out.printf("El porcentaje de personas menores de edad es ", ((4 - cantidadMayores) / 4) * 100);

        }
}

