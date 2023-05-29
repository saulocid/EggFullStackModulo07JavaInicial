package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cantidad;
        
        System.out.println("Ingrese la cantidad de compañeros");
        do {            
            cantidad = leer.nextInt();
            if (cantidad<0) System.out.println("Cantidad errónea, vuelva a ingresar");
        } while (cantidad<0);
        
        String[] Equipo = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del compañero " + (i+1));
            Equipo[i] = leer.next();           
        }
        
        System.out.println("Sus compañeros son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(Equipo[i]);
        }
        
    }
    
}
