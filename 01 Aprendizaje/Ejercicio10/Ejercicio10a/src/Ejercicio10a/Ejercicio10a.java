
package Ejercicio10a;
import java.util.Scanner;

public class Ejercicio10a {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese 4 números del 1 al 20 para mostrar la cantidad de * en pantalla");
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese el numero " + i);
            num = leer.nextInt();
            while(num<1 || num>20){
                System.out.println("Ingresó un número erróneo, vuelva a ingresar");
                num = leer.nextInt();
            }
            
            System.out.print(num);
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        
    }
    
}
