package calculadora;

import java.util.Scanner;

public class Calculadora4 {

    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);

//        boolean opcion = false;     // si quiero continuar con las operaciones

        System.out.println("Ing. el 1er. nro.");
        double nro1 = ingreso.nextDouble();
        int opcion = 234654654;
        do {
            System.out.println("Ing. el operador");
            char operador = ingreso.next().charAt(0);

            System.out.println("Ing. el siguiente nro.");
            double nro2 = ingreso.nextDouble();

            double resultado = 0.0;

            switch (operador) {
                case '+':
                    resultado = nro1 + nro2;
                    break;
                case '-':
                    resultado = nro1 - nro2;
                    break;
                case '*':
                    resultado = nro1 * nro2;
                    break;
                case '/':
                    resultado = nro1 / nro2;
                    break;
                case '%':
                    resultado = nro1 % nro2;
                    break;
                default:
                    System.out.println("No haz ingresado el operador correcto");
            }
            nro1 = resultado;
            System.out.println("El resultado es:" + resultado);
            System.out.println("Deseas continuar: 1:SI, 2:NO");
            opcion = ingreso.nextInt();
//            if (opcion1==1){
//                opcion = true;
//            }else if(opcion1 == 2){
//                opcion = false;
//            }else{
//                opcion = false;
//            }            
        } while (opcion == 1);

    }

}
