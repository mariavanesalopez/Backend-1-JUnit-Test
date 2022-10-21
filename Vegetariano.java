package main;

public class Vegetariano extends Menu{
    private int cantidadEspecie;
    private int cantidadSalsaVegetariana;

    public Vegetariano(double precio, int cantidadEspecie, int cantidadSalsaVegetariana) {
        super(precio);
        this.cantidadEspecie = cantidadEspecie;
        this.cantidadSalsaVegetariana = cantidadSalsaVegetariana;
    }

    @Override
    public double calcularPrecio() {
        return (((this.cantidadEspecie*0.01)*getPrecio())+(this.cantidadSalsaVegetariana*2)+getPrecio());

    }

}
