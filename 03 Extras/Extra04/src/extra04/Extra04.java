package extra04;

import java.util.Scanner;

public class Extra04 {

    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num;

        do {            
            System.out.print("Ingrese un número del 1 al 10: ");
            num = leer.nextInt();
            if(num<1 || num>10) System.out.println("Valor erróneo!");
        } while (num<1 || num>10);
        
        switch(num){
            case 1:
                System.out.println("El número romano equivalente a " + num + " es I");
                break;
            case 2:
                System.out.println("El número romano equivalente a " + num + " es II");
                break;
            case 3:
                System.out.println("El número romano equivalente a " + num + " es III");
                break;
            case 4:
                System.out.println("El número romano equivalente a " + num + " es IV");
                break;
            case 5:
                System.out.println("El número romano equivalente a " + num + " es V");
                break;
            case 6:
                System.out.println("El número romano equivalente a " + num + " es VI");
                break;
            case 7:
                System.out.println("El número romano equivalente a " + num + " es VII");
                break;
            case 8:
                System.out.println("El número romano equivalente a " + num + " es VIII");
                break;
            case 9:
                System.out.println("El número romano equivalente a " + num + " es IX");
                break;
            default:
                System.out.println("El número romano equivalente a " + num + " es X");
                
        }

    }

}