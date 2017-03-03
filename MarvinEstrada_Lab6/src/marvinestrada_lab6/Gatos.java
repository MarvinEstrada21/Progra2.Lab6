package marvinestrada_lab6;
public class Gatos extends Articulos{
    private double peso;
    private double altura;

    public Gatos() {
        super();
    }

    public Gatos(double peso, double altura, double precio) {
        super(precio);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Gatos{" + "peso=" + peso + ", altura=" + altura + '}';
    }
}