package actividad_12.Servicios;

import actividad_12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class ServicioPersona {
public Persona crearPersona(){
    Persona p = new Persona();
    Scanner sc= new Scanner(System.in).useDelimiter("\n");
    int Año,Mes,Dia;
    System.out.println("Nombre:");
    p.setNombre(sc.next());
    System.out.println("Fecha de Nacimiento:");
    System.out.println("Año:");
    Año=sc.nextInt();
    System.out.println("Mes:");
    Mes=sc.nextInt();
    System.out.println("Dia:");
    Dia=sc.nextInt();
    if (Año<=21){
        Año = Año+100;
    }
    Date f = new Date(Año, Mes, Dia);
    p.setNacimiento(f);
    return p;
}

public Integer calcularEdad(Persona p){
    Integer Edad;
    Date f = new Date(121, 12, 9);
    Edad=f.getYear()- p.getNacimiento().getYear();
    return Edad;
}

public boolean menorQue(Persona p,int Edad2){
    int Edad = calcularEdad(p);
    boolean Menor;
    Menor = Edad < Edad2;
    return Menor;
}

public void mostrarPersona(Persona p){
    int Edad = calcularEdad(p);
    System.out.println("Nombre: "+p.getNombre());
    System.out.println("Edad: "+Edad);
    System.out.println("Fecha de Nacimento: "+p.getNacimiento());
}
}

