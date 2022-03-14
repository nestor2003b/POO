/*

Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.

 */
package poo3;
import java.util.Locale;
import java.util.Scanner;
public class Operacion {
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextInt();
    }
    public void sumar(){
        int suma = 0;
        suma=num1+num2;
        System.out.println("La suma de los dos números es: "+suma);
    }
    public void restar(){
        int resta =0;
        resta=num1-num2;
        System.out.println("La resta de "+num1+" menos "+num2+" es "+ resta);
    }
    public void multiplicar(){
        int multiplicacion=0;
        multiplicacion=num1*num2;
        if(num1==0 || num2==0){
               System.out.println("ERROR! Ha ingresado un numero 0 y no es posible realizar la operacion");
             
        }else{
        System.out.println("La multiplicacion de estos numeros es: "+ multiplicacion);
}
}
    public void dividir(){
            int division=0;
        division=num1/num2;
        if(num1==0 || num2==0){
               System.out.println("ERROR! Ha ingresado un numero 0 y no es posible realizar la operacion");
             
        }else{
        System.out.println("La division de estos numeros es: "+ division);
    
    }
}
}
