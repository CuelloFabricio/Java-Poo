
package Actividad_15;

import java.util.Scanner;

public class Act15Main {

    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in).useDelimiter("\n");
       int sumar,num,c;
       sumar = 0;
       c = 1;
       
       for (int i=0;i<20;i++){
           System.out.println("Escribe el numero el n°"+c);
           num = Leer.nextInt();
           if (num==0){
               System.out.println("Los numeros sumados de los "+i+" numeros es de "+sumar);
               break;
           }else if (num>0){
               sumar=sumar+num;
           }
           c=c+1; 
       }
        if (c-1==20){
            System.out.println("La suma de los 20 numeros es de "+sumar);
        }       
    }
    
}
