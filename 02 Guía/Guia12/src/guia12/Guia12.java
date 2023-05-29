package guia12;

import java.util.Scanner;

public class Guia12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String secuencia="";
        int cont=0, contTrue=0, contFalse=0;
        boolean salir = false;
        System.out.println("A continuación ingrese una lista de secuencias RS232  para validarlas");
        System.out.println("Para salir ingrese la secuencia especial  &&&&&");
        
        do {          
            cont++;
            System.out.println("Ingrese la secuencia " + cont + " para validar");
            secuencia = leer.next().toUpperCase();
            if(secuencia.equals("&&&&&")){
                salir = true;
            }else if(secuencia.length()==5 && secuencia.substring(0,1).equals("X") && secuencia.substring(4).equals("O")){
                contTrue++;
            } else {
                contFalse++;
            }
        } while (salir==false);
        
        System.out.println("Se contabilizaron " + contTrue + " secuencias correctas y " + contFalse + " secuencias incorrectas.");
        
    }
    
}
