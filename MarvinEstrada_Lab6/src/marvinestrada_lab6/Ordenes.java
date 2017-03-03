package marvinestrada_lab6;
public class Ordenes {
    private int cantidad;
    private Empleado empleado_atendedor;

    public Ordenes() {
    }

    public Ordenes(int cantidad, Empleado empleado_atendedor) {
        this.cantidad = cantidad;
        this.empleado_atendedor = empleado_atendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Empleado getEmpleado_atendedor() {
        return empleado_atendedor;
    }

    public void setEmpleado_atendedor(Empleado empleado_atendedor) {
        this.empleado_atendedor = empleado_atendedor;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "cantidad=" + cantidad + ", empleado_atendedor=" + empleado_atendedor + '}';
    }
}