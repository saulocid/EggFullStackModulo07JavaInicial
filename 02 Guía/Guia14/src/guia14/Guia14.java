package guia14;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.util.Scanner;

public class Guia14 {

    // 0.86 libras es un 1 €
    // 1.28611 $ es un 1 €
    // 129.852 yenes es un 1 €
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        double euros;
        int moneda;
        String divisa = null;
        
        do {            
            System.out.println("Ingrese la cantidad de Euros a convertir");
            euros = leer.nextDouble();
        } while (euros<0);

        do {            
            System.out.println("Elija una número válido para:");
            System.out.println("1. Libra");
            System.out.println("2. Dolar");
            System.out.println("3. Yen");
            moneda = leer.nextInt();            
        } while (moneda<1 || moneda>3);
        
        switch (moneda){
            case 1:
                divisa = "Libra";
                break;
            case 2:
                divisa = "Dolar";
                break;
            case 3:
                divisa = "Yen";
                break;
        }
        
        convertirMoneda(euros, divisa);
        
    }
    
    public static void convertirMoneda(double a, String b){
        
        double conversion=0;
        
        switch (b){
            case "Libra":
                conversion = a * 0.86;
                break;
            case "Dolar":
                conversion = a * 1.28611;
                break;
            case "Yen":
                conversion = a * 129.852;
                break;  
        }
        
        System.out.println("El total de Euros a " + b + " es: " + conversion);
        
    }

}