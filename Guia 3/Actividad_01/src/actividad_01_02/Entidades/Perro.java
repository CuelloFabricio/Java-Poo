package actividad_01_02.Entidades;


public class Perro {

    private String Raza;

    public Perro() {
    }

    public Perro(String Raza) {
        this.Raza = Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + '}';
    }
    

}

