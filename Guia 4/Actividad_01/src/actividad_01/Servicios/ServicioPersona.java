package actividad_01.Servicios;

import actividad_01.Entidades.Perro;
import actividad_01.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioPersona {
ServicioPerro sp = new ServicioPerro();
Scanner sc = new Scanner(System.in).useDelimiter("\n");
ArrayList<Persona> lp = new ArrayList<>();
public void crearPersona(ArrayList<Perro> lpp){
    System.out.println("Cuantas Personas Hay Para Adoptar?");
    Integer num=sc.nextInt();
    for (int i = 0; i < num; i++) {
        Persona p = new Persona();
        System.out.println("Cliente N°"+(i+1));
        System.out.println("Nombre:");    
        p.setNombre(sc.next());    
        System.out.println("Apellido:");    
        p.setApellido(sc.next());    
        System.out.println("Edad:");    
        p.setEdad(sc.nextInt());    
        System.out.println("Dni:");    
        p.setDNI(sc.nextInt());
        p.setPerro(sp.adoptarPerro(lpp));
        lp.add(p);
    }
    
}
public void mostrarPersona(){
    for (Persona p : lp) {
            System.out.println(p.toString());
        System.out.println("--------------------------");
    }
}

}

