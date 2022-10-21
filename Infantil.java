package main;

public class Infantil extends Menu{

  private int cantidadJuguete;

    public Infantil(double precio, int cantidadJuguete) {
        super(precio);
        this.cantidadJuguete = cantidadJuguete;
    }

    @Override
    public double calcularPrecio() {
        return (this.cantidadJuguete*3)+getPrecio();
    }
}
