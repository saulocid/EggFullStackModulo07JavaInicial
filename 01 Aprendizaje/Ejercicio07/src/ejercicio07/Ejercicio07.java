package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de bomba eligiendo un número del 1 al 4");
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasolina");
                break; 
            case 3:
                System.out.println("La bomba es de hormigón");
                break; 
            case 4:
                System.out.println("La bomba es de pasta alimenticia");
                break; 
            default:
                System.out.println("No existe un valor válido para el tipo de bomba");
        }
                
    }
    
}
