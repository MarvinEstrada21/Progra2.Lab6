package marvinestrada_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminOrdenes {
    private ArrayList<Ordenes> lista_ordenes = new ArrayList();
    private File archivo = null;

    public AdminOrdenes() {
    }

    public AdminOrdenes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ordenes> getLista_ordenes() {
        return lista_ordenes;
    }

    public void setLista_ordenes(ArrayList<Ordenes> lista_ordenes) {
        this.lista_ordenes = lista_ordenes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setOrden(Ordenes od){
        lista_ordenes.add(od);
    }

    @Override
    public String toString() {
        return "AdminOrdenes{" + "lista_ordenes=" + lista_ordenes + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ordenes t : lista_ordenes) {
                bw.write(t.getCantidad() + "");
                bw.write(t.getEmpleado_atendedor()+ "");
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
        lista_ordenes = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                int cantidad;
                Empleado emp;
                
                cantidad = sc.nextInt();
                emp = null;
                
                lista_ordenes.add(new Ordenes(cantidad, emp));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}