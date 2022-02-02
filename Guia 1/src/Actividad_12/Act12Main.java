
package Actividad_12;

import java.util.Scanner;

public class Act12Main {

    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in).useDelimiter("\n");
       int n;
       System.out.println("Escoja un numero del 1 al 10");
       do{
          n=Leer.nextInt();
           if ((n>=0)&&(n<=10)){
                System.out.println("Correcto");
           }else{
                System.out.println("Su numero no esta entre 1 y 10");
                 System.out.println("Ingrese su numero nuevamente");
           }
       }while((n<0)||(n>10));
          
       
    }
    
}
