package extra07;

import java.util.Scanner;

public class Extra07 {

    /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
    promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
    números serán introducidos por el usuario. Realice dos versiones del programa, una
    usando el bucle “while” y otra con el bucle “do - while”.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int cant, num, cont=0, suma=0,  min=0,  max=0;
        
        //con Do - while
        System.out.println("Ingrese una cantidad de números a evaluar, entero y positivo.");
        do {
            System.out.println("ingrese un número válido");
            cant = leer.nextInt();
            if(cant<1) System.out.println("Ingresó un número inválido");
        } while (cant<1);
        System.out.println("");
        
        System.out.println("A continuación ingrese valores enteros para evaluarlos");
        do {            
            cont++;
            System.out.println("Ingrese número " + cont + " : ");
            num = leer.nextInt();
            if (cont==1){
                min = num;
                max = num;
            } else if (num>max) max=num;
            else if  (num<min) min=num;
            
            suma += num;
            
        } while (cont<cant);
        
        System.out.println("El máximo es " + max);
        System.out.println("El mínimo es " + min);
        System.out.println("El promedio es " + ((float)suma/cant));
        
        cont=0;
        suma=0;
        min=0;
        max=0;
        
        //con While
        System.out.println("Ingrese una cantidad de números a evaluar, entero y positivo.");
        do {
            System.out.println("ingrese un número válido");
            cant = leer.nextInt();
            if(cant<1) System.out.println("Ingresó un número inválido");
        } while (cant<1);
        System.out.println("");
        
        while (cont<cant) {            
            
            cont++;
            System.out.println("Ingrese número " + cont + " : ");
            num = leer.nextInt();
            if (cont==1){
                min = num;
                max = num;
            } else if (num>max) max=num;
            else if  (num<min) min=num;
            
            suma += num;
            
        }
        
        System.out.println("El máximo es " + max);
        System.out.println("El mínimo es " + min);
        System.out.println("El promedio es " + ((float)suma/cant));
        
    }

}