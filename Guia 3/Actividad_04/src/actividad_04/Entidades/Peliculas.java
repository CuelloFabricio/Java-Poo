package actividad_04.Entidades;

import java.util.Comparator;


public class Peliculas {
    private String Titulo;
    private String Director;
    private Integer Horas;

    public Peliculas() {
    }

    public Peliculas(String Titulo, String Director, Integer Horas) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Horas = Horas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer Horas) {
        this.Horas = Horas;
    }
    
    public static Comparator<Peliculas> compararHorario = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getHoras().compareTo(t.getHoras());
        }
    };

    @Override
    public String toString() {
        return "Pelicula-->" +" Director: " + Director +  ", Titulo: " + Titulo + ", Horas=" + Horas;
    }
    public static Comparator<Peliculas> compararHorarioMenos = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getHoras().compareTo(t1.getHoras());
        }
    };
    public static Comparator<Peliculas> compararTitulo = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Peliculas> compararDirector = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}

