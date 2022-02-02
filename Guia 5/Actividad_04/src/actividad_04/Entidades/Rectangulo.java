package actividad_04.Entidades;

import actividad_04.Interfaces.CalculosFormas;

public class Rectangulo implements CalculosFormas<Integer>{
private Integer Base;
private Integer Altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer Base, Integer Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Integer getBase() {
        return Base;
    }

    public void setBase(Integer Base) {
        this.Base = Base;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer Altura) {
        this.Altura = Altura;
    }

    @Override
    public Integer Area() {
        return getBase() * getAltura();
    }

    @Override
    public Integer Peimetro() {
        return (getBase() + getAltura()) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Base=" + Base + ", Altura=" + Altura + ", Area=" + Area() + ", Perimetro="+ Peimetro() + '}';
    }

}

