
package actividad_04;

import actividad_04.Entidades.Rectangulo;
import actividad_04.Servicios.ServicioRectangulo;


public class Actividad_04 {

    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
       Rectangulo r=sr.crearRectangulo();
        System.out.print(r);
        sr.perimetro(r);
        sr.superficie(r);
        System.out.println("");
        sr.mostrarRectangulo(r);
    }

  
}
