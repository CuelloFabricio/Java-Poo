
package libros;

import libros.Elementos.Libro;
import libros.Servicios.ServicioLibro;

public class Main {

    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();      
        System.out.println("Bienvenido A La Biblioteca");
        System.out.println("No se olvide de cargar los datos del libro escogido");
        Libro L = sl.Anotador();
        System.out.println(L);
    }

}
