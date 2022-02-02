package libros.Elementos;

public class Libro {
    private Integer ISBN;
    private String Titulo;
    private String Autor;
    private Integer Paginas;

    public Libro() {
        
    }

    public Libro(Integer ISBN, String Titulo, String Autor, Integer Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }
 
    public Integer getISBN() {
        return ISBN;
    }
 
    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }
     public String getTitulo() {
        return Titulo;
    }
        public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    } 

   
    public Integer getPaginas() {
        return Paginas;
    }
 
    public void setPaginas(Integer Paginas) {
        this.Paginas = Paginas;
    }
   

    @Override
    public String toString() {
        return "El Libro Alquilado es "+ Titulo + ", Su Autor es " + Autor + ", Contiene "+ Paginas+" Paginas" + ", Su ISBN es: "+ISBN;
    } 
}

