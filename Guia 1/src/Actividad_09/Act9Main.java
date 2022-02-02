
package Actividad_09;

import java.util.Scanner;

public class Act9Main {

    public static void main(String[] args) {
     Scanner Leer = new Scanner(System.in).useDelimiter("\n");
     int Longitud;
     String Frase;
     System.out.println("Escriba Una palabra de 8 letras");
     Frase=Leer.nextLine();
     Longitud=Frase.length();
     if (Longitud==8){
         System.out.println("Correcto");
     }else{
         System.out.println("Incorrecto");
     }
    }
    
}
