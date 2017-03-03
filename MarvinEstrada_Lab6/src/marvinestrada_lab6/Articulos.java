package marvinestrada_lab6;
public class Articulos {
    private double precio;

    public Articulos() {
    }

    public Articulos(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" + "precio=" + precio + '}';
    }
}