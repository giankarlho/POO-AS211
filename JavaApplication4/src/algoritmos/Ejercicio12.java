package algoritmos;

import java.util.Scanner;



public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
        System.out.print("Ingrese el ancho");
        int nro1=consola.nextInt();
        System.out.print("Ingrese el largo");
        int nro2=consola.nextInt();consola.nextLine(); 
        if(nro1==nro2){
            System.out.print("Cuadrado con �rea: " + (nro1*nro2));
        }else{
            System.out.print("Rect�ngulo con �rea: " + (nro1*nro2));
        }

	}

}
