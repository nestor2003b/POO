package poo5;

import java.util.Locale;
import java.util.Scanner;

/*

Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
public class Poo5 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean salir = true;
        int opcion;
        while (salir) {
            while (salir) {
                System.out.println("------------------Menu---------------------------");
                System.out.println("--.1 Crear Cuenta Bancaria                     --");
                System.out.println("--.2 Ingresar Dinero a su Cuenta               --");
                System.out.println("--.3 Retirar Dinero de su Cuenta               --");
                System.out.println("--.4 Retiro Rapido (no más del 20% de su saldo --");
                System.out.println("--.5 Consultar Saldo                           --");
                System.out.println("--.6 Consultar Datos                           --");
                System.out.println("--.0 Salir                                     --");
                System.out.println("------------------------------------------");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        cuenta.crearCuenta();
                        break;
                    case 2:
                        cuenta.ingresarDinero();
                        break;
                    case 3:
                        cuenta.retirarDinero();
                        break;
                    case 4:
                        cuenta.retiroRapido();
                        break;
                    case 5:
                        cuenta.consultarDinero();
                        break;
                    case 6:
                        cuenta.consultarDatos();
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

        }
    }
}
