package Solid.liskovSubstitutionPrinciple;

// Liskov Substitution Principle - Una subclase debe ser sustituible por su clase base sin alterar el comportamiento.

class Bird {
   String nombreAve;
   int edad;
   String color;

}

interface Flyable {
 
    void fly();
}


interface Swimmable {
    void swim();
}


// Aguila implementa Flyable, ya que puede volar
class Aguila extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("El alguila puede volar");
    }
}


// Pinguino implementa Swinmmable, ya que no puede volar, pero si nadar.
class Pinguino extends Bird implements Swimmable {

        @Override
        public void swim() {
            System.out.println("El pinguino puede nadar");
        }
    }
