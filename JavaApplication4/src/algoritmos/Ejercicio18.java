package algoritmos;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ing. un nro.");
        int nro = ingreso.nextInt();
        int suma = 0;
        for (int m = 1; m <= nro; m++) {
            System.out.print(m + "\t");
            suma = suma + m;
        }
        System.out.println("La suma es:" + suma);
    }

}

