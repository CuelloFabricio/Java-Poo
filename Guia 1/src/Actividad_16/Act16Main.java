
package Actividad_16;

import java.util.Scanner;

public class Act16Main {

    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    String Frase, CadenaX,CadenaO;
    int Largo,Correcto,Incorrecto,Contador,Bucle;
    Correcto = 0;
    Incorrecto = 0;
    Bucle=1;
    Contador=1;
    System.out.println("Reglamento:");
    System.out.println("1.Debe Empezar con X y Terminar con O");
    System.out.println("2.No Se puede poner mas de 5 Caracteres Contando L X y La O");
    do{
        if (Contador !=1){
            System.out.println("Cuando quiera terminar escriba &&&&&");
            System.out.println("");
        }
        System.out.println("Este es el "+Contador+"° Mensaje");
        Frase = Leer.nextLine();
        Largo=Frase.length();
        if (Largo<=5){
            CadenaO = Frase.substring(Largo-1,Largo);
            CadenaX = Frase.substring(0, 1);
            if ((CadenaX.equals("X"))&&(CadenaO.equals("O"))){
                Correcto = Correcto + 1;
            }else if(Frase.equals("&&&&&")){
                 Correcto = Correcto + 1;
               Bucle = 0;
            }else{
                Incorrecto = Incorrecto + 1;
            }
        }else{
            Incorrecto = Incorrecto + 1;
        }
        Contador = Contador + 1;
       }while (Bucle == 1);
    System.out.println("Los correctos Fueron "+ Correcto);
    System.out.println("Los incorrectos Fueron "+ Incorrecto);
    }
    
}
