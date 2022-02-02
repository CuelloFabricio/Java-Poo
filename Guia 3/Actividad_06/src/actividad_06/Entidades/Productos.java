package actividad_06.Entidades;


public class Productos {
private String Nombre;
private Double Precio;

    public Productos() {
    }

    public Productos(String Nombre, Double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto-->" + "Nombre: " + Nombre.toUpperCase() + ", Precio: $" + Precio;
    }

}

