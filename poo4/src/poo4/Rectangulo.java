package poo4;
/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
public class Rectangulo {
    private int base;
    private int altura;
    int superficie;
    int perimetro;
    int i,j;
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //METODO para crear UN rectángulo con los datos del Rectángulo dados por el usuario
    public void crearRectangulo(int base, int altura){
    this.base= base;
    this.altura=altura;
    }
    
    //METODO que muestra los atributos cargados a prueba.
    /*public void mostrarRectangulo (int base, int altura){
        System.out.println("La base es: "+base);
    
        System.out.println("La altura es: "+altura);
    }
    */
    
    
    //MÉTODO para calcular la superficie del rectángulo:
    //Superficie = base * altura 
    public void calcularSuperficie(int base, int altura, int superficie){
        superficie = base * altura;
        System.out.println("La superficie es: "+superficie+" cm2.");
    }
    
    
    //MÉTODO para calcular el perímetro del rectángulo: 
    //Perímetro = (base + altura) * 2
    public void calcularPerimetro(int base, int altura, int perimetro){
        perimetro=(base + altura) * 2;
        System.out.println("El perimetros es: "+perimetro+"."); 
    }
    
    
    //MÉTODO que dibuje con * el rectangulo segun su base y su altura:
    public void dibujarRectangulo(int base, int altura){
        while(i < base){
            while(j < altura){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            j=0;
            i++;   
        }
    }
}

        
 
