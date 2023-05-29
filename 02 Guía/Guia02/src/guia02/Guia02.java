package guia02;

import java.util.Scanner;

public class Guia02 {

    public static void main(String[] args) {

        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        //pantalla.

        //Creamos el scanner
        Scanner leer = new Scanner(System.in);
        
        //pedimos por pantalla el nombre
        System.out.print("Ingrese su nommbre: ");
        String nombre = leer.next();
        
        //Mostramos el nombre
        System.out.println("");
        System.out.println("Su nombre es " + nombre);
        System.out.println("");
        
    }
    
}
