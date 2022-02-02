
package actividad_02;

import actividad_02.Entidades.Jugador;
import actividad_02.Servicios.ServicioJuego;
import actividad_02.Servicios.ServicioJugador;
import actividad_02.Servicios.ServicioRevolver;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     ServicioJuego sj = new ServicioJuego();
     ServicioRevolver sr = new ServicioRevolver();
     ServicioJugador sjj = new ServicioJugador();
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     ArrayList<Jugador> Jugadores = new ArrayList<>();
        System.out.println("Cuantos Jugadores son?");
        int num=sc.nextInt();
        if ((num >= 6)){
            num=7;
        }else if (num <= 1){
            num=1;
        }
        for (int i = 0; i < num; i++) {
            Jugador j= sjj.crearJugador(i);
            Jugadores.add(j);
        }
       sj.ronda(sj.llenarJuego(Jugadores, sr.llenarRevolver()));
    }
}
