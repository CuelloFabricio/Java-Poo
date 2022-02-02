
package Actividad_22;

import java.util.Scanner;

public class Act22Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        int[] Vec;
        int N,dig1=0,dig2=0,dig3=0,dig4=0,dig5=0;
         System.out.println("Que tamaño Decea que tenga su Vector?");
         N=Leer.nextInt();
         Vec = new int [N];
         for (int i=0;i<Vec.length;i++){
             Vec[i]= (int) (Math.random()*10000);
         }
         for (int i=0;i<Vec.length;i++){
          if (Vec[i]<10){
              dig1=dig1+1;
          }else if((Vec[i]>10)&&(Vec[i]<100)){
              dig2=dig2+1;
          }else if(((Vec[i]>100)&&(Vec[i]<1000))){
              dig3=dig3+1;
          }else if(((Vec[i]>1000)&&(Vec[i]<10000))){
              dig4=dig4+1;
          }else if(Vec[i]>10000){
              dig5=dig5+1;
          }
         }
         System.out.println("En el Vector se encuentran "+dig1+" de un digito, "+dig2+" De dos digitos, "+dig3+" De tres digitos, "+dig4+" De cuatro Digitos y "+dig5+" De cinco digitos");
    }
    
}
