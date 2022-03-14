package poo6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {
    private int capacidadMaxima=100;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
//hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
    cantidadActual=capacidadMaxima;
        System.out.println("La cantidad actual es "+cantidadActual+" ml, está llena.");
  
    }
    
/*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción 
de servir la taza con la capacidad indicada. Si lacantidad actual de café “no alcanza” para llenar la taza, se sirve lo
que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.*/
    public void servirTaza(){
        int tamaño;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el tamaño de su taza en ml:");
        tamaño= leer.nextInt();
        if(tamaño<=cantidadActual){
            System.out.println("La taza se llenó correctamente con "+tamaño+" ml.");
            cantidadActual=cantidadActual-tamaño;
            System.out.println("La cantidad actual es "+cantidadActual+" ml.");
        }else{
            System.out.println("Lastimosamente no contamos con esa cantidad de café, de igual manera le servimos "+cantidadActual+" ml.");
        }
    }
    
    
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
    cantidadActual=cantidadActual*0;
        System.out.println("La cantidad actual de cafe es de "+cantidadActual+" ml.");
    }
    
    
 //se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(){
    int agregado;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Cuanto cafe quiere agregar a la cafetera?");
        agregado=leer.nextInt();
       if(agregado<=capacidadMaxima){
           cantidadActual=cantidadActual+agregado;
           System.out.println("La cantidad actual de cafe es de "+cantidadActual+" ml.");
       }else{
           System.out.println("Lo sentimos, excede la capacidad máxima");
       }
    
    
    }
}
