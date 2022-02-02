
package actividad_03;

import actividad_03.Elementos.Operacion;
import actividad_03.Servicios.ServicioOperacion;


public class Actividad_03 {

    public static void main(String[] args) {
        ServicioOperacion so = new ServicioOperacion();
        Operacion num=so.crearOperacion();
        System.out.println(num);
        so.Suma(num);
        so.Resta(num);
        so.Divicion(num);
        so.Multiplicacion(num);
    }

}
