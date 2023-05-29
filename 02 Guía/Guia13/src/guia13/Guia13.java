package guia13;

import java.util.Scanner;
import java.util.Vector;

public class Guia13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese una cantidad entera positiva para dibujar un cuadrado");
        do {            
            System.out.print("Ingrese un valor entero positivo: ");
            num = leer.nextInt();
        } while (num<1);
        
        String[][] matriz = new String[num][num];
        
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num; j++) {
                
                if (i==0 || i==num-1){
                    matriz[i][j]="* ";
                } else if (j==0 || j==num-1){
                    matriz[i][j]="* ";
                } else {
                    matriz[i][j]="  ";
                }
            } 
        }
        
        System.out.println("El cuadrado es:");
        System.out.println("");
        
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num; j++) {
                    
                System.out.print(matriz[i][j]);
            }
            
            System.out.println("");
            
        }
            
    }
        
}
