package extra08;

import java.util.Scanner;

public class Extra08 {

    /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
    y la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num, cont=0, par=0, impar=0;

        System.out.println("Escribe números enteros para ir sumandolos");
        System.out.println("Si ingresa un múltiplo de 5 el programa terminará");
        System.out.println("Si ingresa números negativos no serán tomados en la suma");
        System.out.println("Evaluaremos pares e impares");
        System.out.println("");
        
        do {
            System.out.println("Ingrese un valor entero positivo");
            do {                
                num = leer.nextByte();
                if (num<1) System.out.println("Valor erróneo");
            } while (num<1);
            if (num%5==0){
                if(num%2==0) par++;
                else impar++;
                break;
            }else {
                if(num%2==0) par++;
                else impar++;
            }
        } while (num%5!=0);

        System.out.println("La cantidad de números pares es: " + par);
        System.out.println("La cantidad de números impares es: " + impar);
        
    }

}