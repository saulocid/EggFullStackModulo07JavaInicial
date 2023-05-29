package extra05;

import java.util.Scanner;

public class Extra05 {
    
    /*Una obra social tiene tres clases de socios:
    
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
    para los mismos tratamientos que los socios del tipo A.
    
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.*/

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        char socio='\u0000';
        double totalConDescuento, valorTratamiento;
        
        System.out.println("Ingrese el tipo de socio entre A, B y C");
        do {
            System.out.print("Ingrese un valor correcto: ");
            socio = leer.next().charAt(0);
            if(socio<'A' || socio>'C' && socio<'a' || socio>'c') System.out.println("Caracter incorrecto");
        } while (socio<'A' || socio>'C' && socio<'a' || socio>'c');
        
        System.out.println("Ingrese el valor de ltratamiento (positivo)");
        do {            
            System.out.print("Ingrese un valor correcto $");
            valorTratamiento = leer.nextDouble();
            if(valorTratamiento<1) System.out.println("Valor erróneo!");
        } while (valorTratamiento<1);
        
        switch(socio){
            case 'a':
            case 'A':
                totalConDescuento = valorTratamiento*0.50;
                break;
            case 'b':
            case 'B':
                totalConDescuento = valorTratamiento*0.65;
                break;
            default:
                totalConDescuento = valorTratamiento;
        }
        
        System.out.println("El valor total del tratamiento es $" + totalConDescuento);

    }

}