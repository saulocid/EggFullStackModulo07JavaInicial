package extra10;

import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
       
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        
        Scanner leer = new Scanner(System.in);
        
        int num, mult, ran1, ran2;
        
        System.out.println("Ingrese un resultado para adivinar una multiplicación.");
        System.out.println("El programa creará un producto entre los números 1 y 10.");
        System.out.println("Ingresa tantas veces debas hasta encontrarlo!!!");
        System.out.println("");
        
        ran1 = ((int)(Math.random()*10)+1);
        ran2 = ((int)(Math.random()*10)+1);
        mult = ran1*ran2;
        do{

            do {
                System.out.print("Ingresa un valor entero positivo: ");
                num = leer.nextInt();
                if (num<1) System.out.println("Valor incorrecto!");
            } while (num<1);

            if(num==mult) System.out.println("ADIVINASTE. " + mult + " es resultado de "  + ran1 + " * " + ran2);
            else {
                System.out.println("No adivinaste... VUELVE A INTENTAR!!!");
                if (num<mult)System.out.println("Prueba más alto!");
                else System.out.println("Prueba más bajo!");
            }
            
        } while (num!=mult);

    }

}