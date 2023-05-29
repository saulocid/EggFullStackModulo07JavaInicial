package extra06;

import java.util.Scanner;

public class Extra06 {

    /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
    por debajo de 1.60 mts. y el promedio de estaturas en general.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int personas, cont=0;
        double alturas, sumaTotal=0, sumaBajitos=0;
        

        System.out.println("Ingrese la cantidad de personas a evaluar su altura");
        do {            
            System.out.print("Ingrese un valor entero positivo : ");
            personas = leer.nextInt();
            if (personas<1) System.out.println("Valor erróneo");
        } while (personas<1);
        System.out.println("");
        
        System.out.println("Ingrese la altura de las " + personas + " personas en cuestión (valor positivo, por favor)");
        for (int i = 1; i <= personas; i++) {
            System.out.print("Altura persona " + i + ": ");
            do {                
                alturas = leer.nextDouble();
                if (alturas<1) System.out.println("Ingresó un número incorrecto!! Vuelva a ingresar");
                else if (alturas<1.6){
                    cont++;
                    sumaBajitos += alturas;
                    sumaTotal += alturas;
                } else sumaTotal += alturas;
            } while (alturas<1);
        }
        
        if(cont>0){
            System.out.println("El promedio de altura total de las " + cont + " personas menores a 1.60 mts es " + (sumaBajitos/cont));
            System.out.println("El promedio de altura general de las " + personas + " personas es " + (sumaTotal/personas));
        } else System.out.println("El promedio de altura general de las " + personas + " personas es " + (sumaTotal/personas));
    }

}