package Solid.singleResponsabiliyPrinciple;

// Single Responsabilyti Principle -  Cada clase debe tener un unico proposito

//Manejar Usuarios
public class User {

    String nombre;
    int edad;

    
    public User() {}


    public User(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String saludar(String nombre) {
        return "Hola" + nombre;
    }

    
}
