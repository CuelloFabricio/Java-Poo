package actividad_03.Servicios;

import actividad_03.Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
public void crearAlumno(ArrayList<Alumnos> a){
    ArrayList<Integer> notas =new ArrayList<>();
    System.out.println("Nombre:");
    String nom=sc.next();
    System.out.println("Apellido:");
    String ape=sc.next();
    System.out.println("Nota del Examen:");
    notas.add(sc.nextInt());
    System.out.println("Nota del Oral:");
    notas.add(sc.nextInt());
    System.out.println("Nota del Integrador");
    notas.add(sc.nextInt());
    a.add(new Alumnos(nom, ape, notas));
}
public void alumnoOlvidado(ArrayList<Alumnos> a,String nom){
    ArrayList<Integer> notas =new ArrayList<>();
    System.out.println("Apellido:");
    String ape=sc.next();
    System.out.println("Nota del Examen:");
    notas.add(sc.nextInt());
    System.out.println("Nota del Oral:");
    notas.add(sc.nextInt());
    System.out.println("Nota del Integrador");
    notas.add(sc.nextInt());
    a.add(new Alumnos(nom, ape, notas));
}
public double notaFinal(ArrayList<Alumnos> a){
    double notaFinal=-1;
    int contador=0;
    int aux=0;
    int aux2=0;
    System.out.println("De que Alumno Decea Sacar la nota");
    String p =sc.next();
    Iterator<Alumnos> it = a.iterator();
    while(it.hasNext()){
        if(it.next().getNombre().equalsIgnoreCase(p)){          
            contador=1;
            break;
        }
        aux2+=1;
    }
    
    do{
        if (contador==0){
            System.out.println("No se encontro el Alumno");
            System.out.println("Decea Agregarlo?");
            String Opciones=sc.next();
            if (Opciones.equalsIgnoreCase("Si")){
                alumnoOlvidado(a, p);
                aux2=a.size()-1;
                for (int i=0;i<3;i++) {
                    aux=aux+a.get(aux2).getNotas().get(i);
                }
                notaFinal=aux/3;
                contador=1;
            }else{
                contador=1;
            }
    }else{
        for (int i=0;i<3;i++) {
        aux=aux+a.get(aux2).getNotas().get(i);        
    }
    notaFinal=aux/3;
    }
    }while(contador==0);
       
    return notaFinal;
}
}

