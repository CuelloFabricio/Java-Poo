
package actividad_01;

import actividad_01.Entidades.Animal;
import actividad_01.Entidades.Caballo;
import actividad_01.Entidades.Gato;
import actividad_01.Entidades.Perro;


public class Actividad_01 {

    public static void main(String[] args) {
     Animal P = new Perro("Stich", "Carnivoro", 15, "Doberman");
     P.alimentarse();
     Animal P1 = new Perro("Teddy", "Croquetas", 10, "chihuahua");
     P1.alimentarse();
     Animal G= new Gato("Pelusa", "Galletas", 15, "Siamez");
     G.alimentarse();
     Animal C= new Caballo("Spark", "Pasto", 25, "Fino");
     C.alimentarse();
    }

}
