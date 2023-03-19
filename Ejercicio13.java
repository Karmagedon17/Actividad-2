package com.mycompany.ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);   
        String color,blanca,verde,amarilla,azul,roja;
        double compra,descuento;
        descuento = 0;  
        blanca = "blanca";
        verde = "verde";
        amarilla = "amarilla";
        azul = "azul";
        roja = "roja";
        System.out.println("Indique el precio de la compra:");
        compra = escaneo.nextDouble();
        System.out.println("Indique el color de la pelota:");        
        color = escaneo.next();
        if (color.equals(blanca)) {
            descuento = 0;
        }
        else if (color.equals(verde)) {
            descuento = 10;
        }
        else if (color.equals(amarilla)) {
            descuento = 25;
        }
        else if (color.equals(azul)) {
            descuento = 50;
        }
        else if (color.equals(roja)) {
            descuento = 100;
        }
        System.out.println("El valor final de su compra es: "+ (compra-(compra*descuento/100))+" $"); 
    }
}
