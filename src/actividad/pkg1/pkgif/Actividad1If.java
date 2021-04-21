/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1.pkgif;

import java.util.Scanner;

/**
 *
 * @author RORLe
 */
public class Actividad1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       System.out.println("Introduce un año");
       int año = entrada.nextInt();
       int añoD = 0;
       
       if(año < 2021){
           añoD = 2021 - año;
           System.out.println("Han pasado " + añoD + " años");
       } else if(año > 2021){
           añoD = año - 2021;
           System.out.println("Faltan " + añoD + " años");
       } else{
           System.out.println("Estamos en el mismo año");   
    }    
}
}
