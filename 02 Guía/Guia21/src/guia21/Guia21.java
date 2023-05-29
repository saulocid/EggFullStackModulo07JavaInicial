package guia21;

import java.util.Random;


public class Guia21 {

    public static void main(String[] args) {
       
        Random alea = new Random();
        
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
        
        M = llenarMatriz(M,alea);
        P = llenarMatriz2(P,alea);
        
        System.out.println("De la matriz:");
        mostrarMatriz(M);
        
        System.out.println("Encontrar la sub-matriz:");
        mostrarMatriz2(P);
        
        comprobarSubmatriz(M,P);

    }
    
    public static int [][] llenarMatriz(int matriz[][], Random b){
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]=b.nextInt(2);
            }
        }
        
        return matriz;
    }
    
    public static int[][] llenarMatriz2(int[][] matriz, Random b){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=b.nextInt(2);
            }
        }
        
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz){
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
    }
    
    public static void mostrarMatriz2(int[][] matriz){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
    }
    
    public static void comprobarSubmatriz(int[][] matrizA, int[][] matrizB){
        
        int cont1=0, cont2=0, aux1=0, aux2=0;
        boolean bandera=false;
        
        for (int i = 0; i < matrizA.length-2; i++) {
            if(bandera==true){
                break;
            }
            for (int j = 0; j < matrizA.length-2; j++) {
                if(bandera==true){
                    break;
                }
                if(matrizA[i][j]==matrizB[0][0]){
                    cont1=i;
                    cont2=j;
                    aux1=cont1;
                    aux2=cont2;
                    for (int k = 0; k < matrizB.length; k++) {
                        for (int l = 0; l < matrizB.length; l++) {
                            if(matrizA[cont1][cont2]== matrizB[k][l]){
                                bandera=true;
                            }else{
                                bandera=false;
                                break;
                            }  
                            cont2++;
                        }
                        
                        cont1++;
                        if(bandera==false){
                            break;
                        }
                        
                        cont2=aux2;
                    }
                }
                
            }
        }
        
        if(bandera==true) System.out.println("Si se encontro la sub-matriz P en los índices " + aux1 + "," + aux2);
        else System.out.println("La sub-matriz P no se encontró en la matriz M");
        
    }

}