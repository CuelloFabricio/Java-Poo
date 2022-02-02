
package Actividad_24;

import java.util.Scanner;

public class Act24Main {

    public static void main(String[] args) {
        Scanner Leer= new Scanner(System.in).useDelimiter("\n");
        int[][] Matriz;
        int N,N2,Contador;
        boolean Confirmar=false;
        Contador=0;
        System.out.println("Cuantas Filas Quiere que tenga su Matriz?");
         N=Leer.nextInt();
         System.out.println("Cuantas Columnas quiere que tenga su Matriz?");
         N2=Leer.nextInt();
        Matriz=new int [N][N2];
        System.out.println("Dicte su Matriz");
        for (int i=0; i<Matriz.length; i++){
            for (int j = 0; j<Matriz[i].length; j++){
                Matriz[i][j]=Leer.nextInt();
            }
        }
        for (int i=0; i<Matriz.length; i++){
            for (int j = 0; j<Matriz[i].length; j++){
                if (Matriz[i][j]==-Matriz[j][i]){
                   Confirmar=true; 
                }else{
                    Confirmar=false;
                    Contador=Contador + 1;
                }
            }
        }
        if(Contador != 0){
            Confirmar=false;
        } 
        if(Confirmar==true){
            System.out.println("Su Matriz es Anti Simetrica");   
        }else{
            System.out.println("Su Matriz No es Anti Simetrica");
        }   
    }
    
}
