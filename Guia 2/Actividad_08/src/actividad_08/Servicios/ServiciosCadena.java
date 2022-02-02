package actividad_08.Servicios;

import actividad_08.Entidades.Cadena;
import java.util.Scanner;


public class ServiciosCadena {

    public Cadena crearCadena(){
        Cadena c = new Cadena();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba una Frase");
        c.setFrase(sc.next());
        Integer Long;
        Long = c.getFrase().length();
        c.setLongitud(Long);
        return c;
    }

    public void mostrarVocales(Cadena c){
        Integer Contador=0;
        String Frase;
        Frase=c.getFrase();   
        
        for (int i = 0; i < c.getLongitud(); i++) {
            char Vocal = Frase.charAt(i);
            
            if ((Vocal=='a')||(Vocal=='A')||(Vocal=='E')||(Vocal=='e')||(Vocal=='I')||(Vocal=='i')||(Vocal=='O')||(Vocal=='o')||(Vocal=='U')||(Vocal=='u')){
                Contador = Contador + 1;  
            }    
        }       
        
        System.out.println("Las Vocales Encontradas En La Frase Son: "+Contador);
    }

    public void invertirFrase(Cadena c){
        String Frase;
        Frase=c.getFrase();
        String[] Vocal=new String[c.getLongitud()];
        
        for (int i = 0; i < c.getLongitud(); i++) {
            Vocal[i] = Frase.substring(i, i+1);
        }  
 
        for (int i = c.getLongitud()-1; i >= 0; i--) {
        System.out.print(Vocal[i]);
        }
        System.out.println("");
    }
    
    public void vecesRepetido(Cadena c,String letra){
        Integer Contador=0;
        String Frase;
        Frase=c.getFrase();   
       char L = letra.charAt(0);
        for (int i = 0; i < c.getLongitud(); i++) {
            char Vocal = Frase.charAt(i);
            
            if (Vocal==L){
                Contador = Contador + 1;  
            }    
        }       
        
        System.out.println("El carácter '"+L+"' se repite "+Contador+" veces");
    }
    
    public void compararLongitud(Cadena c,String frase){
        System.out.println("La Primer Frase Tiene "+c.getLongitud()+" Caracteres");
        int Long=frase.length();
        System.out.println("La Seguda Frase Tiene "+Long+" Caracteres");
        if (Long==c.getLongitud()){
            System.out.println("Por lo tanto el largo es Igual");
        }else{
            System.out.println("Por lo tanto el largo no es Igual");
        }
    }
    
    public void unirFrase(Cadena c,String frase){
        String Union=c.getFrase().concat(frase);
        System.out.println("La frase que quedo es:");
        System.out.println(Union);
    }
    
    public void reemplazar(Cadena c,String letra){
        System.out.println("La frase es: "+c.getFrase());
        String Frase=c.getFrase();
        char L = letra.charAt(0);
        char[] Vocal = new char[c.getLongitud()];
        for (int i = 0; i < c.getLongitud(); i++) {
            Vocal[i] = Frase.charAt(i);
            if ((Vocal[i]=='a')||(Vocal[i]=='A')){
                Vocal[i]=L;
            }   
        }
        System.out.println("Las Frases Remplazando las A es: ");
        for (int i = 0; i < c.getLongitud(); i++) {
            System.out.print(Vocal[i]);
        }
        System.out.println("");
    }
    
    public void contiene(Cadena c,String letra){
        boolean Comparar;
        Comparar=c.getFrase().contains(letra);
        if (Comparar==true){
            System.out.println("La Frase Contiene la Letra: "+ letra);
        }else{
            System.out.println("La Frase No Contiene la Letra: "+ letra);
        }
    }
}

