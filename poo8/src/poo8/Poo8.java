/*

Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package poo8;

import java.util.Locale;
import java.util.Scanner;

public class Poo8 {
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase o palabra:");
        cadena.setFrase(leer.next());
        cadena.setLongitud(cadena.getFrase().length());
        String letraBuscar;
        String letrareemplazo;
        String letraencontrar;
        boolean salir = true;
        int opcion;
        while (salir) {
            while (salir) {
                System.out.println("------------------Menu-------------------------------");
                System.out.println("--.1 Mostrar cantidad de vocales                   --");
                System.out.println("--.2 Invertir frase o palabra                      --");
                System.out.println("--.3 Cuantas veces se repite el caracter           --");
                System.out.println("--.4 Comparar longitud con otra frase o palabra    --");
                System.out.println("--.5 Unir con otra frase o palabra                 --");
                System.out.println("--.6 Reemplazar letra                              --");
                System.out.println("--.7 Salir                                         --");
                System.out.println("-----------------------------------------------------");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        cadena.mostrarVocales();
                        break;
                    case 2:
                        cadena.invertirFrase();
                        break;
                    case 3:
                        System.out.println("Ingrese el caracter");
                        letraBuscar=leer.next();
                         while(letraBuscar.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         letraBuscar=leer.next();
                         }
                         cadena.vecesRepetido(letraBuscar);
                        break;
                    case 4:
                        System.out.println("Ingrese la frase o palabra a comparar: ");
                        cadena.compararLongitud(leer.next());
                        break;
                    case 5:
                        System.out.println("Ingrese la frase o palabra a unir: ");
                        cadena.unirFrase(leer.next());
                        break;
                    case 6:
                         System.out.println("Ingrese caracter para reemplazar por la a");
                     letrareemplazo=leer.next();
                    while(letrareemplazo.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         letrareemplazo=leer.next();
                    }
                    cadena.reemplazarCaracter(letrareemplazo);
                        break;
                    case 7:
                        System.out.println("Ingrese cracater a encontrar");
                     letraencontrar=leer.next();
                    while(letraencontrar.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         letraencontrar=leer.next();
                    }
                    boolean encontrado=cadena.contieneCaracter(letraencontrar);
                    if (encontrado) {
                        System.out.println("El caracter se encuentra en la cadena");
                    }else{
                        System.out.println("EL caracter no se encuentra en la cadena");
                    }
                    break;
                    case 0:
                        salir = false;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                        ;
                }
        
    }
    
        }}}
