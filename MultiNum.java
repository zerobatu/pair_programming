/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multinum;

import java.util.Scanner;

/**
 *
 * @author nico121
 */
public class Multinum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        int x,y,res;
        System.out.println("Introdusca un numero entero");
        x=leer.nextInt();
        for (y=1;y<=10;y++) {
            res=x*y;
            System.out.println(x+ "*" +y +"="+ res);
        }
                
    }
}
