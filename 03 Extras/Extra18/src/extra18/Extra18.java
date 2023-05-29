package extra18;

import com.sun.javafx.binding.SelectBinding;
import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/

public class Extra18 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        int dim;
        double suma=0, num;
        
        do {            
            System.out.print("Ingrese una cantidad de números a sumar (entero positivo): ");
            dim = leer.nextInt();
            if(dim<1) System.out.println("Ingresó   un valor erróneo.");
        } while (dim<1);
        
        double[]  vector = new double[dim];
        
        System.out.println("Ingrese números para ir sumando");
        for (int i = 0; i < dim; i++) {
            System.out.print("Ingrese valor para posición " + (i+1) + ": ");
            vector[i] = leer.nextDouble();
            suma+=vector[i];
        }
        
        System.out.println("La suma es " + suma);
        
    }

}