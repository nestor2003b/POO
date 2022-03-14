package poo7;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;// ('H' hombre, 'M' mujer, 'O' otro)
    private double peso;
    private int altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String sexoaux;
        System.out.println("Ingrese su nombre: ");
        this.nombre = leer.next();
        System.out.println("Ingrese su edad: ");
        this.edad = leer.nextInt();
        System.out.println("Ingrese su sexo:"
                + "h = hombre"
                + "m = mujer"
                + "o = otro");
        sexoaux = leer.next();
        while (!(sexoaux.equals("h") || sexoaux.equals("m") || sexoaux.equals("o"))) {
            System.out.println("Ingrese un valor valido: ");
            sexoaux = leer.next();
        }
        this.sexo = leer.next();
        System.out.println("Ingrese su peso en kg: ");
        this.peso = leer.nextDouble();
        System.out.println("Ingrese su altura en cm: ");
        this.altura = leer.nextInt();
    }

    public int calcularIMC() {
        double imc;
        imc = (peso / (altura * altura));
        if (imc < 20) {
            return -1;
        } else if (imc > 19 || imc < 26) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
}
