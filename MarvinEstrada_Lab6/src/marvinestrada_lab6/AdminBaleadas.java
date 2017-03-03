package marvinestrada_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminBaleadas {
    private ArrayList<Baleadas> lista_baleadas = new ArrayList();
    private File archivo = null;

    public AdminBaleadas() {
    }

    public AdminBaleadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Baleadas> getLista_baleadas() {
        return lista_baleadas;
    }

    public void setLista_baleadas(ArrayList<Baleadas> lista_baleadas) {
        this.lista_baleadas = lista_baleadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setBaleada(Baleadas b){
        lista_baleadas.add(b);
    }

    @Override
    public String toString() {
        return "AdminBaleadas{" + "lista_baleadas=" + lista_baleadas + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Baleadas t : lista_baleadas) {
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
        lista_baleadas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                double precio;
                
                precio = sc.nextDouble();
                
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}