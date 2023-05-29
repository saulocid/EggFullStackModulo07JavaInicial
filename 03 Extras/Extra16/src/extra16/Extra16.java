package extra16;

import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/


public class Extra16 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        String nombre, opc;
        int edad, personas;
        
        System.out.println("Ingrese la cantidad de personas a evaluar");
        do {            
            System.out.print("Ingrese un valor entero positivo: ");
            personas = leer.nextInt();
            if(personas<1) System.out.println("Valor incorrecto.");
        } while (personas<1);
        
        for (int i = 1; i <= personas; i++) {
            
            System.out.println("Ingrese datos de la persona " + i);
            
            System.out.print("Ingrese el nombre: ");
            nombre = leer.next();
            
            do {                
                System.out.print("Ingrese la edad: ");
                edad = leer.nextInt();
                if(edad<0) System.out.println("Valor incorrecto.");
            } while (edad<0);
            
            if (edad<18) System.out.println(nombre + " tiene " + edad + " y es menor de edad.");
            else System.out.println(nombre + " tiene " + edad + " y es mayor de edad.");
            
            if(i!=personas){
                System.out.println("Desea seguir introduciendo mostrando personas?");
            opc = leer.next();
            if(opc.equalsIgnoreCase("no")) break;
            }
            
        }

    }

}