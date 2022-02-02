package actividad_03.Servicios;

import actividad_03.Elementos.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
public Operacion crearOperacion(){
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    Operacion Num = new Operacion();
    System.out.println("Ingrese el primer numero");
    Num.setNumero1(Leer.nextInt());
    System.out.println("Ingrese el segundo numero");
    Num.setNumero2(Leer.nextInt());
    return Num;
} 
public void Suma(Operacion o){
    Integer sumar;
    sumar=o.getNumero1()+o.getNumero2();
    System.out.println("Suma: "+sumar);
}
public void Resta(Operacion o){
    Integer restar;
    restar=o.getNumero1()-o.getNumero2();
    System.out.println("Resta: "+restar);
}
public void Multiplicacion(Operacion o){
    Integer mult;
    if ((o.getNumero1()==0)||(o.getNumero2()==0)){
        System.out.println("se intento Multiplicar por 0");
        mult=0;
    }else{
        mult=o.getNumero1()*o.getNumero2();
    }
    System.out.println("Multiplicacion: "+mult);
}
public void Divicion(Operacion o){
    double Div;
    if ((o.getNumero1()==0)||(o.getNumero2()==0)){
        System.out.println("se intento Dividir por 0");
        Div=(int) 0;
    }else{
        Div=o.getNumero1()/o.getNumero2();
    }
    System.out.println("Divicion: "+Div);
}
}

