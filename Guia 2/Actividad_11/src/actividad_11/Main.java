
package actividad_11;

import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Año:");
        int Año =sc.nextInt();
        System.out.println("Mes");
        int Mes =sc.nextInt();
        System.out.println("Dia");
        int dia =sc.nextInt();
        Date fecha =new Date(Año, Mes, dia);
        Date fechaActual=new Date();
        int diferencia= fechaActual.getYear()-fecha.getYear();
        System.out.println("Hay una diferencia de "+(diferencia + 1)+" Años");
    }

}
