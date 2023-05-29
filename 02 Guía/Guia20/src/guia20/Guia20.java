package guia20;

import java.util.Scanner;

public class Guia20 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean comprobar=false;
        
        System.out.println("Introduzca valores del 1 al 9 para ver si la matriz 3x3 es mágica, queire decir que la suma de sus filas, columnas y diagonales de siemrpe el mismo resultado");
        matriz = llenarMatriz(matriz);
        System.out.println("");
        
        System.out.println("La matriz es:");
        mostrarMatriz(matriz);
        System.out.println("");
        
        comprobar = compromarMagica(matriz);
        
        if(comprobar==true) System.out.println("La matriz ES mágica");
        else System.out.println("La matriz NO ES mágica");
        
    }

    public static int[][] llenarMatriz(int[][] a){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese valores a la matriz de 1 a 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {               
                    System.out.print("Ingrese valor para indice " + i + "," + j + ": ");
                    a[i][j] = leer.nextInt();
                    if(a[i][j]<1 || a[i][j]>9) System.out.println("Valor erróneo");
                } while (a[i][j]<1 || a[i][j]>9);    
            }
        }
        
        return a;
        
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
    
    public static boolean compromarMagica(int[][] a){
        
        boolean bandera=true;
        int suma=0, aux=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux+=a[i][j];
            }
            if(i==0) suma=aux;
            else if(suma!=aux) bandera=false;
            aux=0;
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                aux+=a[i][j];
            }
            if(suma!=aux) bandera=false;
            aux=0;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j) aux+=a[i][j];
            }
        }
        if(suma!=aux) bandera=false;
        aux=0;
        
        int cont=0;
        for (int i = 2; i >= 0; i--) {
            aux+=a[i][cont];
            cont++;
        }
        if(suma!=aux) bandera=false;
        
        return bandera;
        
    }
    
}