
package actividad_04;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Actividad_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Double resultado=0.0;
        int l=0;
     try{
         System.out.print("Numero:");
          l = sc.nextInt();
         System.out.print("Numero:");
         String n = sc.next();
         Integer n1= Integer.parseInt(n);
         double d = l/n1;
         resultado = resultado+ d;
     }catch (InputMismatchException e){
        e.printStackTrace();
         System.out.print("");
     }catch (NumberFormatException en){
         en.printStackTrace();
         System.out.print("");
         resultado = resultado + l;
     }catch (ArithmeticException ea){
         ea.printStackTrace();
         System.out.print("");
     }finally{
         System.out.println("");
         System.out.println(resultado);
         System.out.println("-------------------------");
         
     }
     
    }
    

}
