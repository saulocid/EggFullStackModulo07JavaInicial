package guia11;

import java.util.Scanner;

public class Guia11 {

    public static void main(String[] args) {
        
        //Ingresar 2 números enteros y hacer lo mostrar:
        //MENU
        //1. Sumar
        //2. Restar
        //3. Multiplicar
        //4. Dividir
        //5. Salir
        //Elija opción:
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Bienvenidos al menú Aritmético.");
        System.out.println("Ingrese 2 números enteros positivos y luego opere con el menú.");
        System.out.println("Para cargar nuevos números deberá reiniciar el programa.");
        System.out.println("--------------------------------------------------------------");        
        
        int num1=0, num2=0;
        
        do {            
            System.out.print("Ingrese primer número: ");
            num1 = leer.nextInt();
            if(num1<1) System.out.println("Número inválido");
        } while (num1<1);
        
        
        do {            
            System.out.print("Ingrese segundo número: ");
            num2 = leer.nextInt();
            if(num2<1) System.out.println("Número inválido");
        } while (num2<1);
        
        
        int opcion = 0, resultado = 0;
        float resultado2;
        String salida = "N";
        
        do {            
            
            System.out.println("");
            System.out.println("--------------------");
            System.out.println("|       MENU       |");
            System.out.println("|     1. SUMAR     |");
            System.out.println("|    2. RESTAR     |");
            System.out.println("|  3. MULTIPLICAR  |");
            System.out.println("|    4. DIVIDIR    |");
            System.out.println("|     5. SALIR     |");
            System.out.println("--------------------");
            System.out.print("Elija una opción válida: ");
            opcion = leer.nextInt();
            if (opcion<1 || opcion>5){
                System.out.println("Ha ingresado una opcion inválida, vuelva a ingresar");    
            } else {
                switch (opcion){
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("La suma de " + num1 + " más " + num2 + " es " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("La resta de " + num1 + " menos " + num2 + " es " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("La muliplicación de " + num1 + " por " + num2 + " es " + resultado);
                        break;
                    case 4:
                        resultado2 = (float)num1 / num2;
                        System.out.println("La división de " + num1 + " dividido " + num2 + " es " + resultado2);
                        break;
                    case 5:
                        do {                            
                            System.out.print("Desea salir del programa? Ingrese S o N: ");
                            salida = leer.next();
                        } while (!salida.equals("S") && !salida.equals("N"));
                        break;
                }
            }
            
        } while (opcion != 5 || !"S".equals(salida));
        
    }
    
}
