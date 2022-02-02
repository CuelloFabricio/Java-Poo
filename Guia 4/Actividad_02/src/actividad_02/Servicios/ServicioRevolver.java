package actividad_02.Servicios;

import actividad_02.Entidades.Revolver;


public class ServicioRevolver {
public Revolver llenarRevolver(){
    Revolver r= new Revolver();
    r.setPosicionActual((int)(Math.random()*7));
    r.setPosicionAgua((int)(Math.random()*7));
    return r;
}
public Boolean mojar(Revolver r){
    Boolean Mojado=(r.getPosicionActual()==r.getPosicionAgua());
    return Mojado;
}
public void siguienteChorro(Revolver r){
    int num=r.getPosicionActual();
    if (num==7){
        r.setPosicionActual(0);
    }else{
        r.setPosicionActual(num+1);
    }  
}
}

