package poo9;
public class Matematica {
    private double numero1,numero2;

    public Matematica() {
    }

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    
    public double devolverMayor(){
    return Math.max(numero1, numero2);
    }
    
    public void calcularPotencia(){
    double a = Math.round(devolverMayor());
    double b = Math.round(Math.min(numero1, numero2));
        System.out.println("La potencia del numero mayor es: "+Math.pow(b, b));
    }
    
    public void calculaRaiz(){
        System.out.println("La raiz del numero menor es. "+Math.sqrt(Math.abs(Math.min(numero1, numero2))));
    
    }
    
    public void imp(){
        System.out.println("Numeros"+numero1+" y "+numero2);}
}
