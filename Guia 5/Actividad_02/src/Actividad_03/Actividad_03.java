
package Actividad_03;

import actividad_02.Entidades.Electrodomesticos;
import actividad_02.Entidades.Lavadora;
import actividad_02.Entidades.Televisor;
import java.util.ArrayList;
public class Actividad_03 {

    public static void main(String[] args) {
        ArrayList<Electrodomesticos> le = new ArrayList<>();
        Double pfLavadora = 0.0, pfTelevisor = 0.0, pfElectrodomestico = 0.0;
        for (int i = 0; i < 2; i++) {
            Lavadora l = new Lavadora(31, "Blanco", "A", 20);
            le.add(l);
        }
        for (int i = 0; i < 2; i++) {
            Televisor t = new Televisor(41, true, "Blanco", "A", 20);
            le.add(t);
        }
        for (Electrodomesticos e : le) {
            if (e instanceof Lavadora) {
                pfLavadora = pfLavadora + e.getPrecio();
            } else if (e instanceof Televisor) {
                pfTelevisor = pfTelevisor + e.getPrecio();
            }
            pfElectrodomestico = pfElectrodomestico + e.getPrecio();
        }
        System.out.print("Precio de los Televisores:");
        System.out.println(pfTelevisor);
        System.out.print("Precio de las Lavadoras:");
        System.out.println(pfLavadora);
        System.out.print("Precio Total:");
        System.out.println(pfElectrodomestico);
    }

}
