package calculadora;

import java.util.Scanner;

import servicios.CalculadoraServices;

public class Calculadora5 {

    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ing. el 1er. nro.");
        double nro1 = ingreso.nextDouble();
        int opcion = 234654654;
        do {
            System.out.println("Ing. el operador");
            char operador = ingreso.next().charAt(0);

            System.out.println("Ing. el siguiente nro.");
            double nro2 = ingreso.nextDouble(); 
       
            // Consumiendo el método calcular desde la Clases CalculadoraServices
            nro1 = CalculadoraServices.calcular(nro1, operador, nro2);
            System.out.println("El resultado es:" + nro1);
            System.out.println("Deseas continuar: 1:SI, 2:NO");
            opcion = ingreso.nextInt();           
        } while (opcion == 1);
        System.out.println("Sali� del sistema");
        ingreso.close();
        System.exit(0);
    }

}


//System.out.println("No haz ingresado el operador correcto");
