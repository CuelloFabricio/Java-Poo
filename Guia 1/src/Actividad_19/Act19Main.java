
package Actividad_19;

import java.util.Scanner;

public class Act19Main {

    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    double Euros;
    String Cambio;
    boolean Bucle=false;
    System.out.println("Escriba La Cantidad de Euros que Convertir");
        Euros=Leer.nextInt();
        System.out.println("Recuerde Que L es para libras, D es para Dolares e Y es para Yenes");
    do{
         System.out.println("¿A Que Moneda Decea Convertir?");
          Cambio = Leer.next();
          switch(Cambio){
              case "L":
                  Bucle=true;
                  break;
              case "D":
                  Bucle=true;
                  break;
              case "Y":
                  Bucle=true;
                  break;
              default:
                      System.out.println("Error Recuerde que Solo Puede responder con L, D O Y ");
          }
    }while(Bucle==false);
    Convertidor(Euros,Cambio);
    }
    public static void Convertidor(double a,String b){
        double Convertir;
        String Moneda;
        Convertir=0.0;
        Moneda="";
        switch (b){
            case "L":
                Convertir = a * 0.86;
                Moneda=" Libras";
                break;
            case "D":
                Convertir = a * 1.28611;
                Moneda=" Dolares";
                break;
            case "Y":
                Convertir = a * 129.852;
                Moneda=" Yenes";
        }
        System.out.println("Sus "+a+" euros Convertidos es "+Convertir+Moneda);
    } 
    
}
