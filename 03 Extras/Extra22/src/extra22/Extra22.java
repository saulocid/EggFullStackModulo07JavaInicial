package extra22;

import java.util.Random;
import java.util.Scanner;

/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos*/

public class Extra22 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int dim1, dim2;

        System.out.println("Dimensione una matriz, se llenará de números y se sumarán.");
        
        do {            
            System.out.print("Ingrese 1ra dimensión (entero positivo): ");
            dim1 = leer.nextInt();
            if(dim1<1) System.out.println("Valor incorrecto");
        } while (dim1<1);
        System.out.println("");
        
        do {            
            System.out.print("Ingrese 2da dimensión (entero positivo): ");
            dim2 = leer.nextInt();
            if(dim2<1) System.out.println("Valor incorrecto");
        } while (dim2<1);
        System.out.println("");

        int[][] matriz = new int[dim1][dim2];
        
        matriz = llenarMatriz(matriz, dim1, dim2);
        
        System.out.println("La matriz es:");
        mostrarMatriz(matriz, dim1, dim2);
        System.out.println("");
       
        System.out.println("La suma de los elementos es " + suma(matriz, dim1, dim2));
        
    }
    
    public static int[][] llenarMatriz(int[][] ma, int d1, int d2){
        
        Random ran = new Random();
        
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                ma[i][j]= ran.nextInt(101);
            }
        }
        
        return ma;
        
    }
    
    public static int suma(int[][] ma, int d1, int d2){
        
        int suma=0;
        
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                suma+=ma[i][j];
            }
        }
        
        return suma;
        
    }
    
    public static void mostrarMatriz(int[][] ma, int d1, int d2){
        
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print(ma[i][j] + " ");
            }
            System.out.println("");
        }
        
    }

}