
package Actividad_13;

import java.util.Scanner;

public class Act13Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        int Limite;
        int n,suma,I,j;
        suma = 0;
        I=1;
        j=0;
         System.out.println("Escribe el Numero Positivo a superar");
       do{
           if (j!=0){
               System.out.println("Error su Numero es negativo");
           }
           Limite=Leer.nextInt();
           j=j+1;
       } while(Limite<0);
        
        do{
            System.out.println("Escriba Su Numero N°"+I);
            n=Leer.nextInt();
            suma=suma+n;
            I=I+1;
        }while (suma<Limite);
    
    }
    
}
