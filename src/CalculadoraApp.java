import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true){
            System.out.println("*** Aplicacion Calculadora ***");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <=4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto!");
                    break;
                } else {
                    System.out.println("Operacion erronea: " + operacion);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            } // fin try
        } // fin de while
    } // fin de main
    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Operqacion a realizar: ");
    } // fin funcion mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor de operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor de operando2: ");
        var operando2= Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion){
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es " + resultado);
            }
            case 3 -> { // Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es " + resultado);
            }
            case 4 -> { // Divicion
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es " + resultado);
            }
            default -> System.out.println("Solucion erronea" + operacion);
        }
        }
} // fin de clase
