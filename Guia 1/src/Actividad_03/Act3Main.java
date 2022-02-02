
package Actividad_03;

import java.util.Scanner;

public class Act3Main {

    public static void main(String[] args) {
       String Frase,Min,May;
       Scanner Leer = new Scanner(System.in);
       System.out.println("Escriba una Frase");
       Frase=Leer.nextLine();
       Min=Frase.toLowerCase();
       May=Frase.toUpperCase();
       System.out.println("Su Frase en Minuscula es: "+ Min);
       System.out.println("Su Frase en Mayuscula es: "+ May);
       System.out.println("");
    }
    
}
