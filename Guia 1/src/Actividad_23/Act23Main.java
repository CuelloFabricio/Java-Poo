
package Actividad_23;

public class Act23Main {

    public static void main(String[] args) {
        int[][] Matriz;
        Matriz = new int [4][4];
        for (int i=0 ; i<4 ; i++){
            for (int j=0 ; j<4 ; j++){
                Matriz[i][j]= (int) (Math.random()*10);
                
            }
        }
         for (int i=0 ; i<4 ; i++){
            for (int j=0 ; j<4 ; j++){
                System.out.print(Matriz[j][i]);
            }
            System.out.println("");
        }
         
    }
    
}
