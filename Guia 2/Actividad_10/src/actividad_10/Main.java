
package actividad_10;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
     double [] A=new double[50];
     double [] B=new double[20];
        System.out.println("El primer vector es: ");
        llenarVectorA(A);
        mostrarVector(A);
        Arrays.sort(A); 
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Ordenado....");
        mostrarVector(A);
        llenarVectorB(A, B);
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("El segundo vector es: ");
        mostrarVector(B);
    }

    public static void llenarVectorA(double[] A){
        for (int i = 0; i < A.length; i++) {
            A[i]=(double)(Math.random()*10);
        }
    }
    
    public static void mostrarVector(double[]v){
        for (int i = 0; i < v.length; i++) {
            if (i < 9){
                System.out.println("N°0"+(i+1)+": "+v[i]);
            }else{
                System.out.println("N°"+(i+1)+": "+v[i]);
            }
        }
    }
    
    public static void llenarVectorB(double[]A,double[]B){
        for (int i = 0; i < 10; i++) {
            B[i]=A[i];
        }
        for (int i = 10; i < 20; i++) {
            B[i]=0.5;
        }
    }
}
