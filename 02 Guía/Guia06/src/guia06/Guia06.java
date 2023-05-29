package guia06;
import java.util.Scanner;

public class Guia06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero para saber si es par o impar");
        int num = leer.nextInt();
        
        //v1 par
        if (num % 2 == 0){
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
        System.out.println("");
        
        //v2 impar
        if (num % 2 == 1){
            System.out.println("El numero " + num + " es impar");
        } else {
            System.out.println("El numero " + num + " es par");
        }
        
    }
    
}
