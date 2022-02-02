package actividad_04.Entidades;

import actividad_04.Interfaces.CalculosFormas;


public class Circulo implements CalculosFormas<Double> {
private Double Radio;
private Double Diametro;

    public Circulo() {
    }

    public Circulo(Double Radio, Double Diametro) {
        this.Radio = Radio;
        this.Diametro = Diametro;
    }

    public Double getRadio() {
        return Radio;
    }

    public void setRadio(Double Radio) {
        this.Radio = Radio;
    }

    public Double getDiametro() {
        return Diametro;
    }

    public void setDiametro(Double Diametro) {
        this.Diametro = Diametro;
    }

    @Override
    public Double Area() {
        return PI * (Math.pow(getRadio(), 2));
    }

    @Override
    public Double Peimetro() {
       return PI * getDiametro();
    }

    @Override
    public String toString() {
        return "Circulo{" + "Radio=" + Radio + ", Diametro=" + Diametro +", Area=" + Area() + ", Perimetro="+ Peimetro() + '}';
    }

}

