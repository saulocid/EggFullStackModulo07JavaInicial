package guia19;
import java.util.Scanner;

public class Guia19 {

    public static void main(String[] args) {
       
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        
        matriz = llenarMatriz(matriz);
        transpuesta = llenarTranspuesta(matriz, transpuesta);
        System.out.println("");
        System.out.println("La matriz es:");
        mostrarMatriz(matriz);
        System.out.println("");
        System.out.println("Su Transpuesta es:");
        mostrarMatriz(transpuesta);
        System.out.println("");
        System.out.println("Por lo tanto su Antisimétrica es:");
        mostrarAntisimetrica(transpuesta);
        confirmarAntisimetrica(matriz, transpuesta);

    }

    public static int[][] llenarMatriz(int[][] a){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese valores a la matriz de -9 a 9: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {               
                    System.out.println("Ingrese valor para indice " + i + "," + j);
                    a[i][j] = leer.nextInt();
                } while (a[i][j]<-9 || a[i][j]>9);    
            }
        }
        
        return a;
        
    }
    
    public static int[][] llenarTranspuesta(int[][] a, int[][] b){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[j][i] = a[i][j];
            }
        }
        
        return b;
        
    }
    
    public static void mostrarMatriz(int[][] a){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ,");
            }
            System.out.println("");
        }
        System.out.println(" ");
        
    }
    
    public static void mostrarAntisimetrica(int[][] a){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((a[i][j]*-1) + " ,");
            }
            System.out.println("");
        }
        System.out.println(" ");
        
    }
    
    public static void confirmarAntisimetrica(int[][] a, int[][] b){
        
        boolean bandera = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(a[i][j] != (-1*b[i][j])) bandera = false;
            }
        }
        
        if(bandera==true) System.out.println("La matriz ES antisimétrica!");
        else System.out.println("La matriz NO ES antisimétrica!");
        
    }
    
}