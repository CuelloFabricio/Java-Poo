
package actividad_08;

import actividad_08.Entidades.Cadena;
import actividad_08.Servicios.ServiciosCadena;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ServiciosCadena Sc = new ServiciosCadena();
        Cadena c = Sc.crearCadena(); 
        int Opciones;
        boolean Bucle=false;
        System.out.println("Elije una de las 7 Opciones");
        System.out.println("Para salir escriba 0");
        do{
            Opciones=sc.nextInt();
            switch(Opciones){
                case 1:
                    Sc.mostrarVocales(c);
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    Sc.invertirFrase(c);
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    System.out.println("Que Letras deceas saber si se repite? ");
                    String letra=sc.next();
                    Sc.vecesRepetido(c, letra);
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    System.out.println("Escribe Otra frase");
                    String frase=sc.next();
                    Sc.compararLongitud(c, frase);
                    System.out.println("------------------------------------");
                    break;
                case 5:
                    System.out.println("Escribe Otra frase");
                    String frase1=sc.next();
                    Sc.unirFrase(c, frase1);
                    System.out.println("------------------------------------");
                    break;
                case 6:
                    System.out.println("Elija un Caracter");
                    String letra1=sc.next();
                    Sc.reemplazar(c, letra1);
                    System.out.println("------------------------------------");
                    break;
                case 7:
                    System.out.println("Elija un Caracter");
                    String letra2=sc.next();
                    Sc.contiene(c, letra2);
                    System.out.println("------------------------------------");
                    break;
                default:
                    Bucle=true;
            }
            
        }while(Bucle==false);
    }

}
