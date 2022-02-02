package actividad_01.Entidades;


public abstract class Animal {
protected String Nombre;
protected String Alimento;
protected Integer Edad;
protected String Raza;

    public Animal() {
    }

    public Animal(String Nombre, String Alimento, Integer Edad, String Raza) {
        this.Nombre = Nombre;
        this.Alimento = Alimento;
        this.Edad = Edad;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
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

    @Override
    public String toString() {
        return "Animal{" + "Nombre=" + Nombre + ", Alimento=" + Alimento + ", Edad=" + Edad + ", Raza=" + Raza + '}';
    }

    public abstract void alimentarse();
}

