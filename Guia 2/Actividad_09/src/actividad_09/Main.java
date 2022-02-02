
package actividad_09;

import actividad_09.Entidades.Matematica;
import actividad_09.Servicios.ServicioMatematica;


public class Main {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        ServicioMatematica sm = new ServicioMatematica();
        m.setNum1((double)(Math.random()*100));
        m.setNum2((double)(Math.random()*100));
        System.out.println("El primer numero es: "+m.getNum1());
        System.out.println("El primer numero es: "+m.getNum2());
        System.out.println("------------------------------");
        System.out.println("El Mayor de los dos es: "+sm.devolverMayor(m));
        System.out.println("El Mayor potenciado por el menor (Ambos Redondeados) es: "+sm.calcularPotencia(m));
        System.out.println("------------------------------");
        System.out.println("La raiz cuadrada del menor (El valor absoluto del menor) es: "+sm.calculaRaiz(m));
    }

}
