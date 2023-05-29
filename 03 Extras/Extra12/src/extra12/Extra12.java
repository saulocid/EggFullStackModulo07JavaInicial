package extra12;

public class Extra12 {

    /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
    0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Nota: investigar función equals() y como convertir números a String.*/
    
    public static void main(String[] args) {
        
        String[] vector = {"0", "-", "0", "-", "0"};
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    vector[0]=String.valueOf(i);
                    vector[2]=String.valueOf(j);
                    vector[4]=String.valueOf(k);
                    
                    for (int l = 0; l < 5; l++) {
                        
                        if(vector[l].equals("3")){
                            vector[l]="E";
                        }
                        System.out.print(vector[l]);
                    }
                    System.out.println("");
                }
            }
        }
        
    }
    
}