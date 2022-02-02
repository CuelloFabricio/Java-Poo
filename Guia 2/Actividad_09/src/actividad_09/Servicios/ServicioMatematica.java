package actividad_09.Servicios;

import actividad_09.Entidades.Matematica;


public class ServicioMatematica {
public double devolverMayor(Matematica m){
    double Mayor;
   Mayor=Math.max(m.getNum1(), m.getNum2());
   return Mayor;
}
public long calcularPotencia(Matematica m){
    long num1,num2,potencia;
    num1=Math.round(m.getNum2());
    num2=Math.round(m.getNum1());
    if (num1 < num2){
        potencia=(long) Math.pow(num2, num1);
    }else{
        potencia=(long) Math.pow(num1, num2);
    }
    return potencia;
}
public double calculaRaiz(Matematica m){
    double Menor=Math.min(m.getNum1(), m.getNum2());
    double Absoluto=Math.abs(Menor);
    double Raiz=Math.sqrt(Absoluto);
    return Raiz;
}
}

