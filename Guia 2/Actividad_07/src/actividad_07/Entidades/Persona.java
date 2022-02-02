package actividad_07.Entidades;

import java.util.Scanner;


public class Persona {
private String Nombre;
private Integer Edad;
private String Sexo;
private double Peso;
private double Altura;

    public Persona() {
    }

    public Persona(String Nombre, Integer Edad, String Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
public Persona crearPersona(){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();
    String Sex;
    int Contador=0;
    System.out.println("Escriba el Nombre");
    p.setNombre(sc.next());
    System.out.println("Escriba el Sexo");
    System.out.println("H para Hombre,M para Mujer y O para Otro");
    do{
        if (Contador!= 0){
            System.out.println("Error el Sexo solo puede ser H,M u O");
        }
        Sex=sc.next();
        
        p.setSexo(Sex);
        
        Contador=Contador+1;
    }while(!(Sex.equals("H"))&& !(Sex.equals("M"))&& !(Sex.equals("O")));
    System.out.println("Escriba la Edad");
    p.setEdad(sc.nextInt());
    System.out.println("Escriba la Altura");
    p.setAltura(sc.nextDouble());
    System.out.println("Escriba el Peso");
    p.setPeso(sc.nextDouble());
    return p;
}
public Integer calcularIMC(){
   double Pesoideal;
   int Corroborar;
   Pesoideal=Peso/(Math.pow(Altura, 2));
   if (Pesoideal<20){
       Corroborar=-1;
   }else if((Pesoideal==20)||(Pesoideal<=25)){
       Corroborar=0;
   }else{
       Corroborar=1;
   }
   return Corroborar;
}
public boolean esMayorDeEdad(){
    boolean Mayor;
    Mayor = Edad >= 18;
    return Mayor;
}

}

