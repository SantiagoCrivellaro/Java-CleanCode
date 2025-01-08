package Solid.openCLosedPrinciple;


// Open/Closed Principle - El codigo debe estar abierto a extensiones pero cerrado a modificaciones

// Interfaz para el cálculo de descuentos
interface Descuento {
    double calcular(double precio);
}

// Descuento para clientes regulares
class DescuentoRegular implements Descuento {
    @Override
    public double calcular(double precio) {
        return precio * 0.1; // 10% de descuento
    }
}

// Descuento para clientes VIP
class DescuentoVIP implements Descuento {
    @Override
    public double calcular(double precio) {
        return precio * 0.2; // 20% de descuento
    }
}

// Nueva clase para un cliente Premium
class DescuentoPremium implements Descuento {
    @Override
    public double calcular(double precio) {
        return precio * 0.15; // 15% de descuento
    }
}

// Agregar Un Nuevo descuento es tan facil como crear una nueva clase, no tenemos que modificar lo ya creado
// Y estamos abriendonos a la modificacion

// Clase que utiliza la interfaz
class CalculadoraDeDescuento {
    public double aplicarDescuento(Descuento descuento, double precio) {
        return descuento.calcular(precio);
    }
}

    

