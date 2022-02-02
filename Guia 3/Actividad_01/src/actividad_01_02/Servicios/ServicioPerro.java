package actividad_01_02.Servicios;

import actividad_01_02.Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ServicioPerro {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
public void crearPerro(ArrayList<Perro> l){
    System.out.println("Dicte una Raza");
    String Raza=sc.next();
    l.add(new Perro(Raza));
}
public void mostrarPerro(ArrayList<Perro> l){
    for (Perro p : l) {  
        System.out.println(p.getRaza()); 
    }    
}
public void sacarPerro(ArrayList<Perro> l,String p){
    int contador=0;
    Iterator<Perro> it = l.iterator();
    while(it.hasNext()){
        if(it.next().getRaza().equalsIgnoreCase(p)){
            it.remove();
            contador=1;
        }
    }
    
    if (contador==0){
        System.out.println("No se encuetra en la lista");
    }
}
}

