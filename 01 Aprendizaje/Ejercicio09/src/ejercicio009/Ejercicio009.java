
package ejercicio009;
import java.util.Scanner;

public class Ejercicio009 {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        int num, suma = 0, cont = 0;
        
        do {            
            System.out.println("Ingrese un número  para sumarlo, para salir ingrese 0");
            num = leer.nextInt();
            cont +=1;
            if (num>0) {
                suma += num;
            }
            if (num==0){
                System.out.println("Se capturó el número 0");
            }
        } while (num != 0 && cont != 20);
        
        System.out.println("La suma es " + suma);
        
    }
    
}
