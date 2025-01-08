package Solid.dependencyInversionPrinciple;

// Dependency Inversion Principle - Las clases de alto nivel no deberian depender de clases de bajo nivel, ambos deberian depender de abstracciones.


// Interfaz para los motores
interface Motor {
    void encender();
}

// Motor de gasolina (implementa la interfaz Motor)
class MotorGasolina implements Motor {
    public void encender() {
        System.out.println("El motor de gasolina está encendido.");
    }
}

// Motor eléctrico (también implementa la interfaz Motor)
class MotorElectrico implements Motor {
    public void encender() {
        System.out.println("El motor eléctrico está encendido.");
    }
}

// Clase Coche depende de la interfaz Motor, no de una implementación concreta
class Coche {
    private Motor motor;

    // El motor se pasa desde afuera (inyección de dependencia)
    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}
