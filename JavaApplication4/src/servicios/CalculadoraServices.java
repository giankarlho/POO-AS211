package servicios;

public class CalculadoraServices {

    static double resultadoDob = 0.0;
    static String resultadoCad = "";

    public static Double calcular(double nro1, char operador, double nro2) {
        switch (operador) {
            case '+':
                resultadoDob = nro1 + nro2;
                break;
            case '-':
                resultadoDob = nro1 - nro2;
                break;
            case '*':
                resultadoDob = nro1 * nro2;
                break;
            case '/':
                resultadoDob = nro1 / nro2;
                break;
            case '%':
                resultadoDob = nro1 % nro2;
                break;
        }
        return resultadoDob;
    }

    public static int calcularFactorial(int nro) {
        int producto = 1;
        for (int i = nro; i >= 1; i--) {
            producto *= i;  // producto = producto * i
        }
        return producto;
//        for (int i = 1; i <= nro; i++) {
//            producto *= i;
//        }
    }

    public static String esPrimo(double nro){
        int cantDivisores = 0;
        for (int i=1; i<=nro; i++){
            if (nro%i == 0){
               cantDivisores +=1;   // cantDivisores = cantDivisores + 1 
            }
        }
        if (cantDivisores == 2){
            resultadoCad = "Es primo";
        } else {
            resultadoCad = "No es primo";
        }
        return resultadoCad;
    }
            
    public static void main(String[] args) {
        System.out.println(CalculadoraServices.calcularFactorial(5));

    }

}
