package actividad_02.Entidades;


public class Revolver {
private Integer PosicionActual;
private Integer PosicionAgua;

    public Revolver() {
    }

    public Revolver(Integer PosicionActual, Integer PosicionAgua) {
        this.PosicionActual = PosicionActual;
        this.PosicionAgua = PosicionAgua;
    }

    public Integer getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(Integer PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public Integer getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(Integer PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "PosicionActual=" + PosicionActual + ", PosicionAgua=" + PosicionAgua + '}';
    }

}

