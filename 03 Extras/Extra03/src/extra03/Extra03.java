package extra03;

import java.util.Scanner;

public class Extra03 {

    /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
    String.*/

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra para verificar si es vocal o no: ");
        String letra = leer.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Sí es una vocal! =D ");
        } else {
            System.out.println("NO es una vocal... -_- ");
        }

    }

}