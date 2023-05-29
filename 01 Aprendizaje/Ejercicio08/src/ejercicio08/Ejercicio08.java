
package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para valdiar una nota entre 0 y 10");
        int nota = leer.nextInt();
        
        while(nota<0 || nota>10){
            System.out.println("Ingresó una nota inválida, vuelva a ingresar");
            nota = leer.nextInt();
        }
        
        System.out.println("La nota elegida es " + nota);
        
    }
    
}
