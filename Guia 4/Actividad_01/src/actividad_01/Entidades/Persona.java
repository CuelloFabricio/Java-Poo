package actividad_01.Entidades;


public class Persona {
private String Nombre;
private String Apellido;
private Integer Edad; 
private Integer DNI;
private Perro Perro;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, Integer Edad, Integer DNI, Perro Perro) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.DNI = DNI;
        this.Perro = Perro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        return Perro;
    }

    public void setPerro(Perro Perro) {
        this.Perro = Perro;
    }

    @Override
    public String toString() {
        return "Cliente: " + "Nombre: " + Nombre + ", Apellido: " + Apellido + ", Edad: " + Edad + ", DNI=" + DNI + ", Datos Del Perro: " + Perro;
    }
}

