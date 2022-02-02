
package Actividad_17;

import java.util.Scanner;

public class Act17Main {

    public static void main(String[] args) {
         Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        String Espacio, Concatenar,Frase;
        int num;
        num = Leer.nextInt();
        Espacio="";
        Concatenar="  ";
        Frase="* ";
        for (int i=0;i < num ; i++){
          for (int j = 0; j < num; j++){
              if (((i==num-1) || (i==0))||((j==0) || (j==num-1))){
                  if ( Espacio.equals("")){
                      Espacio = Frase;
                  }else{
                      Espacio=Espacio.concat(Frase);
                  }
              }else{
                  if ( Espacio.equals("")){
                      Espacio = Concatenar;
                  }else{
                      Espacio=Espacio.concat(Concatenar);
                  }
              }
          }
          System.out.println(Espacio);
          Espacio="";  
        }
    }
}
