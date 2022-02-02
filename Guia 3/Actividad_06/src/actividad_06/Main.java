
package actividad_06;

import actividad_06.Servicios.ServicioProducto;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ServicioProducto sp = new ServicioProducto();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean Bucle=true;
        do{
            sp.crearProducto();
            System.out.println("Decea Seguir Añadiendo Productos?");
            String Op=sc.next();
            if (Op.equalsIgnoreCase("No")){
                Bucle=false;
            }
        }while(Bucle);
        sp.mostrarProductos();
        System.out.println("Cual es el Producto a Modificar?");
        String nom=sc.next();
        sp.modificarPrecio(nom);
        System.out.println("Cual Producto decea Eliminar?");
        String nom2=sc.next();
        sp.sacarProducto(nom2);
        sp.mostrarProductos();
    }

}
