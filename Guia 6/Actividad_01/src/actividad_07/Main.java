
package actividad_07;

import actividad_07.Entidades.Persona;


public class Main {

    public static void main(String[] args) {
     try{
         Persona p = new Persona();
     Persona p1 = new Persona();
     Persona p2 = new Persona();
     Persona p3 = new Persona();
     
     int contmax=0,contmin=0,contdebpeso=0,contpesoideal=0,contsobrepeso=0; 
     double PorMax,PorMin,PorDebPeso,porPesoIdeal,PorSobrePeso;
     
     //System.out.println("escriba los Datos de la 1° Persona");   
     //p.crearPersona();
     //System.out.println("escriba los Datos de la 2° Persona");   
     //p1.crearPersona();
     //System.out.println("escriba los Datos de la 3° Persona");
     //p2.crearPersona();
     //System.out.println("escriba los Datos de la 4° Persona");
     //p3.crearPersona();
        
        int[] Peso={p.calcularIMC(), p1.calcularIMC(), p2.calcularIMC(), p3.calcularIMC()};
        boolean[] Mayor={p.esMayorDeEdad(),p1.esMayorDeEdad(),p2.esMayorDeEdad(),p3.esMayorDeEdad()};
        
        for (int i=0; i < Peso.length; i++){
            
            switch (Peso[i]) {
            case -1:
                contdebpeso= contdebpeso + 1;
                break;
            case 0:
                contpesoideal=contpesoideal + 1;
                break;
            case 1:
                contsobrepeso=contsobrepeso + 1;
                break;
            default:
                break;
            }   
        }
        
        for (int i=0; i < Mayor.length; i++){
            
            if (Mayor[i]){
            contmax=contmax + 1;
        
            }else{
            contmin=contmin + 1;
        
            }           
        }
        
        PorDebPeso=(contdebpeso*100)/4;
        porPesoIdeal=(contpesoideal*100)/4;
        PorSobrePeso= (contsobrepeso*100)/4;
        
        PorMax=(contmax*100)/4;
        PorMin= (contmin*100)/4;
         
        System.out.println("El Porcentaje de Mayores de edad es: "+PorMax+"%");
        System.out.println("El Porcentaje de Menores de edad es: "+PorMin);
        System.out.println("El Porcentaje que esta debajo de su peso ideal es: "+ PorDebPeso+"%");
        System.out.println("El Porcentaje que tiene sobrepeso es: "+ PorSobrePeso+"%");
        System.out.println("El Porcentaje que esta en su peso ideal es: "+ porPesoIdeal+"%");
        
     }catch(NullPointerException en){
         System.out.println(en.fillInStackTrace());
         System.out.println("");
     }
    }
    
}
