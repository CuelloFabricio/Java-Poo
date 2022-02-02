package actividad_02.Servicios;

import actividad_02.Entidades.Juego;
import actividad_02.Entidades.Jugador;
import actividad_02.Entidades.Revolver;
import java.util.ArrayList;

public class ServicioJuego {
public Juego llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
    Juego j = new Juego();
    j.setJugadores(jugadores);
    j.setRevolver(r);
    return j;
}
public void ronda(Juego j){
    ArrayList<Jugador>jugadores= j.getJugadores();
    ServicioJugador jj =new ServicioJugador();
    int ronda=1;
    boolean Bucle=true;
   do{
        for (Jugador jugador : jugadores) {
        if (jj.disparo(j.getRevolver(), jugador)){
            System.out.println("El "+jugador.getNombre()+" "+jugador.getId()+" Se a Mojado!!");
            System.out.println("Duro Hasta la Ronda N°"+ronda);
            Bucle=false;
            break;
        }else{
            System.out.println("Se Salvo");
            System.out.println("Ronda N°"+ronda);
            System.out.println("-----------------------");
        }
        ronda++;
    }
   }while(Bucle);
}
}

