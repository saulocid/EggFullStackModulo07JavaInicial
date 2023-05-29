package extra14;

import java.util.Scanner;

public class Extra14 {

    /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
    cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        int familia, hijos, edad, edadFamilia=0, contHijo=0, edadTotal=0, contFinal=0;

        do {            
            System.out.print("Ingrese la cantidad de familias a evaluar: ");
            familia = leer.nextInt();
            if(familia<1) System.out.println("Ingresño un valor erróneo");
        } while (familia<1);
        
        for (int i = 1; i <= familia; i++) {
            
            do {                
                System.out.print("Ingrese la cantidad de hijos para la familia Nº " + i + ": ");
                hijos = leer.nextInt();
                if(hijos<1) System.out.println("Ingresño un valor erróneo");
            } while (hijos<1);
            
            for (int j = 1; j <= hijos; j++) {
                
                do {                    
                    System.out.print("Ingrese la edad para el hijo " + j + ": ");
                    edad  = leer.nextInt();
                    if (edad<1) System.out.println("Ingresño un valor erróneo");
                } while (edad<1);
                
                edadFamilia += edad;
                contHijo++;
                contFinal++;
                
            }
            
            System.out.println("La edad promedio de la familia " + i + " es " + (double)(edadFamilia/contHijo));
            
            edadTotal += edadFamilia;
            edadFamilia=0;
            contHijo=0;
        }
        
        System.out.println("El promedio total de edades de las " + familia + " familias es " + (double)(edadTotal/contFinal));
        
    }

}