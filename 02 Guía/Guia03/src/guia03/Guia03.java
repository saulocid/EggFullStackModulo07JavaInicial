package guia03;
import java.util.Scanner;

public class Guia03 {

    public static void main(String[] args) {
        
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
        //Java.
        
        //Creamos el scanner
        Scanner leer = new Scanner(System.in);
        
        //Pedimos la frase por pantalla
        System.out.println("Ingrese una frase para modificar sus caracteres:");
        String frase = leer.nextLine();
        System.out.println("");
        
        //Convertimos en mayúsculas y minúsculas a nuevas variables
        String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        
        //Mostramos por pantalla
        System.out.println("La frase en mayúsculas es:");
        System.out.println(fraseMayus);
        System.out.println("");
        
        System.out.println("La frase en minusculas es:");
        System.out.println(fraseMinus);
        System.out.println("");
        
    }
    
}
