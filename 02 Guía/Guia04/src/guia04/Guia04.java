package guia04;
import java.util.Scanner;

public class Guia04 {
    
    public static void main(String[] args) {
        
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        //Creamos el scanner
        Scanner leer = new Scanner(System.in);
        
        //Pedimos los grados en Celcius
        System.out.println("Ingrese la cantidad de grados Celcius");
        float celcius = leer.nextFloat();
        System.out.println("");
        
        //Transformamos y guardamos en una variable
        float fahrengeit = 32 + (9 * celcius / 5);
        
        //Mostramos por pantalla
        System.out.println("La cantidad de grados " + celcius + " Celcius  es/son " + fahrengeit + " Fahrengeit");
        
    }
    
}
