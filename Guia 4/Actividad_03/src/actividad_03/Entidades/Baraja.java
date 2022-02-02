package actividad_03.Entidades;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> Cartas;
    private Carta CartaActual;
    private int Contador;
    
    public Baraja() {
        this.Contador=0;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

    public Baraja(ArrayList<Carta> Cartas, Carta CartaActual) {
        this.Cartas = Cartas;
        this.CartaActual = CartaActual;
    }

    public ArrayList<Carta> getCartas() {
        return Cartas;
    }

    public void setCartas(ArrayList<Carta> Cartas) {
        this.Cartas = Cartas;
    }

    public Carta getCartaActual() {
        return CartaActual;
    }

    public void setCartaActual(Carta CartaActual) {
        this.CartaActual = CartaActual;
    }

    @Override
    public String toString() {
        return "Baraja{" + "Cartas=" + Cartas + ", CartaActual=" + CartaActual + '}';
    }
    
}

