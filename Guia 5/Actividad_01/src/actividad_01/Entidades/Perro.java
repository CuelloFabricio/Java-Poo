package actividad_01.Entidades;


public class Perro extends Animal {

    public Perro() {
        super();
    }

    public Perro(String Nombre, String Alimento, Integer Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(this.Alimento);
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + '}';
    }
    
}

