package actividad_03.Servicios;

import actividad_03.Entidades.Baraja;
import actividad_03.Entidades.Carta;

public class ServicioCarta {
public Carta crearCarta(String[] palo,Integer Numero,int num){
    Carta c= new Carta();
    c.setNumero(Numero);
    c.setPalo(palo[num]);
    return c;
}

}

