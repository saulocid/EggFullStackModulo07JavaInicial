package guia07;

import java.util.Scanner;

public class Guia07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra para comparar, si pone 'eureka' será válido");
        String frase = leer.nextLine();
        
        boolean bandera = frase.equals("eureka");
        if (bandera==true){
        System.out.println("La palabra '" + frase + "' es CORRECTA");
        } else {
            System.out.println("La palabra '" + frase + "' es INCORRECTA");
        }
    }
    
}
