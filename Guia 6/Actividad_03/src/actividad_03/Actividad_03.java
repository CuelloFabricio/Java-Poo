
package actividad_03;
import java.util.Scanner;
public class Actividad_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        try{
            String n1, n2;
        System.out.print("Numero:");
        n1=sc.next();
        System.out.print("Numero:");
        n2=sc.next();
        Integer i = Integer.parseInt(n1);
        Integer i2= Integer.parseInt(n2);
        Integer d = i/i2;
            System.out.println(i);
            System.out.println(i2);
            System.out.println(d);
        }catch(Exception e){
            System.out.println(e.fillInStackTrace());
        }
        
        
    }

}
