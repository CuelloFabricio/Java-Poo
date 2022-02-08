package actividad_05.Servicios;

import actividad_05.Entidades.Generador;
import actividad_05.Entidades.Usuario;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class ServiceUsuario {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Boolean adivinarGenerador(Generador g,Usuario u){
        Boolean Bucle;
            try{
                System.out.print("Numero:");
                Integer un = sc.nextInt();
                if (un==-999){
                    System.out.println(g.getN());    
                }
                
                if (Objects.equals(un, g.getN())){
                    Bucle=true;
                }else{
                    u.setIntentos((u.getIntentos())+1);
                    adivinarGenerador(g,u);
                    Bucle=false;
                }
            }catch (InputMismatchException e){
                System.out.println("Erraste");
                u.setIntentos((u.getIntentos())+1);
                Bucle=false; 
            }
           return Bucle; 
    }
}

