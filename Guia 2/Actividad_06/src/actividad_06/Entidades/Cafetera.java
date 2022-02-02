package actividad_06.Entidades;

import java.util.Scanner;


public class Cafetera {
private Integer capacidadMaxima;
private Integer cantidadActual;

    public Cafetera() {
    }

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
 
    public Cafetera crearCafetera(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Cafetera c = new Cafetera();
        System.out.println("Cual es la capacidad Maxima de su Cafetera?");
        c.setCapacidadMaxima(sc.nextInt());
        System.out.println("Cual es la Cantidad Actual que posee");
        c.setCantidadActual(sc.nextInt());
       return c; 
    }
    
public void llenarCafetera(){
    setCantidadActual(getCapacidadMaxima());
    if (cantidadActual==capacidadMaxima){
        System.out.println("Ya Esta LLena");
    }
}
public void servirTaza(){
Scanner sc = new Scanner(System.in).useDelimiter("\n");
int Taza;    
System.out.println("De Cuanto es la Taza");    
Taza=sc.nextInt();
if (cantidadActual<Taza){
    System.out.println("La Taza no Se llego a LLenar");
    setCantidadActual(0);
}else{
    System.out.println("La taza se Lleno");
    setCantidadActual(cantidadActual-Taza);
}
}
public void vaciarCafetera(){
    setCantidadActual(0);
}
public void agregarCafe(){
Scanner sc = new Scanner(System.in).useDelimiter("\n");
int Cafe;    
System.out.println("Cuanto Cafe Decea agregar");    
Cafe=sc.nextInt();
    setCantidadActual(cantidadActual+Cafe);
    if ((Cafe>capacidadMaxima)||((Cafe+cantidadActual>capacidadMaxima))){
        setCantidadActual(capacidadMaxima);
    }else{
        setCantidadActual(cantidadActual+Cafe);
    }
}

}

