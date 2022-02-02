
package actividad_01_02;

import actividad_01_02.Entidades.Perro;
import actividad_01_02.Servicios.ServicioPerro;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     ServicioPerro sp = new ServicioPerro();
     ArrayList<Perro> l = new ArrayList<>();
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     boolean Bucle=true;
     int contador=0;
     String Raza;
     do{
         sp.crearPerro(l);
         if (contador!=0){
             System.out.println("Decea Eliminar Alguna Raza");
             String Opcion2=sc.next();
             if (Opcion2.equalsIgnoreCase("Si")){
                 System.out.println("Que Raza Decea Sacar?");
                 Raza=sc.next();
                 sp.sacarPerro(l, Raza);
             }
         }
         
         System.out.println("Usted decea Seguir Creando Perros?");
         String Opciones=sc.next();
         if (Opciones.equalsIgnoreCase("No")){
             Bucle=false;
         }
         contador=1;
     }while(Bucle);
        System.out.println("Su Lista: ");
        sp.mostrarPerro(l);
    }

}
