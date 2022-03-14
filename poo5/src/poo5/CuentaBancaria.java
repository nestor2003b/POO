package poo5;

import java.util.Locale;
import java.util.Scanner;

public class CuentaBancaria {

    private int numeroCuenta;
    private long dni;
    private double saldoActual = 0;
    private double intereses;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dni, double saldoActual, double intereses) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.intereses = intereses;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("¡Creando su Cuenta Bancaria!");

        System.out.println("Ingrese su dni:");
        dni = leer.nextLong();
        System.out.println("Su dni es " + dni);
        numeroCuenta = numeroCuenta + 1;
        System.out.println("Su numero de cuenta es: " + numeroCuenta);
    }

    public void ingresarDinero() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double ingreso;
        System.out.println("¡Ingresando Dinero a su cuenta!");
        System.out.println("Ingrese el monto de dinero a ingresar:");
        ingreso = leer.nextDouble();
        saldoActual = saldoActual + ingreso;
        System.out.println("Su saldo actual es de $" + saldoActual);
    }

    public void retirarDinero() {
        double monto;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("¿Cuanto dinero desea retirar?");
        monto = leer.nextDouble();
        saldoActual = saldoActual - monto;
        System.out.println("Su saldo actual es de: $" + saldoActual);
    }

    public void retiroRapido() {
        double monto;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("¿Cuanto dinero desea retirar?");
        monto = leer.nextDouble();

        if (monto <= (saldoActual * 0.20)) {
            saldoActual = saldoActual - monto;
            System.out.println("Su saldo actual es de: $" + saldoActual);

        } else {
            System.out.println("No puede realizar esta operación, exede el limite.");
        }
    }

    public void consultarDinero() {
        System.out.println("Su saldo actual es de $" + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Mostrando datos del usuario:");
        System.out.println("Su dni es: " + dni);
        System.out.println("Su numero de cuenta es: " + numeroCuenta);
    }
}
