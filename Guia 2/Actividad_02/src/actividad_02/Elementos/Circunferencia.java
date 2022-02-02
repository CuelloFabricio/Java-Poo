package actividad_02.Elementos;

public class Circunferencia {
    private double Radio;

    public Circunferencia() {
    }

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public String toString() {
        return "Su Radio es "+Radio;
    }

}

