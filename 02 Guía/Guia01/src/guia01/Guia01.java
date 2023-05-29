package guia01;

import java.util.Scanner;

public class Guia01 {

    public static void main(String[] args) {
        
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        //dos. El programa deberá después mostrar el resultado de la suma
        
        //Creamos el scanner
        Scanner leer = new Scanner(System.in);
        
        //pedimos los 2 números, notesé que se usa print para que la entrada 
        //quede pegado al sout anterior y baja con otro sout en blanco
        System.out.print("Ingrese primer número :");
        int num1 = leer.nextInt();
        System.out.println("");
        
        System.out.print("Ingrese segundo número :");
        int num2 = leer.nextInt();
        System.out.println("");
        
        //Mostramos por pantalla la suma, hay 2 formas
        
        //v1
        int suma = num1 + num2;
        System.out.println("Suma v1");
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
        System.out.println("");
        
        //v2
        System.out.println("Suma v2");
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));

    }
    
}
