
package Actividad_07;

import java.util.Scanner;


public class Act7Main {

    
    public static void main(String[] args) {
      Scanner Leer = new Scanner(System.in).useDelimiter("\n");
      int n,n2;
      System.out.println("Escribe un Numero");
      n=Leer.nextInt();
      n2=(n % 2);
    if (n2==0){
        System.out.println("Tu Numero Es Par");
    }else{
        System.out.println("Tu Numero Es Impar");
    }
              
    }
    
}
