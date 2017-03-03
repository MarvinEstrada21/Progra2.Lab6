package marvinestrada_lab6;

import java.util.Date;

public class Venta {
    private Clientes nombre_cliente;
    private Empleado nombre_empleado;
    private int cantidad_articulos;
    private double total;
    private Date fecha;

    public Venta() {
    }

    public Venta(Clientes nombre_cliente, Empleado nombre_empleado, int cantidad_articulos, double total, Date fecha) {
        this.nombre_cliente = nombre_cliente;
        this.nombre_empleado = nombre_empleado;
        this.cantidad_articulos = cantidad_articulos;
        this.total = total;
        this.fecha = fecha;
    }

    public Clientes getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(Clientes nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Empleado getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(Empleado nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public int getCantidad_articulos() {
        return cantidad_articulos;
    }

    public void setCantidad_articulos(int cantidad_articulos) {
        this.cantidad_articulos = cantidad_articulos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombre_cliente=" + nombre_cliente + ", nombre_empleado=" + nombre_empleado + ", cantidad_articulos=" + cantidad_articulos + ", total=" + total + ", fecha=" + fecha + '}';
    }
}