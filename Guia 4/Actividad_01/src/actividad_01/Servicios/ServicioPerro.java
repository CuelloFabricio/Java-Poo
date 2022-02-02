package actividad_01.Servicios;

import actividad_01.Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioPerro {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Perro> crearPerro(){
        System.out.println("Cuantos Perros Hay?");
        Integer num=sc.nextInt();
        ArrayList<Perro> lpp = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Perro perro = new Perro();
            System.out.println("Informacion del Perro");        
            System.out.println("Nombre:");        
            perro.setNombre(sc.next());        
            System.out.println("Raza:");       
            perro.setRaza(sc.next());        
            System.out.println("Edad:");        
            perro.setEdad(sc.nextInt());        
            System.out.println("Tamaño:");        
            perro.setTamaño(sc.next());        
            lpp.add(perro);
        }
        return lpp;
    }
    public Perro adoptarPerro(ArrayList<Perro> lpp){
        
       int contador = 0;
       Perro p;
        if (lpp.size()>1){
        System.out.println("Cual Perro Decea Adoptar El Cliente?");
        for (Perro pp : lpp) {
            System.out.println("Opcion N°"+(contador+1)+"-"+pp.toString());
            contador=contador+1;
        }
        Integer opcion=sc.nextInt();
        
        p=lpp.get(opcion-1);
        
        lpp.remove(opcion-1);
        
        }else{
        
            p=lpp.get(0);
        }
        return p;
    }
}
