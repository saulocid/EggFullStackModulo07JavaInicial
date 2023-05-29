package extra23;

import java.util.Random;
import java.util.Scanner;

public class Extra23 {

    /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
    que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
    20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
    será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
    rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
    por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
    de Java substring(), Length() y Math.random().*/
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random alea = new Random();
            
        int num=0;
        String[] palabras = new String[5];
        char[][] matriz = new char[20][20];
        int v=0;
            
        for (int i = 0; i < 5; i++) {
            do {   
                System.out.println("Ingrese una palabra " + (i+1) + " entre 3 y 5 caracteres");
                palabras[i] = leer.nextLine();
                if (palabras[i].length() <3 || palabras[i].length()>5) {
                    System.out.println("Error. Ingrese nuevamente"); 
                }

            } while (palabras[i].length() <3 || palabras[i].length()>5); 
        }

        for (int i = 0; i < 5; i++) {

            do {   

                v = alea.nextInt(20);

                } while (matriz[v][0] != '\u0000');

                      for (int j = 0; j < palabras[i].length(); j++) {
                     matriz[v][j] =  palabras[i].charAt(j);
                } 
            }

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    num = alea.nextInt(10);
                    if (matriz[i][j]== '\u0000'){
                        matriz[i][j]=(char)(num+'0');
                    }
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println(""); 
        }
          
    }
        
       
       
}

