package actividad_05.Entidades;


public class Generador {
private final Integer n;

    public Generador() {
        this.n = (int) (Math.random()*501);
    }

    public Integer getN() {
        return n;
    }

}

