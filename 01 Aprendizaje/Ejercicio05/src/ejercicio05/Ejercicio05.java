package ejercicio05;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese true o false");
        boolean bandera = leer.nextBoolean();
        System.out.println("Ingrese un decimal");
        float decimal = leer.nextFloat();
        System.out.println("Ingrese un caracter");
        char caracter = leer.next().charAt(0);
        
        System.out.println("La bandera es " + bandera);
        System.out.println("El decimal es " + decimal);
        System.out.println("El caracter es " + caracter);
        
    }
    
}
