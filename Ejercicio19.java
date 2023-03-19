package com.mycompany.actividad19;
import java.util.Scanner;
public class Ejercicio19 {
    
    public static void main(String[] args) {
        double lado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado de su triangulo:");
        lado = entrada.nextDouble();
        System.out.println("El valor de el perimetro es: "+lado*3);
        System.out.println("El valor de la altura es: "+ Math.sqrt(lado*lado-lado/2*lado/2));
        System.out.println("El valor de la area es: "+ (lado*lado/2));

    }
}
