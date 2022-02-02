
package Actividad_18;

import java.util.Scanner;

public class Act18Main {

    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    int num,Contador;
     String Espacio, Frase;
      
      Frase=" *";
    Contador=0;
    do{
        System.out.println("Escribe el "+(Contador+1)+"° numero");
        num=Leer.nextInt();
        if ((num <= 0) || (num >= 21)){
            System.out.println("No Puede ser menor a 1 ni mayor a 20");
            continue;
        }
        Espacio="";
        for (int j = 0; j < num; j++){
            if ( Espacio.equals("")){
                Espacio = Frase;
            }else{
                Espacio=Espacio.concat(Frase);  
            }    
        }
        System.out.println(num+"."+Espacio);
        Contador=Contador+1;
    }while(Contador!=4);
    }
    
}
