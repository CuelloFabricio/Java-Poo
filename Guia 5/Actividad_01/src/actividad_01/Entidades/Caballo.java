package actividad_01.Entidades;


public class Caballo extends Animal {

    public Caballo() {
        super();
    }

    public Caballo(String Nombre, String Alimento, Integer Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
    }

    @Override
    public String toString() {
        return "Caballo{" + super.toString()+'}';
    }

    @Override
    public void alimentarse() {
        System.out.println(this.Alimento);
    }

}

