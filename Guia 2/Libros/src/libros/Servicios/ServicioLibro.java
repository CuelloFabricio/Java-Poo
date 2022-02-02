package libros.Servicios;

import java.util.Scanner;
import libros.Elementos.Libro;


public class ServicioLibro {
    
 public Libro Anotador(){
     Scanner Leer = new Scanner(System.in).useDelimiter("\n");
     Libro L = new Libro();
     System.out.println("Introdusca el ISBN");
     L.setISBN(Leer.nextInt());
     System.out.println("Dicte el Titulo");
     L.setTitulo(Leer.next());
     System.out.println("Quien es Su Autor?");
     L.setAutor(Leer.next());
     System.out.println("Cuantas Paginas Contiene?");
     L.setPaginas(Leer.nextInt());
     return L;
 }
 
}

