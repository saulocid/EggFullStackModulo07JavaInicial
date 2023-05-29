package guia05;
import java.util.Scanner;

public class Guia05 {

    public static void main(String[] args) {
        
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        //doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
        //Math.sqrt().

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        
        int doble = num*2;
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("");
        
        int triple = num*3;
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("");
        
        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada de " + num + " es " + raiz);
        System.out.println("");
        
    }
    
}
