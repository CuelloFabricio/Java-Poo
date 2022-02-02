package actividad_02.Entidades;

import java.util.Scanner;


public class Electrodomesticos {
protected Double Precio;
protected String Color;
protected String ConsumoElectronico;
protected Integer Peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double Precio, String Color, String ConsumoElectronico, Integer Peso) {
        this.Precio = Precio;
        this.Color = Color.toUpperCase();
        this.ConsumoElectronico = ConsumoElectronico.toUpperCase();
        this.Peso = Peso;
        comprobarConsumoEnergetico(ConsumoElectronico);
        comprobarColor(Color);
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color.toUpperCase();
        comprobarColor(Color);
    }

    public String getConsumoElectronico() {
        return ConsumoElectronico;
    }

    public void setConsumoElectronico(String ConsumoElectronico) {
        this.ConsumoElectronico = ConsumoElectronico.toUpperCase();
        comprobarConsumoEnergetico(ConsumoElectronico);
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "Precio=" + Precio + ", Color=" + Color + ", ConsumoElectronico=" + ConsumoElectronico + ", Peso=" + Peso + '}';
    }

    private void comprobarConsumoEnergetico(String c){
        String[] ce={"A","B","C","D","E","F"};
        int comprobador=0;
        for (int i = 0; i < 6; i++) {
            if (c.equalsIgnoreCase(ce[i])){
                comprobador++;
            }
                
        }
        if (comprobador==0){
            this.ConsumoElectronico="F";
        }
    }
    private void comprobarColor(String color){
        String[] ce={"blanco", "negro", "rojo", "azul", "gris"};
        int comprobador=0;
        for (int i = 0; i < 5; i++) {
            if (color.equalsIgnoreCase(ce[i])){
                comprobador++;
            }      
        }
        if (comprobador==0){
            this.Color="BLANCO";
        }
    }
    public Double precioFinal() {
        Double precio = this.Precio;
        Integer peso = this.Peso;
        switch (this.ConsumoElectronico) {
            case "A":
                precio = precio + 1000;
                break;
            case "B":
                precio = precio + 800;
                break;
            case "C":
                precio = precio + 600;
                break;
            case "D":
                precio = precio + 500;
                break;
            case "E":
                precio = precio + 300;
                break;
            case "F":
                precio = precio + 100;
        }
        
        if (peso<=19){
            precio=precio+100;
        }else if (peso>19 && peso<=49){
            precio=precio+500;
        }else if (peso>49 && peso<=79){
            precio=precio+800;
        }else{
            precio=precio+1000;
        }
        
        return precio;
    }
    protected void crearElectrodomestico(){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");    
    System.out.print("Color:");
    setColor(sc.next());
    System.out.print("Consumo Electronico:");
    setConsumoElectronico(sc.next());
    System.out.print("Peso:");
    setPeso(sc.nextInt());
    setPrecio(1000.0);
}
}

