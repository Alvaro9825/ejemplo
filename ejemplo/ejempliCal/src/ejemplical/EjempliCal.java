/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplical;

import java.util.Scanner;

/**
 *
 * @author chino
 */
public class EjempliCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int a;
            int b;
            int res;
             Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:");
                    a = in.nextInt();
                    System.out.print("Ingrese el segundo numero:");
                    b = in.nextInt();
                    res = a + b;
                    System.out.println("Y como:" + res);
    }
    
}
