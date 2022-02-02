package actividad_03.Entidades;


public class Carta {
    private Integer Numero;
    private String Palo;

    public Carta() {
    }

    public Carta(Integer Numero, String Palo) {
        this.Numero = Numero;
        this.Palo = Palo;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "Numero=" + Numero + ", Palo=" + Palo + '}';
    }
    
}

