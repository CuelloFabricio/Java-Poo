package actividad_02.Entidades;


public class Aarray {
private int[] vector;
private int[][] matriz;

    public Aarray() {
        crearArray();
    }

    public Aarray(int[] vector, int[][] matriz) {
        crearArray();
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    public void crearArray(){
        int[] v = {3,4,2};
        int[][] m = {{3,4,2},{3,4,2},{3,4,2}};
        this.vector = v;
        this.matriz = m;
    }

    @Override
    public String toString() {
        return "array{" + "vector=" + vector + ", matriz=" + matriz + '}';
    }

}

