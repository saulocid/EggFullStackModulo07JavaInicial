/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author saulo
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese una frase terminada con punto");
        String frase = Sc.nextLine();
        //String frase2 = transformar(frase);
        System.out.println(transformar(frase));
        
    }
    
    public static String transformar (String frase){
        String frase2 = "";
        int largo = frase.length();
        System.out.println(largo);
        for (int i = 0; i < largo; i++){
            String letra = frase.substring(i, i + 1);
           // System.out.println(letra);
            switch (letra){
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;              
            } 
            frase2 = frase2.concat(letra);
        }
        return frase2;
        
    }
    
}
