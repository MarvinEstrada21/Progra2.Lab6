package marvinestrada_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Jefes extends Persona{
    private String seccion_trabajo;
    private ArrayList<Empleado> lista_empleados = new ArrayList();
    private int clientes_atendidos;
    private double ganancia;

    public Jefes() {
        super();
    }

    public Jefes(String seccion_trabajo, int clientes_atendidos, double ganancia, int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, DefaultTreeModel arbol_genealogico, Color color_piel, Familiar familiar) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, arbol_genealogico, color_piel, familiar);
        this.seccion_trabajo = seccion_trabajo;
        this.clientes_atendidos = clientes_atendidos;
        this.ganancia = ganancia;
    }

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<Empleado> getLista_empleados() {
        return lista_empleados;
    }

    public void setLista_empleados(ArrayList<Empleado> lista_empleados) {
        this.lista_empleados = lista_empleados;
    }

    public int getClientes_atendidos() {
        return clientes_atendidos;
    }

    public void setClientes_atendidos(int clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return super.toString() + "Jefes{" + "seccion_trabajo=" + seccion_trabajo + ", lista_empleados=" + lista_empleados + ", clientes_atendidos=" + clientes_atendidos + ", ganancia=" + ganancia + '}';
    }
}