
package com.mycompany.ejercicio23;
import java.util.Scanner;
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);
        double A,B,C,solucion1,solucion2;
        System.out.println("Ingrese el valor de A:");
        A = escaneo.nextDouble();
        System.out.println("Ingrese el valor de B:");
        B = escaneo.nextDouble();
        System.out.println("Ingrese el valor de C:");
        C = escaneo.nextDouble();
        solucion1 = ( (-1*B) + Math.sqrt(B*B-(4*A*C)))/(2*A);
        solucion2 = ( (-1*B) - Math.sqrt(B*B-(4*A*C)))/(2*A);
        System.out.println("La primera solucion de la ecuacion es: "+solucion1);
        System.out.println("La segunda solucion de la ecuacion es: "+solucion2);
        
    }
}
