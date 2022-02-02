
package actividad_04;

import actividad_04.Servicios.ServicioPelicula;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bucle=true;
        do{
            sp.crearPelicula();
            System.out.println("Usted Quiere Seguir Agregando Peliculas?");
            String op=sc.next();
            if (op.equalsIgnoreCase("No")){
                bucle=false;
            }
        }while(bucle);
        System.out.println("Esta es su lista: ");
        sp.mostrarPeliculas();
        System.out.println("----------------------");
        System.out.println("Esta es la lista sacando las peliculas menores a 1 hora ");
        sp.mostrarPeliculasDuracion();
        System.out.println("----------------------");
        System.out.println("Esta es su lista ordenada de Mayor a menor el horario ");
        sp.ordenarHorarioMayor();
        System.out.println("----------------------");
        System.out.println("Esta es su lista ordenada de Menor a mayor el horario ");
        sp.ordenarHorarioMenor();
        System.out.println("----------------------");
        System.out.println("Esta es su lista ordenando Alfabeticamente el Titulo ");
        sp.ordenarTitulo();
        System.out.println("----------------------");
        System.out.println("Esta es su lista ordenando Alfabeticamente el Director ");
        sp.ordenarDirector();
        
    }

}
