package actividad_05.Servicios;

import actividad_05.Entidades.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ServicioPais {
HashSet<Paises> set = new HashSet<>();
Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void crearPais(){
        Paises p = new Paises();
        System.out.println("Escriba un Pais");
        p.setNombre(sc.next());
        set.add(p);
    }
    public void mostrarOrdenado(){
        ArrayList<Paises> paiseslista= new ArrayList(set);
        paiseslista.sort(Paises.compararPaises);
        for (Paises p : paiseslista) {
            System.out.println(p.toString());
        }
    }
    public void eliminarPais(){   
        int contador=0;
        System.out.println("Que Pais Decea Sacar?");
        String p=sc.next();
    Iterator<Paises> it = set.iterator();
    while(it.hasNext()){
        if(it.next().getNombre().equalsIgnoreCase(p)){
            it.remove();
            contador=1;
        }
    }
    
    if (contador==0){
        System.out.println("No se encuetra el pais");
    }
    
    }
}

