package main;

public class Clasico extends Menu{

    public Clasico(double precio) {
        super(precio);
    }

    @Override
    public double calcularPrecio() {
      return getPrecio();
    }


}
