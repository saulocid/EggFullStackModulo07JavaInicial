package ejercicio10b;
import java.util.Scanner;

public class Ejercicio10b {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, num1=0, num2=0, num3=0, num4=0;
        
        for (int i = 1; i <= 4; i++) {
            do {
                System.out.println("Ingresa un número entre el 1 y el 20");
                num = leer.nextInt();
                if (num > 0 && num <= 20) {
                  switch (i) {
                case 1:
                    num1 = num;
                    break;
                 case 2:
                    num2 = num;
                    break;
                 case 3:
                     num3 = num;
                     break;
                 case 4:
                     num4 = num;
                     break;
                }  
                }
            } while (num < 1 && num > 20);
        }
        
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                  System.out.print(num1 + " ");
                  for (int j = 1; j <= num1; j++) {
                    System.out.print("*");
                   }
                System.out.println("");
                break;
                case 2:
                  System.out.print(num2 + " ");
                  for (int j = 1; j <= num2; j++) {
                    System.out.print("*");
                   }
                System.out.println("");
                break;
                case 3:
                  System.out.print(num3 + " ");
                  for (int j = 1; j <= num3; j++) {
                    System.out.print("*");
                   }
                System.out.println("");
                break;
                case 4:
                  System.out.print(num4 + " ");
                  for (int j = 1; j <= num4; j++) {
                    System.out.print("*");
                   }
                System.out.println("");
                break;    
            }
        }
    
    }
    
}
