package marvinestrada_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.tree.DefaultTreeModel;

public class AdminEmpleado {
    private ArrayList<Empleado> lista_empleados = new ArrayList();
    private File archivo = null;

    public AdminEmpleado() {
    }

    public AdminEmpleado(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleado> getLista_empleados() {
        return lista_empleados;
    }

    public void setLista_empleado(ArrayList<Empleado> lista_empleados) {
        this.lista_empleados = lista_empleados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setEmpleado(Empleado em){
        lista_empleados.add(em);
    }

    @Override
    public String toString() {
        return "AdminPersona{" + "lista_personas=" + lista_empleados + ", archivo=" + archivo + '}';
    }
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Empleado t : lista_empleados) {
                bw.write(t.getSeccion_trabajo()+ ";");
                bw.write(t.getHora_entrada()+ ";");
                bw.write(t.getHora_salida()+ ";");
                bw.write(t.getSueldo()+ ";");
                bw.write(t.getEstado()+ ";");
                bw.write(t.getEdad()+ ";");
                bw.write(t.getId()+ ";");
                bw.write(t.getNacionalidad()+ ";");
                bw.write(t.getLugar_nacimiento()+ ";");
                bw.write(t.getNombre()+ ";");
                bw.write(t.getArbol_genealogico()+ ";");
                bw.write(t.getColor_piel()+ ";");
                bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        lista_empleados = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                String seccion_trabajo, hora_entrada, hora_salida, estado, nacionalidad, lugar_n, nombre;
                int edad;
                double sueldo;
                long id;
                DefaultTreeModel arbol;
                Color color_piel;
                Familiar familiar;
                
                seccion_trabajo = sc.next();
                hora_entrada = sc.next();
                hora_salida = sc.next();
                sueldo = sc.nextDouble();
                estado = sc.next();
                edad = sc.nextInt();
                id = sc.nextLong();
                nacionalidad = sc.next();
                lugar_n = sc.next();
                nombre = sc.next();
                arbol = null;
                color_piel = Color.WHITE;
                
                lista_empleados.add(new Empleado(seccion_trabajo, hora_entrada, hora_salida, sueldo, estado, edad, id, nacionalidad, lugar_n, nombre, arbol, color_piel));
            }
        } catch (Exception e) {
        } finally {
            try {
                sc.close();
            } catch (Exception e) {
            }
        }
    }
}