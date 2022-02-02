package actividad_05.Entidades;

import java.util.Comparator;
import java.util.Objects;


public class Paises {
    private String Nombre;

    public Paises() {
    }

    public Paises(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.Nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    public static Comparator<Paises> compararPaises = new Comparator<Paises>(){
        @Override
        public int compare(Paises t, Paises t1) {
            return t.getNombre().compareTo(t1.getNombre());
}
    };
}
