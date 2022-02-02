
package Actividad_06;

import java.util.Scanner;


public class Act6Main {

  
    public static void main(String[] args) {
      Scanner Leer = new Scanner(System.in).useDelimiter("\n");
      int N,N2;
      System.out.println("Escribe un Numero");
      N=Leer.nextInt();
      System.out.println("Escribe un Segundo Numero");
      N2=Leer.nextInt();
        if(N>N2){
            System.out.println("El Mayor Numero Es "+ N);
           }else{
            System.out.println("El Mayor Numero Es "+ N2);
        }
    }
    
}
