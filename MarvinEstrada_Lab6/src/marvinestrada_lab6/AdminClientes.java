package marvinestrada_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminClientes {
    private ArrayList<Clientes> lista_clientes = new ArrayList();
    private File archivo = null;

    public AdminClientes() {
    }

    public AdminClientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clientes> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(ArrayList<Clientes> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCliente(Clientes client){
        lista_clientes.add(client);
    }

    @Override
    public String toString() {
        return "AdminClientes{" + "lista_clientes=" + lista_clientes + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clientes t : lista_clientes) {
                bw.write(t.getTicket()+ ";");
                bw.write(t.getDinero()+ ";");
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
        lista_clientes = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                String nacionalidad, lugar_n, nombre;
                int edad, ticket;
                double dinero;
                long id;
                Color color_piel;
                Familiar padre;
                
                ticket = sc.nextInt();
                dinero = sc.nextDouble();
                edad = sc.nextInt();
                id = sc.nextInt();
                nacionalidad = sc.next();
                lugar_n = sc.next();
                nombre = sc.next();
                color_piel = Color.WHITE;
                
                lista_clientes.add(new Clientes(ticket, dinero, edad, id, nacionalidad, lugar_n, nombre, null, color_piel));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}