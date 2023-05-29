package ejercicio11d;

import java.util.Scanner;
import java.lang.String;

public class Ejercicio11d {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String caracter = "";
        String frase = "";
        int cont = 0;
        String aux;
        char caracter2 = '\u0000';
        
        System.out.println("Ingresa una secuencia de caracteres para completar una frase");
        System.out.println("De esa frase se reemplazaran sus vocales");
        System.out.println("Para terminar la carga debe ingresar un punto '.' ");
        
        do {            
            cont++;
            System.out.println("Ingrese el caracter número " + cont);
            do {                
                caracter = leer.nextLine();
                if (caracter.length()>1){
                    System.out.println("Error, ingrese de a 1 caracter");
                }
            } while (caracter.length()>1);
            
            frase = frase.concat(caracter);
        } while (!caracter.equals("."));
        
        System.out.println("La cadena ingresada es:");
        System.out.println(frase);
        
        String nuevaFrase = "";
        caracter = "";
        
        for (int i = 0; i < frase.length(); i++) {
            caracter2 = frase.charAt(i);
            nuevaFrase = nuevaFrase.concat(String.valueOf(reemChar(caracter2)));
        }
        
        System.out.println("La cadena modificada es:");
        System.out.println(nuevaFrase);
        
    }
    
    public static char reemChar(char char1){
        
        switch (char1){
            case 'a':
            case 'A':
                char1 = '@';
                break;
            case 'e':
            case 'E':
                char1 = '#';
                break;
            case 'i':
            case 'I':
                char1 = '$';
                break;
            case 'o':
            case 'O':
                char1 = '%';
                break;
            case 'u':    
            case 'U':
                char1 = '*';
                break;
        }
        
        return char1;
         
    }
    
}
