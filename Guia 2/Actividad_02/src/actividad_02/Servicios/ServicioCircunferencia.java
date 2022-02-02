package actividad_02.Servicios;

import actividad_02.Elementos.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
public Circunferencia crearCircunferencia(){
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    Circunferencia r = new Circunferencia();
    System.out.println("Escriba el Radio");
    r.setRadio(Leer.nextDouble());
    return r;
}
public void Area(Circunferencia c){
    double a;    
    a=Math.PI * Math.pow(c.getRadio(), 2);
    System.out.println("El Area de su Radio es: "+a);
}
public void Perimetro(Circunferencia c){
    double p;
    p=2 * Math.PI *c.getRadio();
    System.out.println("El Perimetro de su Radio es "+p);
} 

}

