package actividad_06.Servicios;

import actividad_06.Entidades.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ServicioProducto {
   Scanner sc = new Scanner(System.in).useDelimiter("\n");
   HashMap<String,Productos> Mapa= new HashMap<>();
   public void crearProducto(){
       Productos p = new Productos();
       System.out.println("Nombre:");
       p.setNombre(sc.next());
       System.out.println("Precio:");
       p.setPrecio(sc.nextDouble());
       Mapa.put(p.getNombre(), p);
   }
   public void crearProductoOlvidado(String Nom){
       Productos p = new Productos();
       p.setNombre(Nom);
       System.out.println("Precio:");
       p.setPrecio(sc.nextDouble());
       Mapa.put(p.getNombre(), p);
   }
   public void modificarPrecio(String NomProd){
       if (Mapa.containsKey(NomProd)){
           System.out.println("Cual es el nuevo precio?");
           Mapa.get(NomProd).setPrecio(sc.nextDouble());
       }else{
           System.out.println("Ese Producto no esta en la lista");
           System.out.println("Decea Añadirlo?");
           String Op=sc.next();
           if (Op.equalsIgnoreCase("Si")){
               crearProductoOlvidado(NomProd);
           }
       }
   }
   public void sacarProducto(String NomProd){
       if (Mapa.containsKey(NomProd)){
           Mapa.remove(NomProd);
       }else{
           System.out.println("Ese Producto no esta en la lista");
       }
   }
   public void mostrarProductos(){
       for (Map.Entry<String, Productos> entry : Mapa.entrySet()) {
           System.out.println(entry.toString());
       }
   }
}

