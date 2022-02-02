
package actividad_03;

import actividad_03.Entidades.Alumnos;
import actividad_03.Servicios.ServicioAlumno;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     ServicioAlumno sa = new ServicioAlumno();
     ArrayList<Alumnos> a = new ArrayList<>();
     boolean Bucle=true;
     do{
         sa.crearAlumno(a);
         System.out.println("Usted decea Seguir Creando Alumnos?");
         String Opciones=sc.next();
         if (Opciones.equalsIgnoreCase("No")){
             Bucle=false;
         }
     }while(Bucle);
     double NotaFinal=sa.notaFinal(a);
     if (NotaFinal==-1){
         System.out.println("Adios!");
     }else{
         System.out.println("La nota Final Del Alumno Es de: "+NotaFinal);
         System.out.println("Adios!");
     }
        
    }

}
