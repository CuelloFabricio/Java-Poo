
package actividad_05;

import actividad_05.Entidades.Cuenta;
import actividad_05.Servicios.ServicioCuenta;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     ServicioCuenta Sc = new ServicioCuenta();
     boolean Bucle=false;
     int Opciones;
     Cuenta c=Sc.crearCuenta();
       do{ 
           System.out.println("Menu");        
           System.out.println("1.Ingresar");        
           System.out.println("2.Retirar");       
           System.out.println("3.Extraccion Rapida");
           System.out.println("4.Mostrar Saldo");
           System.out.println("5.Mostrar Datos");
           System.out.println("6.Salir");
           Opciones=sc.nextInt();
           switch (Opciones){
               case 1:
                   Sc.Ingreso(c);
                   break;
               case 2:
                   Sc.Retiro(c);
                   break;
               case 3:
                   Sc.extraccionRapida(c);
                   break;
               case 4:
                   Sc.consultarSaldo(c);
                   break;
               case 5:
                   Sc.consultarDatos(c);
                   break;
               case 6:
                   Bucle=true;
           }
       }while(Bucle==false);
    }

}
