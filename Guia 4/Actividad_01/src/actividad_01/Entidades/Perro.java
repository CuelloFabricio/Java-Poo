package actividad_01.Entidades;


public class Perro {
private String Nombre;
private Integer Edad;
private String Raza;
private String Tamaño;

    public Perro() {
    }

    public Perro(String Nombre, Integer Edad, String Raza, String Tamaño) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Raza = Raza;
        this.Tamaño = Tamaño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Raza=" + Raza + ", Tamaño=" + Tamaño + '}';
    }

}

