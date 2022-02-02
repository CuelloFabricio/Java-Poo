package actividad_04.Entidades;

public class Rectangulo {
    private Integer Base;
    private Integer Altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer Base, Integer Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer Altura) {
        this.Altura = Altura;
    }

    public Integer getBase() {
        return Base;
    }

    public void setBase(Integer Base) {
        this.Base = Base;
    }

    @Override
    public String toString() {
        
        return "Rectangulo-->" + "Base: " + Base + ", Altura: " + Altura;       
    }
    
}

