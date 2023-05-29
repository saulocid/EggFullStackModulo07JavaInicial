package ejercicio06;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números para saber si son mayores a 25");
        System.out.println("Ingrese número 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese número 2");
        int num2 = leer.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Los dos son mayores a 25");
        } else if (num1>25 && num2<=25){
            System.out.println("El número " + num1 + " es mayor a 25");
        } else if (num2>25 && num1<=25){
            System.out.println("El número " + num2 + " es mayor a 25");
        }
        
    }
    
}
