
package actividad_06;

import actividad_06.Entidades.Cafetera;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     Cafetera c = new Cafetera();
     int Opciones;
     boolean Bucle=false;
     c=c.crearCafetera();
               
     do{ 
           System.out.println("Menu");        
           System.out.println("1.Llenar Cafetera");        
           System.out.println("2.Servir Taza");       
           System.out.println("3.Vaciar Cafetera");
           System.out.println("4.Agregar Cafe");
           System.out.println("5.Salir");
           Opciones=sc.nextInt();
           switch (Opciones){
               case 1:
                   c.llenarCafetera();
                   break;
               case 2:
                   c.servirTaza();
                   break;
               case 3:
                   c.vaciarCafetera();
                   break;
               case 4:
                   c.agregarCafe();
                   break;
               case 5:
                   Bucle=true;
           }
       }while(Bucle==false);
         
     }
     
    }


