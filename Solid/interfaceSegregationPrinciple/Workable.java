package Solid.interfaceSegregationPrinciple;


// Interface Segregation Principle -  Una clase no deberia estar obligada a utilizar una interfaz que no necesita
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Restable {
    void rest();
}
