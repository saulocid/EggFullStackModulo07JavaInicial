package guia18;

public class Guia18 {

    //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    //traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    //obtiene cambiando sus filas por columnas (o viceversa).
    
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];
        
        matriz = llenarMatriz(matriz);
        transpuesta = llenarTranspuesta(matriz, transpuesta);
        
        System.out.println("La matriz original es");
        mostrarMatriz(matriz);
        
        System.out.println("La matriz transpuesta es");
        mostrarMatriz(transpuesta);

    }
    
    public static int[][] llenarMatriz(int[][] a){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (int)(Math.random()*10);
            }
        }
        
        return a;
        
    }
    
    public static int[][] llenarTranspuesta(int[][] a, int[][] b){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[j][i] = a[i][j];
            }
        }
        
        return b;
        
    }
    
    public static void mostrarMatriz(int[][] a){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ,");
            }
            System.out.println("");
        }
        System.out.println(" ");
        
    }

}

/*
package ejercicios_java_final;

import java.util.*;

public class ejercicio_18 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int[][] traspuesta = MatrizTraspuesta(matriz);

        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }


    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] MatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}
*/