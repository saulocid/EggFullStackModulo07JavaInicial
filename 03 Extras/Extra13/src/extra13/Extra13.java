package extra13;

import java.util.Scanner;

public class Extra13 {

    /*Crear un programa que dibuje una escalera de números, donde cada línea de números
    comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    usuario al comenzar. Ejemplo: si se ingresa el número 3:
    1
    12
    123*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num;
        String cad="";

        System.out.println("Ingrese un valor entero positivo");
        do {            
            System.out.print("Ingrese valor correcto: ");
            num = leer.nextInt();
            if  (num<1) System.out.println("Valor erróneo!");
        } while (num<1);
        
        for (int i = 1; i <= num; i++) {
            cad+=String.valueOf(i);
            System.out.println(cad);
        }

    }

}