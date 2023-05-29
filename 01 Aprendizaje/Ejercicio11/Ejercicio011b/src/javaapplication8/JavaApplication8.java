/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author saulo
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println(transforma(frase));
    }
    
    public static String transforma(String frase){
        char letra;
        String newFrase = "";
        
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
 		
            switch (letra) {
                case 'a':
                    letra = '@';
                    break;
                case 'e':
                    letra = '#';
                    break;
                case 'i':
                    letra = '$';
                    break;
                case 'o':
                    letra = '%';
                    break;
                case 'u':
                    letra = '*';
                    break;
            }
         
        newFrase += letra;
	}
        
    return newFrase;
    

        
    }
    
}
