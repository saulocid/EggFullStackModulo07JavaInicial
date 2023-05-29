package guia16;

import java.util.Random;
import java.util.Scanner;

public class Guia16 {

    //Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    //al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    //numero y si se encuentra repetido
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese un número para dimensionar un vector de números aleatorios");
        int dim, num, cont=0;
        do {            
            System.out.println("Ingrese un valor entero positivo");
            dim = leer.nextInt();
        } while (dim<1);
        
        int[] vector = new int[dim];
        llenarVector(vector, dim);
        
        System.out.println("Ingrese un número entero positivo para buscar entre 1 y 100");
        do {            
            System.out.println("Ingrese un valor entero positivo");
            num = leer.nextInt();
        } while (num<1 || num>100);
        
        for (int i = 0; i < dim; i++) {
            if(vector[i]==num){
            cont++;
            System.out.println("El número " + num + " se encontró en la posición " + i);
            }
        }
        
        if(cont==0) System.out.println("No se encontró el número " + num + " en el vector.");
        else System.out.println("Se encontró el número " + num + ", " + cont + " veces.");
        
    }

    public static int[] llenarVector(int[] a, int b){
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < b; i++) {
            a[i] = aleatorio.nextInt(100);
        }
      
        return a;
        
    }
    
}