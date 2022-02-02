
package actividad_05;

import actividad_05.Servicios.ServicioPais;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
      ServicioPais sp =new ServicioPais();
      boolean Bucle=true;
      do{
          sp.crearPais();
          System.out.println("Usted Decea Seguir Agregando Paises?");
          String op=sc.next();
          if (op.equalsIgnoreCase("No")){
              Bucle=false;
          }
      }while(Bucle);
      sp.mostrarOrdenado();
      sp.eliminarPais();
      sp.mostrarOrdenado();
    }

}
