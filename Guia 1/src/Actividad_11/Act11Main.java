
package Actividad_11;

import java.util.Scanner;

public class Act11Main {

    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    int tipoMotor;
    System.out.println("Que Tipo De los 4 Motores Tienes");
    tipoMotor = Leer.nextInt();
    switch (tipoMotor){
        case 1:
            System.out.println("La bomba es una bomba de agua");
            break;
        case 2:
             System.out.println("La bomba es una bomba de Gasolina");
             break;
        case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
        case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        default:
            System.out.println("No existe un valor válido para tipo de bomba");
    }
    }
    
}
