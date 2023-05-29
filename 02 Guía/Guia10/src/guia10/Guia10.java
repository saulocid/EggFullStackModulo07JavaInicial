package guia10;

import java.util.Scanner;

public class Guia10 {

    public static void main(String[] args) {
        
        //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        //solicite números al usuario hasta que la suma de los números introducidos supere el
        //límite inicial. 
        
        Scanner leer = new Scanner(System.in);
        int limite, contador=0,  suma=0, numero;
        
        System.out.println("Ingrese una cantidad entera positiva para ingresar números");
        do {            
            limite  = leer.nextInt();
            if(limite<1){
                System.out.println("Ingresó un número incorrecto, vuelva a ingresar");
            }
        } while (limite<1);
        
        System.out.println("Ingrese números para ir sumando y ");
        do{
            contador++;
            System.out.println("Ingresa el número " + contador);
            numero = leer.nextInt();
            suma+=numero;
        } while (suma<limite);
        System.out.println("La suma es " + suma);
    }
    
}
