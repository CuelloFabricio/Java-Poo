
package Actividad_26;

import java.util.Scanner;

public class Act26Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        int[][]M;
        int[][]P;
        int its=0;
        M = new int [10][10];
        P = new int [3][3];
        System.out.println("¿Cual es La matriz Enorme?");
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                M[i][j]=Leer.nextInt();
            }
        }
        System.out.println("¿Cual es La Sub matriz a Buscar?");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                P[i][j]=Leer.nextInt();
            }
        } 
         for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                for (int k=0; k<3; k++){
                    for (int l=0; l<3; l++){
                        if (M[i+k][j+l]==P[k][l]){
                            its=its+1;
                        }
                    }
                }
                if (its==9){
                    System.out.println(i+", "+j);
                    its=0;
                }else{
                    its=0;
                }
            }
        }
    }    
}
