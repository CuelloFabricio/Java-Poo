package actividad_04.Servicios;

import actividad_04.Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioPelicula {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> lista= new ArrayList();
    public void crearPelicula(){
        Peliculas p= new Peliculas();
        System.out.println("Cual es el titulo?");
        p.setTitulo(sc.next());
        System.out.println("Cuanto dura?");
        p.setHoras(sc.nextInt());
        System.out.println("Quien es el Director?");
        p.setDirector(sc.next());
        lista.add(p);
    }
    public void mostrarPeliculas(){
        for (Peliculas p : lista) {
            System.out.println(p.toString());
        }
    }
   public void mostrarPeliculasDuracion(){
        for (Peliculas p : lista) {
            if (p.getHoras()>1){
                System.out.println(p.toString());
            }
        }
    }
   public void ordenarHorarioMayor(){
    lista.sort(Peliculas.compararHorario);
    mostrarPeliculas();
   }
  public void ordenarHorarioMenor(){
    lista.sort(Peliculas.compararHorarioMenos);
    mostrarPeliculas();
   }
  public void ordenarTitulo(){
      lista.sort(Peliculas.compararTitulo);
    mostrarPeliculas();
  }
  public void ordenarDirector(){
      lista.sort(Peliculas.compararDirector);
    mostrarPeliculas();
  }
}


