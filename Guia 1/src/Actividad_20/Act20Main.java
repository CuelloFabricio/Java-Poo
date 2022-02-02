
package Actividad_20;

public class Act20Main {

    public static void main(String[] args) {
    int []Vec;
    Vec= new int [100];
    int n=100;
    for (int i=0;i<Vec.length;i++){
        Vec[i]=n;
        n = n-1;
    }
    for (int i=0;i<Vec.length;i++){
        System.out.println(Vec[i]);
    }
    }
    
}
