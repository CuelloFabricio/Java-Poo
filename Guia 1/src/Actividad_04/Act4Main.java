
package Actividad_04;
import java.util.Scanner;
public class Act4Main {
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       double C,F;
       System.out.println("Cuantos Grados Centigrados Hace?");
       C= Leer.nextDouble();
       F = 32 + (9 * C/5);
       System.out.println("La Temperatura Fahrenheit es de "+F+" Grados");
       System.out.println("");
    }
    
}
