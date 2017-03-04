package marvinestrada_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminJefes {
    private ArrayList<Jefes> lista_jefes = new ArrayList();
    private File archivo = null;

    public AdminJefes() {
    }

    public AdminJefes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jefes> getLista_jefes() {
        return lista_jefes;
    }

    public void setLista_jefes(ArrayList<Jefes> lista_jefes) {
        this.lista_jefes = lista_jefes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setJefe(Jefes boss){
        lista_jefes.add(boss);
    }

    @Override
    public String toString() {
        return "AdminJefes{" + "lista_jefes=" + lista_jefes + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Jefes t : lista_jefes) {
                bw.write(t.getSeccion_trabajo()+ ";");
                bw.write(t.getClientes_atendidos()+ ";");
                bw.write(t.getGanancia()+ ";");
                bw.write(t.getEdad()+ ";");
                bw.write(t.getId()+ ";");
                bw.write(t.getNacionalidad()+ ";");
                bw.write(t.getLugar_nacimiento()+ ";");
                bw.write(t.getNombre()+ ";");
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
        lista_jefes = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                String nacionalidad, lugar_n, nombre, seccion_trabajo;
                int edad, clientes_atendidos;
                long id;
                double ganancia;
                Color color_piel;
                Familiar padre;
                
                seccion_trabajo = sc.next();
                clientes_atendidos = sc.nextInt();
                ganancia = sc.nextDouble();
                edad = sc.nextInt();
                id = sc.nextInt();
                nacionalidad = sc.next();
                lugar_n = sc.next();
                nombre = sc.next();
                color_piel = Color.WHITE;
                
                lista_jefes.add(new Jefes(seccion_trabajo, clientes_atendidos, ganancia, edad, id, nacionalidad, lugar_n, nombre, null, color_piel));
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