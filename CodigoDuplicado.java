import java.util.zip.CRC32;

public class CodigoDuplicado {
    
    // Mal :

    public void saludarEnEspañol() {
        System.out.println("Hola");
    }

    public void saludarEnIngles() {
        System.out.println("Hello");
    }

    public void saludarEnFrances() {
        System.out.println("Bonjour");
    }

    // bien :

    public void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        CodigoDuplicado ejemplo = new CodigoDuplicado();
        ejemplo.saludar("Hola");
    }

}
