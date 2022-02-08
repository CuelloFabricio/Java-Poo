
package actividad_02;

import actividad_02.Entidades.Aarray;
import java.util.ArrayList;
import java.util.Scanner;


public class Actividad_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
         try{
             int[] m = {3,4,2};
             for (int i = 0; i <= m.length; i++) {
                 System.out.println(m[i]);
             }
             
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e.fillInStackTrace());
         }
         System.out.println("--------------------------");
         try{
             ArrayList<Integer> l = new ArrayList<>();
         for (int i = 0; i < 3; i++) {
             l.add(i);
         }
             for (int i = 0; i <= l.size(); i++) {
                 System.out.println(l.get(i));
             }

         }catch(IndexOutOfBoundsException e){
             System.out.println(e.fillInStackTrace());
         }
         System.out.println("--------------------------");
         try{
             Aarray a = new Aarray();
             int[] v = a.getVector();
             for (int i = 0; i <= v.length; i++) {
                 System.out.println(v[i]);
             }
             
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e.fillInStackTrace());
         }
         System.out.println("--------------------------");
         try{
             Aarray a = new Aarray();
             int[][] m = a.getMatriz();
             for (int i = 0; i <= m.length; i++) {
                 for (int j = 0; j <= m[i].length; j++) {
                     System.out.println(m[i][j]);
                 }
                 System.out.println("-------");
             }
             
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e.fillInStackTrace());
         }
     }
    }
