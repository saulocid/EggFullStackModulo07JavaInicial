package extra20;

import java.util.Random;

/*Crear una función que rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector*/

public class Extra20 {

    public static void main(String[] args) {

        int[] vector = new int[10];
        
        vector = llenarVector(vector);
        mostrarVector(vector);

    }
    
    public static int[] llenarVector(int[] v){
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            v[i] = random.nextInt(101);
        }
        
        return v;
        
    }
    
    public static void mostrarVector(int[] v){
        
        System.out.println("El vector es:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        
    }

}