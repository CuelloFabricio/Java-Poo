package actividad_02.Entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomesticos{
private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, String Color, String ConsumoElectronico, Integer Peso) {
        super(1000.0, Color, ConsumoElectronico, Peso);
        this.carga = carga;
        this.Precio= precioFinal();
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{"+super.toString() + "carga=" + carga + '}';
    }

    @Override
    public Double precioFinal(){
        Double precio=super.precioFinal();
        if (carga>30){
            precio=precio+500;
        }
        return precio;
    }
    public void crearLavadora(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("Carga:");
        setCarga(sc.nextInt());
        this.Precio= precioFinal();
    }
}

