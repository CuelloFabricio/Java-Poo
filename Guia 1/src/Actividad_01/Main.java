
package Actividad_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int num1,num2,suma;
     System.out.println("Elige un numero");  
   num1=leer.nextInt();
   System.out.println("Elige Otro numero"); 
   num2=leer.nextInt();
   suma=num1+num2;
   System.out.println("La suma de tu numero es:");  
           System.out.print(suma);
           System.out.println("");
    }
    
}
