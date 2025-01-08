package Solid.interfaceSegregationPrinciple;


// Un humano implementa las 3.
class Human implements Workable, Eatable, Restable {
    @Override
    public void work() {
        System.out.println("El humano está trabajando.");
    }

    @Override
    public void eat() {
        System.out.println("El humano está comiendo.");
    }

    @Override
    public void rest() {
        System.out.println("El humano está descansando.");
    }
}

// En cambio, un Robot solo Workable.
class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("El robot está trabajando.");
    }
}
