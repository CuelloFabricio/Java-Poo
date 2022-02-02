package actividad_02.Entidades;

import java.util.Scanner;


public class Televisor extends Electrodomesticos{
private Integer Resolucion;
private Boolean SintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(Integer Resolucion, Boolean SintonizadorTDT, String Color, String ConsumoElectronico, Integer Peso) {
        super(1000.0, Color, ConsumoElectronico, Peso);
        this.Resolucion = Resolucion;
        this.SintonizadorTDT = SintonizadorTDT;
        this.Precio=precioFinal();
    }

    public Integer getResolucion() {
        return Resolucion;
    }

    public void setResolucion(Integer Resolucion) {
        this.Resolucion = Resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return SintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean SintonizadorTDT) {
        this.SintonizadorTDT = SintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{"+ super.toString() + "Resolucion=" + Resolucion + ", SintonizadorTDT=" + SintonizadorTDT + '}';
    }
    
    public void crearTelevisor(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("Resolucion:");
        setResolucion(sc.nextInt());
        System.out.println("Tiene Sintonizador TDT?");
        String op=sc.next();
        setSintonizadorTDT(op.equalsIgnoreCase("SI"));
        this.Precio=precioFinal();
    }

    @Override
    public Double precioFinal() {
    Double precio=super.precioFinal();
    if (this.Resolucion>40){
        Double porciento=(30*precio)/100;
        precio=precio+porciento;
    }
    
    if (this.SintonizadorTDT){
        precio=precio+500;
    }
    
    return precio;
    }
     
}

