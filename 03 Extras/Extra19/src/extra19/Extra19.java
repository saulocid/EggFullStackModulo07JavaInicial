package extra19;

import java.util.Scanner;

/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/

public class Extra19 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int dim;

        System.out.println("Ingrese un valor para dimensionar 2 vectores");
        System.out.println("Éstos se llenaran aleatoreamente y los compararemos");
        
        do {            
            System.out.println("Ingrese un valor correcto");
            dim = leer.nextInt();
            if(dim<1) System.out.println("Valor incorrecto");
        } while (dim<1);

        int[] vectorA = new int[dim];
        int[] vectorB = new int[dim];
        boolean verificar;
        
        vectorA = llenar(vectorA, dim);
        vectorB = llenar(vectorB, dim);
        
        System.out.println("El Vector A es:");
        mostrar(vectorA, dim);
        System.out.println("");
        
        System.out.println("El Vector B es:");
        mostrar(vectorB, dim);
        System.out.println("");
        
        verificar =  comparoVectores(vectorA, vectorB, dim);
        
        if(verificar==true) System.out.println("Los vectores son iguales!!");
        else System.out.println("Son distintos sus vectores");
        
    }
    
    public static int[] llenar(int[] vec, int dim) {
        
        for (int i = 0; i < dim; i++) {
            vec[i]= (int) (Math.random() * 10);
        }
        
        return vec;
        
    }
    
    public static boolean comparoVectores(int[] vecA, int[] vecB, int dim){
        
        boolean res=true;
        
        for (int i = 0; i < dim; i++) {
            if (vecA[i]!=vecB[i]) {
                res=false;
                break;
            }
        }
        
        return res;
        
    }
    
    public static void mostrar(int[] vec, int dim){
        
        for (int i = 0; i < dim; i++) {
            System.out.print(vec[i] + " ");
        }
        
    }

}