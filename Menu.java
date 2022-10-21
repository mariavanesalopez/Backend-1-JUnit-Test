package main;

public abstract class Menu {
    //Atributos
    private double precio;

    //Constructor
    public Menu(double precio) {
        this.precio = precio;
    }

    //Template Method
    final void prepararPaquete(){
        armarMenu();
        calcularPrecio();
    }

    //Metodos
    public void armarMenu(){
        System.out.println("El menú está formado por..");
    };

    abstract double calcularPrecio();

    public double getPrecio() {
        return precio;
    }
}
