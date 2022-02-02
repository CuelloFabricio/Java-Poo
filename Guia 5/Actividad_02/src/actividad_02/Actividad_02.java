
package actividad_02;

import actividad_02.Entidades.Lavadora;
import actividad_02.Entidades.Televisor;

public class Actividad_02 {

    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();
        System.out.println("Lavadora:");
        l.crearLavadora();
        System.out.println("Televisor:");
        t.crearTelevisor();
        System.out.println(l.toString());
        System.out.println(t.toString());
    }

}
