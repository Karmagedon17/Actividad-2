package com.mycompany.ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        String nombre;
        int horas_trabajadas;
        double valor_trabajo,nomina_final;
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Nombre de el trabajador:");
        nombre = escaneo.next();
        System.out.println("Horas trabajadas:");
        horas_trabajadas = escaneo.nextInt();
        System.out.println("Valor hora de trabajo:");
        valor_trabajo = escaneo.nextDouble();
        System.out.println(nombre+" El pago asignado por su trabajo es:");
        nomina_final = horas_trabajadas*valor_trabajo;
        if (horas_trabajadas>40) {
            nomina_final = (horas_trabajadas-40)*2*valor_trabajo+ 40*valor_trabajo;
        }
        if (horas_trabajadas>48) {
            nomina_final = (horas_trabajadas-48)*3*valor_trabajo + 8*2*valor_trabajo + 40*valor_trabajo;
        }        
        System.out.println(nomina_final);        
        
    }
}
