package actividad_02.Entidades;

import java.util.ArrayList;


public class Juego {
private ArrayList<Jugador> Jugadores;
private Revolver Revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> Jugadores, Revolver Revolver) {
        this.Jugadores = Jugadores;
        this.Revolver = Revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Revolver getRevolver() {
        return Revolver;
    }

    public void setRevolver(Revolver Revolver) {
        this.Revolver = Revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "Jugadores=" + Jugadores + ", Revolver=" + Revolver + '}';
    }

}

