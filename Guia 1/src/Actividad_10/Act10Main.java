
package Actividad_10;

import java.util.Scanner;

public class Act10Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        String Frase,Letra,Comi;
        System.out.println("Escriba Una Frase Que Empiece en A");
        Frase=Leer.nextLine();
        Comi=Frase.substring(0, 1);
        Letra="A";
        if (Comi.equals(Letra)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
               
    }
    
}
