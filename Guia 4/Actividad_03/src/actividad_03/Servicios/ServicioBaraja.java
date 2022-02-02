package actividad_03.Servicios;

import actividad_03.Entidades.Baraja;
import actividad_03.Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioBaraja {
Scanner scc = new Scanner(System.in).useDelimiter("\n");
public Baraja llenarBaraja(){
    ServicioCarta sc = new ServicioCarta();
    Baraja b = new Baraja();
    Carta c;
    ArrayList<Carta> lc= new ArrayList<>();
    String [] palo={"Espada","Basto","Copa","Oro"};
        
        for (int l = 1; l <= 12; l++) {
            if (!(l==8) && !(l==9)){
                for (int j = 0; j < 4; j++) {
                    c=sc.crearCarta(palo, l,j);
                    lc.add(c);
                }
            }
    }
    b.setCartas(lc);
    b.setCartaActual(lc.get(0));
    return b;
}

public void barajar(Baraja b){ 
    ArrayList<Carta> lc= b.getCartas(); 
    ArrayList<Carta> lcc=new ArrayList<>();  
    int num2=lc.size();    
    for (int j = 0; j < num2; j++) {    
        int num = (int) (Math.random()*(lc.size()));     
        lcc.add(lc.get(num));     
        lc.remove(num);  
    }
    b.setCartas(lcc);
}

public void siguienteCarta(Baraja b){
    int num=b.getContador()+1;
    if (num==b.getCartas().size()){
        System.out.println("Esta es la Ultima Carta");
        System.out.println(b.getCartaActual());
        b.setContador(num);
    }else if (num>b.getCartas().size()){
        System.out.println("Ya No Hay Cartas");
    }else{
        System.out.println(b.getCartaActual());
        b.setCartaActual(b.getCartas().get(num));
        b.setContador(num);
    }
}

public void cartasDisponibles(Baraja b){
    int num=40-b.getContador();
    if (num<=0){
        System.out.println("Ya No Hay Cartas");
    }else if(num!=1){
        System.out.println("Quedan "+num+" Cartas");
    }else{
        System.out.println("Queda 1 Carta");
    }
}

public void darCartas(Baraja b){
    System.out.println("Cuantas Carta Decea?");
    int num=scc.nextInt();    
    for (int i = 0; i < num; i++) {
        siguienteCarta(b);
    }
}
public void cartasMonton(Baraja b){
    int num=b.getContador();
    if (num<=0){
        System.out.println("Ya No Hay Cartas");
    }else{    
        System.out.println("Estas son Las Cartas Que ya salieron:");    
        System.out.println("-----------------------------");    
        for (int i = 0; i < b.getContador(); i++) {        
            System.out.println(b.getCartas().get(i));        
            System.out.println("-----------------------------");    
        }
    }
}
public void mostrarBaraja(Baraja b){
    int num=b.getContador();
    if (num<=0){     
        System.out.println("Ya No Hay Cartas");   
    }else{    
        System.out.println("Estas Son Las Cartas que quedaron en el Mazo");    
        System.out.println("-----------------------------");    
        for (int i = b.getContador(); i < b.getCartas().size(); i++) {            
            System.out.println(b.getCartas().get(i));        
            System.out.println("-----------------------------");
        }
    }
}
}

