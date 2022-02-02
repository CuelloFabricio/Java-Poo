package actividad_03.Elementos;

public class Operacion {
    private Integer Numero1;
    private Integer Numero2;

    public Operacion() {
    }

    public Operacion(Integer Numero1, Integer Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    public Integer getNumero1() {
        return Numero1;
    }

    public void setNumero1(Integer Numero1) {
        this.Numero1 = Numero1;
    }

    public Integer getNumero2() {
        return Numero2;
    }

    public void setNumero2(Integer Numero2) {
        this.Numero2 = Numero2;
    }

    @Override
    public String toString() {
        return "Sus primer numero es: "+Numero1+", Su segundo numero fue: "+Numero2+" Las Operaciones fueron: ";
    }

}

