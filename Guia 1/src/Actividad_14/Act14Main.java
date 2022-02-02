
package Actividad_14;

import java.util.Scanner;

public class Act14Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        int Opciones,N1,N2,i;
        double Resultado;
        String Seguridad;
       i = 0;
        
        
        
        
      do{
            System.out.println("*******************");
            System.out.println("*    MENU         *");
            System.out.println("*  1.SUMAR        *");
            System.out.println("*  2.RESTAR       *");
            System.out.println("*  3.MULTIPLICAR  *");
            System.out.println("*  4.DIVIDIR      *");
            System.out.println("*  5.SALIR        *");
            System.out.println("*******************");
           Opciones=Leer.nextInt();
           switch (Opciones){
               case 1:
                   System.out.println("Que Numeros decea sumar");
                   N1=Leer.nextInt();
                   N2=Leer.nextInt();
                   Resultado=N1 + N2;
                   System.out.println("El resultado de tu suma es "+Resultado);
                   break;
               case 2:
                   System.out.println("Que Numeros decea restar");
                   N1=Leer.nextInt();
                   N2=Leer.nextInt();
                   Resultado=N1 - N2;
                   System.out.println("El resultado de tu resta es "+Resultado);
                   break;
               case 3:
                   System.out.println("Que Numeros decea multiplicar");
                   N1=Leer.nextInt();
                   N2=Leer.nextInt();
                   Resultado=N1 * N2;
                   System.out.println("El resultado de tu multiplicacion es "+Resultado);
                   break;
               case 4:
                   System.out.println("Que Numeros decea dividir");
                   N1=Leer.nextInt();
                   N2=Leer.nextInt();
                   Resultado=N1 / N2;
                   System.out.println("El resultado de tu multiplicacion es "+Resultado);
                   break;
               case 5:
                   System.out.println("USTED ESTA SEGURO CON S/N");
                   Seguridad=Leer.next();
                   if (Seguridad.equals("S")){
                       i = i + 1;
                   }
                   
           }
        }while(i<=0);
        
  
    }
    
}
