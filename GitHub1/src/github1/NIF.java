package github1;

public class NIF {

    int numero;
    char letra;

    public NIF(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" + "numero=" + numero + ", letra=" + letra + '}';
    }
    
}
