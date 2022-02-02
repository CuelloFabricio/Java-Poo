
package Actividad_05;

import java.util.Scanner;

public class Act5Main {

    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       int Num;
       double p2,p3,r2;
     System.out.println("Escriba Su Numero");
       Num = Leer.nextInt();
       p2=Math.pow(Num, 2);
       p3=Math.pow(Num, 3);
       r2=Math.sqrt(Num);
       System.out.println("Su Numero Elevado a La 2 Es: "+p2);
       System.out.println("Su Numero Elevado a La 3 Es: "+p3);
       System.out.println("La Raiz Cuadrada De Su Numero Es: "+r2);
       System.out.println("");
    }
    
}
