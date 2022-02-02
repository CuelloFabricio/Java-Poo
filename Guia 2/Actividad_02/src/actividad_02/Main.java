
package actividad_02;

import actividad_02.Elementos.Circunferencia;
import actividad_02.Servicios.ServicioCircunferencia;


public class Main {

    public static void main(String[] args) {
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia Resp=sc.crearCircunferencia();
        System.out.println(Resp);
        sc.Area(Resp);
        sc.Perimetro(Resp);
    }

}
