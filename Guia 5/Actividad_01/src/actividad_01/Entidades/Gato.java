package actividad_01.Entidades;


public class Gato extends Animal {

    public Gato() {
        super();
    }

    public Gato(String Nombre, String Alimento, Integer Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(this.Alimento);
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() + '}';
    }
    

}

