package actividad_05.Servicios;

import actividad_05.Entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
public Cuenta crearCuenta(){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cuenta c = new Cuenta();
    System.out.println("Ingrese el Numero de cuenta del Cliente");
    c.setNumeroCuenta(sc.nextInt());
    System.out.println("Ingrese el DNI");
    c.setDNI(sc.nextLong());
    System.out.println("Ingrese el Sueldo actual");
    c.setSaldoActual(sc.nextDouble());
    return c;
}
public void Ingreso(Cuenta c){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    double i;
    System.out.println("Ingrese Cuanto dinero Ingresara");
    i=sc.nextDouble();
    c.setSaldoActual(c.getSaldoActual()+i);
}
public void Retiro(Cuenta c){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    double r;
    double Resta;
    System.out.println("Ingrese Cuanto dinero retirara");
    r=sc.nextDouble();   
    Resta=c.getSaldoActual()-r;
    if (Resta < 0.0){
       c.setSaldoActual(0);
    }else{
       c.setSaldoActual(Resta);
    }
}
public void extraccionRapida(Cuenta c){
Scanner sc = new Scanner(System.in).useDelimiter("\n");

    double i,porsentaje;
    System.out.println("Cuanto decea retirar");
    System.out.println("Recuerde que solo puede retirar hasta el 20% de su Saldo");
    i=sc.nextDouble();
    porsentaje = (c.getSaldoActual()*20)/100;
    if (i>porsentaje){
        System.out.println("Error Usted solo puede sacar hasta el 20%");
        i=0;
    }
    c.setSaldoActual(c.getSaldoActual()-i);
}
public void consultarSaldo(Cuenta c){
    System.out.print("Su saldo actual es de: ");
    System.out.println(c.getSaldoActual());
}
public void consultarDatos(Cuenta c){
    System.out.print("El Numero de cuenta es: ");
    System.out.println(c.getNumeroCuenta());
    System.out.print("El DNI del cliente es: ");
    System.out.println(c.getDNI()); 
    System.out.print("Su saldo actual es de: ");
    System.out.println(c.getSaldoActual());
}
}

