package calculadora;

import java.util.Scanner;

public class Calculadora2 {
    
    public static void main(String[] args) {
        System.out.println("Ing. el 1er. nro.");
        Scanner ingreso = new Scanner(System.in);
        int nro1 = ingreso.nextInt();        
        System.out.println("Ing. el 2do. nro.");
        int nro2 = ingreso.nextInt();
               
        double suma = nro1 + nro2;
        double resta = nro1 - nro2;
        double producto = nro1 * nro2;
        double division = nro1 / nro2;
        double residuo = nro1 % nro2;
        System.out.println("la suma es:" + suma);        
        System.out.println("la resta es:" + resta);        
        System.out.println("el producto es:" + producto);        
        System.out.println("la division es:" + division);        
        System.out.println("El residuo es:" + residuo);        
        
    }
   
}
