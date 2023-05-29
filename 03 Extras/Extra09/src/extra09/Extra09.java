package extra09;

import java.util.Scanner;

public class Extra09 {
    
    //Simular division con restas, calcular la division y el resto
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int[] resultados= new int[2];
        int num1, num2;

        System.out.println("Ingrese 2 números enteros positivos, el segundo dividirá al primero con el método de restas sucesivas");
        do {            
            System.out.print("Ingrese primer número: ");
            num1 = leer.nextInt();
            if (num1<1)System.out.println("Número incorrecto!");
        } while (num1<1);
        
        do {            
            System.out.print("Ingrese segundo número: ");
            num2 = leer.nextInt();
            if (num2<1)System.out.println("Número incorrecto!");
        } while (num2<1);
        
        resultados = dividirConResta(num1, num2);
        
        System.out.println("La división de " + num1 + " entre " + num2 + " es " + resultados[1] + " y su resto es " + resultados[0]);
    }
    
    public static int[] dividirConResta(int num1, int num2){
        
        int[] valores = new int[2];
        
        do {            
            num1-=num2;
            valores[1]++;
        } while (num1>=num2);
        valores[0]=num1;
        
        return valores;
        
    }

}