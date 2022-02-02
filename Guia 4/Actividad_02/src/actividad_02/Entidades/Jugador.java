package actividad_02.Entidades;


public class Jugador {
private Integer Id;
private String Nombre;
private Boolean Mojado;

    public Jugador() {
    }

    public Jugador(Integer Id, String Nombre, Boolean Mojado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Mojado = Mojado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Boolean getMojado() {
        return Mojado;
    }

    public void setMojado(Boolean Mojado) {
        this.Mojado = Mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Id=" + Id + ", Mojado=" + Mojado + '}';
    }

}

