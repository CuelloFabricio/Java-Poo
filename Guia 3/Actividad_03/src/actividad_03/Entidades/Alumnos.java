package actividad_03.Entidades;

import java.util.ArrayList;


public class Alumnos {
private String Nombre;
private String Apellido;
private ArrayList<Integer> Notas;

    public Alumnos() {
    }

    public Alumnos(String Nombre, String Apellido, ArrayList<Integer> Notas) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Notas = Notas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> Notas) {
        this.Notas = Notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Notas=" + Notas + '}';
    }

}

