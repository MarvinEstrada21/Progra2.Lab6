package marvinestrada_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.tree.DefaultTreeModel;

public class AdminFamiliar {
    private ArrayList<Familiar> lista_familiares = new ArrayList();
    private File archivo = null;

    public AdminFamiliar() {
    }

    public AdminFamiliar(String path) {
        archivo = new File(path);
    }

    public ArrayList<Familiar> getLista_familiares() {
        return lista_familiares;
    }

    public void setLista_familiares(ArrayList<Familiar> lista_familiares) {
        this.lista_familiares = lista_familiares;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setFamiliar(Familiar fam){
        lista_familiares.add(fam);
    }

    @Override
    public String toString() {
        return "AdminFamiliar{" + "lista_familiares=" + lista_familiares + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Familiar t : lista_familiares) {
                bw.write(t.getEdad()+ ";");
                bw.write(t.getId()+ ";");
                bw.write(t.getNacionalidad()+ ";");
                bw.write(t.getLugar_nacimiento()+ ";");
                bw.write(t.getNombre()+ ";");
                bw.write(t.getColor_piel()+ ";");
                bw.write(t.getPadre()+ ";");
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
        lista_familiares = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                String nacionalidad, lugar_n, nombre;
                int edad;
                long id;
                Color color_piel;
                Familiar padre;
                
                edad = sc.nextInt();
                id = sc.nextInt();
                nacionalidad = sc.next();
                lugar_n = sc.next();
                nombre = sc.next();
                color_piel = Color.WHITE;
                padre = null;
                
                lista_familiares.add(new Familiar(edad, id, nacionalidad, lugar_n, nombre, color_piel, padre));
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