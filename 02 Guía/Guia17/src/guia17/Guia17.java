package guia17;

import java.util.Random;
import java.util.Scanner;

public class Guia17 {
    
    //Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    //de 2 dígitos, etcétera (hasta 5 dígitos).

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int dim;

        System.out.println("Ingrese un número entero positivo para dimensionar un vector de números");
        do {            
            System.out.println("Ingrese un número válido");
            dim = leer.nextInt();
        } while (dim<1);
        
        int[] vector = new int[dim];
        int[] contador = new int[5];
        
        vector = llenarVector(vector, dim);
        
        contador = dividirUnidades(vector, dim);
        
        mostrarVector(vector,dim);
        
        mostrarContador(contador);

    }
    
    public static int[] llenarVector(int[] a, int b){
    
        Random alea = new Random();
        
            for (int i = 0; i < b; i++) {
                a[i] = alea.nextInt(99999);
            }
    
        return a;
    
    }
    
    public static int[] dividirUnidades(int[] a, int b){
        
        int[] cont = new int[5];
        
        for (int i = 0; i < 10; i++) {
            if(a[i]<10) cont[0]++;
            else if(a[i]<100) cont[1]++;
            else if(a[i]<1000) cont[2]++;
            else if(a[i]<10000) cont[3]++;
            else if(a[i]<100000) cont[4]++;
        }
        
        return cont;
        
    }
    
    public static void mostrarVector(int[] a,int b){
        
        System.out.println("La matriz es");
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
        
    }
    
    public static void mostrarContador(int[] a){
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Números de " + (i+1) + " dígitos: " + a[i]);
        }
        
        
    }

}