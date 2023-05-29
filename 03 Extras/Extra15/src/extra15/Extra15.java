package extra15;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. */

public class Extra15 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        
        System.out.println("Ingrese 2 números para operar.");
        
                   
        System.out.print("Ingrese Nº 1: ");
        num1 = leer.nextInt();
                        
        System.out.print("Ingrese Nº 2: ");
        num2 = leer.nextInt();
            
        
        System.out.println("Elija una opcion para: 1. Suma, 2. Resta, 3.  Multiplica y 4. Divide");
        do {            
            System.out.println("Ingrese una opción válida");
            opc = leer.nextInt();
            if(opc<1 || opc>4) System.out.println("Valor erróneo");
        } while (opc<1 || opc>4);
        
        switch (opc) {            
            case 1:
                System.out.println("El resultado es " + suma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado es " + resta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado es " + multiplica(num1, num2));
                break;
            default:
                if (num2==0) System.out.println("No se puede dividir por  cero");
                else System.out.println("El resultado es " + divide(num1, num2));
        }

    }
    
    public static int suma(int a, int b){
        int res;
        res=a+b;
        return res;
    }
    
    public static int resta(int a, int b){
        int res;
        res=a-b;
        return res;
    }
    
    public static int multiplica(int a, int b){
        int res;
        res = a*b;
        return res;
    }
    
    public static float divide(int a, int b){
        float res;
        res=(float)a/b;
        return  res;
    }

}