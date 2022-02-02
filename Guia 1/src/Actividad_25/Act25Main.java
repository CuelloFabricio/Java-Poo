
package Actividad_25;

import java.util.Scanner;

public class Act25Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        int[][] a= new int [3][3];
        int sumaA=0,sumaB=0,suma=0, Resp=0,suma2=0;
         boolean Verificar = false;
        
        System.out.println("Escribe los numeros de tu matriz"); 
	for (int i=0; i < 3 ; i++){
            for (int j=0; j < 3 ; j++){
                do{
                    a[i][j]=Leer.nextInt();
                    if ((a[i][j] >= 10)||(a[i][j] <= 0)){
                        System.out.println("Error Compruebe denuevo");
                    }
                }while((a[i][j] >= 10)||(a[i][j] < 0));
                
            }
        }
        
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    for (int k=0 ; k<3 ; k++){
                        sumaA=sumaA + (a[k][j]);
                        sumaB=sumaB + (a[i][k]);
                        for (int m=0; m < 3; m++){
                            if (k==m){
                                suma=suma + (a[k][m]);
                            }
                            if (k+m == 3){
                                suma2 = suma2 + (a[k][m]);
                            }
                        }
                        
                    }
                   if ((sumaA== sumaB)&&(sumaA==suma)&&(sumaA==suma2)){
                       Verificar=true;
                   }else{
                       Verificar=false;
                       Resp=Resp + 1;
                   }
                }
            }
         if (Resp != 0){
             Verificar = false;
             
         }   
           if (Verificar==true){
               System.out.println("Su Matriz Es un Cuadrado Magico");
           }else{
               System.out.println("Su Matriz No Es un Cuadrado Magico");
           }
        }
    }
	
   
