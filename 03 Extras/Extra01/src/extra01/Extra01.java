package extra01;

import java.util.Scanner;

public class Extra01 {

    //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    //usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int min, horas, dia, aux;
        
        System.out.println("Ingrese una cantidad de minutos en números enteros positivos");
        do {
            System.out.println("Ingrese un valor correcto");
            min = leer.nextInt();
        } while (min<1);
        
        horas = (min % (24*60))/60;
        dia = min/(24*60);
        aux = min % 60;

        
        
        System.out.println("Hay " + dia + " días, " + horas + " horas y " + aux + " minutos en " + min + " minutos.");

    }

}