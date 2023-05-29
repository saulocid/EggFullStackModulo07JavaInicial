package extra02;

import java.util.Random;
import java.util.Scanner;

public class Extra02 {

    /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
    C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int A=random.nextInt(51),B=random.nextInt(51), C=random.nextInt(51), D=random.nextInt(51), aux;
        
        System.out.println("Los valors de A, B, C y D son:");
        mostrarVariables(A, B, C, D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Los valores cambiados son");
        mostrarVariables(A, B, C, D);
        
    }
    
    public static void mostrarVariables(int a, int b, int c, int d){
        
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        System.out.println("C :" + c);
        System.out.println("D :" + d);
        System.out.println("");
        
    }

}