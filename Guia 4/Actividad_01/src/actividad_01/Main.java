
package actividad_01;


import actividad_01.Entidades.Perro;
import actividad_01.Servicios.ServicioPerro;
import actividad_01.Servicios.ServicioPersona;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     ServicioPersona sp=new ServicioPersona();
     ServicioPerro spp= new ServicioPerro();
     ArrayList<Perro> lpp = spp.crearPerro();
     sp.crearPersona(lpp);
     sp.mostrarPersona();
    }

}
