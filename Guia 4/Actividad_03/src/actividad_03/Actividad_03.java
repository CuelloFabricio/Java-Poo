
package actividad_03;

import actividad_03.Entidades.Baraja;
import actividad_03.Servicios.ServicioBaraja;
import java.util.Scanner;

public class Actividad_03 {

    public static void main(String[] args) {
        ServicioBaraja sb = new ServicioBaraja();
        Baraja b = sb.llenarBaraja();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Boolean Bucle = true;
        System.out.println("********************************");
        System.out.println("**1-Mezclar la Baraja***********");
        System.out.println("**2-Dar Una Carta***************");
        System.out.println("**3-Cartas Sin Repartir*********");
        System.out.println("**4-Dar Mas De Una Cartas*******");
        System.out.println("**5-Todas Las Cartas Dadas******");
        System.out.println("**6-Cartas Que Aun No Salieron**");
        System.out.println("**7-Salir***********************");
        System.out.println("********************************");
        int Cont=0;
        do{ 
            if (Cont!=0){
                System.out.println("7-Para Salir");
                System.out.println("8-Para Ver Las Opciones Nuevamente");
            }
            System.out.print("Opcion:");
           int Opciones=sc.nextInt();
           Cont++;
           switch (Opciones){
               case 1:
                   sb.barajar(b);
                   break;
               case 2:
                   sb.siguienteCarta(b);
                   break;
               case 3:
                   sb.cartasDisponibles(b);
                   break;
               case 4:
                   sb.darCartas(b);
                   break;
               case 5:
                   sb.cartasMonton(b);
                   break;
               case 6:
                   sb.mostrarBaraja(b);
                   break;
               case 7:
                   Bucle=false;
                   break;
               default:
                   System.out.println("********************************");        
                   System.out.println("**1-Mezclar la Baraja***********");        
                   System.out.println("**2-Dar Una Carta***************");        
                   System.out.println("**3-Cartas Sin Repartir*********");        
                   System.out.println("**4-Dar Mas De Una Cartas*******");        
                   System.out.println("**5-Todas Las Cartas Dadas******");        
                   System.out.println("**6-Cartas Que Aun No Salieron**"); 
                   System.out.println("**7-Salir***********************");
                   System.out.println("********************************");
                   Cont=0;
           }
        }while(Bucle);
        
    }
}
