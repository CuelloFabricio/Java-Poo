
package actividad_12;

import actividad_12.Entidades.Persona;
import actividad_12.Servicios.ServicioPersona;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Scanner sc= new Scanner(System.in).useDelimiter("\n");
        Persona p=sp.crearPersona();
        System.out.println("-----------------------------");
        System.out.println("Su edad es de: "+sp.calcularEdad(p));
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Ingrese La edad con la que decee comparar");
        int Edad=sc.nextInt();
        boolean Comparar=sp.menorQue(p, Edad);
        if (Comparar==true){
            System.out.println("El Es menor");
        }else{
            System.out.println("El Es mayor");
        }
        System.out.println("");
        System.out.println("-----------------------------");
        sp.mostrarPersona(p);
    }

}
