package marvinestrada_lab6;

import java.util.ArrayList;

public class Baleadas extends Articulos{
    private ArrayList ingredientes = new ArrayList();

    public Baleadas() {
        super();
    }

    public Baleadas(double precio) {
        super(precio);
    }

    public ArrayList getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Baleadas{" + "ingredientes=" + ingredientes + '}';
    }
}