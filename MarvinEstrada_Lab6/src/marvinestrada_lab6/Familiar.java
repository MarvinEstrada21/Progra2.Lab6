package marvinestrada_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Familiar {
    private int edad;
    private long id;
    private String nacionalidad;
    private String lugar_nacimiento;
    private String nombre;
    private Color color_piel;
    private Familiar padre;
    private ArrayList<Familiar> lista_hijos = new ArrayList();

    public Familiar() {
    }

    public Familiar(int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel, Familiar padre) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color_piel = color_piel;
        this.padre = padre;
    }

    public Familiar(int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color_piel = color_piel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public Familiar getPadre() {
        return padre;
    }

    public void setPadre(Familiar padre) {
        this.padre = padre;
    }

    public ArrayList<Familiar> getLista_hijos() {
        return lista_hijos;
    }

    public void setLista_hijos(ArrayList<Familiar> lista_hijos) {
        this.lista_hijos = lista_hijos;
    }
    
    public void setHijo(Familiar hijo){
        lista_hijos.add(hijo);
    }

    @Override
    public String toString() {
        return nombre;
    }
}