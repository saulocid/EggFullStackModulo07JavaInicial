package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    /* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
    que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
    segundo, sino informe que no lo son. */
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números para validar si es múltiplo o no");
        System.out.println("Ingrese primer número");
        float numero1 = leer.nextFloat();
        System.out.println("Ingrese segundo número");
        float numero2 = leer.nextFloat();
        
        EsMultiplo(numero1, numero2);
        
    }
    
    public static void EsMultiplo(float num1, float num2){
        
        if(num2 % num1 == 0){
            System.out.println("El número " + num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("El número " + num2 + " NO es múltiplo de " + num1);
        }
        
    }
    
}
