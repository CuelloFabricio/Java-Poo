
package Actividad_08;

import java.util.Scanner;

public class Act8Main {

    public static void main(String[] args) {
        Scanner Leer= new Scanner(System.in).useDelimiter("\n");
        String Frase,Palabra;
        System.out.println("Indica La Palabra Secreta");
        Frase=Leer.nextLine();
        Palabra="eureka";
        if (Palabra.equals(Frase)){
        System.out.println("Correcto");
    }else{
        System.out.println("Incorrecto");
    }
      
    }
    }
