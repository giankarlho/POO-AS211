package algoritmos;

//Ejercicio9
import java.util.Calendar;
import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ing. tu año de nacimiento");
        int fnacimiento = ingreso.nextInt();
        
        Calendar c1 = Calendar.getInstance();   
        int annio = c1.get(Calendar.YEAR);
        if ((annio - fnacimiento) >= 18){
            System.out.println("Eres mayor de edad");
        } else{
            System.out.println("Todavía no eres mayor de edad");
        }            
//        String dia = Integer.toString(c1.get(Calendar.DAY_OF_MONTH));
//        String mes = Integer.toString(c1.get(Calendar.MONTH));
//        System.out.println("El dia " + dia);
//        System.out.println("El mes getInstance " + (Integer.parseInt(mes)+1));        
//        System.out.println("El año " + annio);  
    }
}

// http://lineadecodigo.com/java/obtener-fecha-actual-con-java/