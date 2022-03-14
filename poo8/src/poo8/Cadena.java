package poo8;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().charAt(i) == 'a' || this.frase.toLowerCase().charAt(i) == 'e' || this.frase.toLowerCase().charAt(i) == 'i' || this.frase.toLowerCase().charAt(i) == 'o' || this.frase.toLowerCase().charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.printf("La cantidad de vocales es:", this.frase+ contador);
        
    }

    public void invertirFrase() {
        String invertida = "";
        for (int i = 0; i < this.longitud; i++) {
            invertida += this.frase.charAt(this.longitud - 1 - i);
        }
        System.out.printf("La frase infertida es:"+invertida);
    }

    public void vecesRepetido(String letra) {
        int cantidad = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().substring(i, i + 1).equals(letra)) {
                cantidad++;
            }
        }
        System.out.printf("La cantidad de veces que se repite el caracter es: "+ cantidad);
    }

    public void compararLongitud(String frase) {
        if (this.longitud == frase.length()) {
            System.out.printf("La frase { %s }es igual de larga que { %s } \n", this.frase+ frase);
        } else if (this.longitud > frase.length()) {
            System.out.printf("\nLa frase { %s }es mas larga que { %s}\n", this.frase+ frase);
        } else {
            System.out.printf("\nLa frase { %s } es mas larga que { %s}\n", frase+ this.frase);
        }
    }

    public void unirFrase(String frase) {
        String frasesunidas;
        frasesunidas = this.frase.concat(frase);
        System.out.printf("Las frase unidas quedan: "+ frasesunidas);
    }

    public void reemplazarCaracter(String caracter) {
        String reemplazo;
        reemplazo = this.frase.replace("a", caracter);
        System.out.printf("La frase con el caracter %s reemplazado queda: "+ caracter+ reemplazo);
    }

    public boolean contieneCaracter(String caracter) {

        return this.frase.contains(caracter);

    }

}
