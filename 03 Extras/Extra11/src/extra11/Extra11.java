package extra11;

import java.util.Scanner;

public class Extra11 {

    /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
    operador de división. Nota: recordar que las variables de tipo entero truncan los
    números o resultados.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un valor entero positivo para calcular sus dígitos");
        do {            
            System.out.print("Ingrese un número correcto: ");
            num = leer.nextInt();
            if (num<1) System.out.println("Valor incorrecto!");
        } while (num<1);
        
        int digi = digitos(num);
        
        System.out.println("Hay " + digi + " dígitos en el número " + num);

    }
    
    public static int digitos(int a) {
        
        if (a<10) return 1;
        else return 1 + digitos(a/10);

    }

}