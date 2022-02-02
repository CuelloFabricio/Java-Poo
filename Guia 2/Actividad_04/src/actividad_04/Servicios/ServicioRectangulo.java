package actividad_04.Servicios;

import actividad_04.Entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
public Rectangulo crearRectangulo(){
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r = new Rectangulo();
        System.out.println("ingrese la base de su Rectangulo");
        r.setBase(Leer.nextInt());
        System.out.println("Ingrese la Altura");
        r.setAltura(Leer.nextInt());
        return r;
}
    public void superficie(Rectangulo r){
        Integer s;
        s=r.getBase()*r.getAltura();
        System.out.print(" La superficie es: "+s);
    }
    public void  perimetro(Rectangulo r){
        Integer p;
        p=(r.getBase()+r.getAltura())*2;
        System.out.print(" El perimetro es: "+p);
    }
    public void mostrarRectangulo(Rectangulo r){ 

        for (int i=0;i < r.getAltura() ; i++){
          for (int j = 0; j < r.getBase(); j++){
              if (((i==r.getAltura()-1) || (i==0))||((j==0) || (j==r.getBase()-1))){
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
          }
          System.out.println("");
            
        }
    }
}

