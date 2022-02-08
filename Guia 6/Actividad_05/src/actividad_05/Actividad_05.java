package actividad_05;

import actividad_05.Entidades.Generador;
import actividad_05.Entidades.Usuario;

import actividad_05.Servicios.ServiceUsuario;

public class Actividad_05 {

    public static void main(String[] args) {
        Generador g = new Generador();
        ServiceUsuario su = new ServiceUsuario();
        Usuario u = new Usuario();
        if (su.adivinarGenerador(g, u)) {
            System.out.println("Correcto");
        }
        
        System.out.println("Hizo " + u.getIntentos() + " Intentos");
        System.out.println("*Fin Del Juego*");
    }

}
