package actividad_08.Entidades;


public class Cadena {
private String Frase;
private Integer Longitud;

    public Cadena() {
    }

    public Cadena(String Frase, Integer Longitud) {
        this.Frase = Frase;
        this.Longitud = Longitud;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public Integer getLongitud() {
        return Longitud;
    }

    public void setLongitud(Integer Longitud) {
        this.Longitud = Longitud;
    }

}

