import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManejoDeExceptions{
    // Intentar capturar la excepcion mas adecuada y retornar un mensaje descriptivo del problema al usuario

    // Mal :
    public void leerArchivo(String ruta) {
        try {
            // Intentamos leer el archivo
            Files.readAllLines(Paths.get(ruta));
        } catch (Exception e) { // Captura genérica de excepciones
            e.printStackTrace(); // Mensaje poco claro para el usuario
        }
    }

 public void leerArchivo2(String ruta) {
        try {
            // Intentamos leer el archivo
            Files.readAllLines(Paths.get(ruta));
        } catch(IOException e)  {             // Capturamos una excepcion menos generica

            System.out.println("Error a la hora de leer :" + ruta);
            
            System.out.println("Mensaje de Error :" + e.getMessage());
            
            

         }  
    }
}

