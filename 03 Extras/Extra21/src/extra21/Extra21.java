package extra21;

import java.util.Scanner;

/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.

nota1*0.10);
nota1*0.15);
nota1*0.25);
nota1*0.5);*/

public class Extra21 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        double[][] matriz = new double[10][4];
        double[] vector = new double[10];

        System.out.println("Ingrese las notas de los 10 alumnos para ser evaluadas");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i+1) + ":");
            matriz = llenarNotas(matriz, i);
        }
        
        vector = ponderarNotar(matriz, vector);
        System.out.println("Las notas finales son:");
        mostrarVector(vector);

    }
    
    public static double[][] llenarNotas(double[][] nota, int alumno){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese notas del 1 al 10");
        for (int i = 0; i < 4; i++) {
            
            do {
                System.out.print("Ingrese nota Nº" + (i+1) + ": ");
                nota[alumno][i]=leer.nextInt();
                if (nota[alumno][i]<1 || nota[alumno][i]>10) System.out.println("VALOR INCORRECTO!!");
            } while (nota[alumno][i]<1 || nota[alumno][i]>10);
            
            switch (i) {
                case 0:
                    nota[alumno][i]*=0.10;
                    break;
                case 1:
                    nota[alumno][i]*=0.15;
                    break;
                case 2:
                    nota[alumno][i]*=0.25;
                    break;
                default:
                    nota[alumno][i]*=0.5;
                    break;
            }
        }
        System.out.println("");
        
        return nota;
    }
    
    public static double[] ponderarNotar(double[][] nota, double[] vec){
        
        double suma=0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                suma+=nota[i][j];
            }
            vec[i]=suma;
            suma=0;
        }
        
        return vec;
        
    }
    
    public static void mostrarVector(double[] vec){
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i+1) + ": " + vec[i]);
        }
        
    }

}