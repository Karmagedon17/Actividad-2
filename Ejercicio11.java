package com.mycompany.ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int a,b,c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        if ((a>b) & (a>c)){
            System.out.println(a +" Es el número mayor");
    }
        if ((b>a) & (b>c)){
            System.out.println(b +" Es el número mayor");
    }
        if ((c>a) & (c>b)){
            System.out.println(c +" Es el número mayor");
    }
    }
}
