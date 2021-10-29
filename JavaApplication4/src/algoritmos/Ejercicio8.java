package algoritmos;

// Ejercicio 8

import java.util.Scanner;

// Determina si una persona es mayor o menor de edad
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ing. la edad");
        int edad = ingreso.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("No eres mayor de edad");
        }
    }
}
