
package Actividad_21;

import java.util.Scanner;

public class Act21Main {

    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    int[] Vec;
    int num, Contador,Buscado;
    Contador=0;
    System.out.println("Que tamaño Decea que tenga su Vector?");
    num=Leer.nextInt();
    Vec = new int[num];
    for (int i=0;i<Vec.length;i++){
        Vec[i]= (int) (Math.random()*10);
    }
    System.out.println("Que Numero Quiere Buscar En El Vector?");
    Buscado = Leer.nextInt();
    for (int i=0;i<Vec.length;i++){
        if (Vec[i]==Buscado){
            Contador=Contador + 1;   
        }
    }
    if (Contador==0){
        System.out.println("Su Numero No Se Encontro");
    }else{
        System.out.println("El Numero "+Buscado+" Se Encontro "+Contador+" Veces");
    }
    }
    
}
