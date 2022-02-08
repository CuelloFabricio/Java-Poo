package actividad_07.Entidades;

import java.util.Scanner;


public class Persona {
private String Nombre;
private Integer Edad;
private String Sexo;
private Double Peso;
private Double Altura;

    public Persona() {
    }

    public Persona(String Nombre, Integer Edad, String Sexo, double Peso, double Altura) {
        this.Nombre = null;
        this.Edad = null;
        this.Sexo = null;
        this.Peso = null;
        this.Altura = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = null;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = null;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = null;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = null;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = null;
    }
/*public void crearPersona(){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    String Sex;
    int Contador=0;
    System.out.println("Escriba el Nombre");
    setNombre(sc.next());
    System.out.println("Escriba el Sexo");
    System.out.println("H para Hombre,M para Mujer y O para Otro");
    do{
        if (Contador!= 0){
            System.out.println("Error el Sexo solo puede ser H,M u O");
        }
        Sex=sc.next();
        
        setSexo(Sex);
        
        Contador=Contador+1;
    }while(!(Sex.equals("H"))&& !(Sex.equals("M"))&& !(Sex.equals("O")));
    System.out.println("Escriba la Edad");
    setEdad(sc.nextInt());
    System.out.println("Escriba la Altura");
    setAltura(sc.nextDouble());
    System.out.println("Escriba el Peso");
    setPeso(sc.nextDouble());
}*/
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

