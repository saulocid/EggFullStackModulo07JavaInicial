package guia15;

public class Guia15 {

    public static void main(String[] args) {
       
        //Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        //muestre por pantalla en orden descendente.
        
        int[] vector = new int[100];

        llenarVector(vector);
        
        for (int i = 99; i >=0; i--) {
            System.out.print(vector[i] + ", ");
        }

    }
    
    public static int [] llenarVector(int[] vector){
        
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        
        return vector;
    }

}