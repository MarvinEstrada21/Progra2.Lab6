package marvinestrada_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminGatos {
    private ArrayList<Gatos> lista_gatos = new ArrayList();
    private File archivo = null;

    public AdminGatos() {
    }

    public AdminGatos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Gatos> getLista_gatos() {
        return lista_gatos;
    }

    public void setLista_gatos(ArrayList<Gatos> lista_gatos) {
        this.lista_gatos = lista_gatos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setGato(Gatos g){
        lista_gatos.add(g);
    }

    @Override
    public String toString() {
        return "AdminGatos{" + "lista_gatos=" + lista_gatos + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Gatos t : lista_gatos) {
                bw.write(t.getPeso() + "");
                bw.write(t.getAltura() + "");
                bw.write(t.getPrecio() + "");
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
        lista_gatos = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                double peso, altura, precio;
                
                peso = sc.nextDouble();
                altura = sc.nextDouble();
                precio = sc.nextDouble();
                
                lista_gatos.add(new Gatos(peso, altura, precio));
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