package actividad_02.Servicios;

import actividad_02.Entidades.Jugador;
import actividad_02.Entidades.Revolver;


public class ServicioJugador {
  ServicioRevolver sr = new ServicioRevolver();
  public Jugador crearJugador(int i){
      Jugador j = new Jugador();
            j.setId(i+1);
            j.setNombre("Jugador");
            return j;
  }
public Boolean disparo(Revolver r,Jugador j){
  boolean disparo=sr.mojar(r);
  sr.siguienteChorro(r);
  j.setMojado(disparo);
  return disparo;
}
}

