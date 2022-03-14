package poo1;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numeropaginas;

//CONSTRUCTOR PARAMETRIZADO O LLENO.
    public Libro(String isbn, String titulo, String autor, int numeropaginas) {
        this.autor = autor;
        this.isbn = isbn;
        this.numeropaginas = numeropaginas;
        this.titulo = titulo;

    }

    Libro() {
       
    }

    //GETTERS Y SETTERS. 
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    //METODO LLENAR
    public void cargarLibro(String autor, String isbn, String titulo, int numeropaginas) {
        // Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre

        this.autor = autor;
        this.isbn = isbn;
        this.numeropaginas = numeropaginas;
        this.titulo = titulo;
    }

    //MOSTRAR LIBRO.
    public void mostrarLibro(){
        System.out.println("El libro "+titulo);
        System.out.println(" del autor "+autor);
        System.out.println(" de isbn "+isbn);
        System.out.println(" cuenta con "+numeropaginas+" paginas.");
    }
}
