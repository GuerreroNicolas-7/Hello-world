import java.util.Scanner;

public class Main {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int calcularAreaCuadrado(int lado) {
        return lado * lado;
    }

    public static void imprimirBienvenida() {
        System.out.println("--- ¡Bienvenido al Programa de Ejemplos! ---");
    }

    public static void imprimirDespedida() {
        System.out.println("--- Gracias por usar el programa. ¡Adiós! ---");
    }

    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static String crearSaludo(String nombre) {
        return "¡Hola, " + nombre + "!";
    }

    public static String obtenerDatoCurioso() {
        return "Dato: Java es un lenguaje de programación muy popular.";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean seguirCorriendo = true;

        imprimirBienvenida();

        while (seguirCorriendo) {
            System.out.println("\n========= MENÚ =========");
            System.out.println("1. Probar 'sumar' (devuelve int)");
            System.out.println("2. Probar 'calcularAreaCuadrado' (devuelve int)");
            System.out.println("3. Probar 'imprimirDespedida' (devuelve void)");
            System.out.println("4. Probar 'imprimirBienvenida' (devuelve void)");
            System.out.println("5. Probar 'esPar' (devuelve boolean)");
            System.out.println("6. Probar 'esMayorDeEdad' (devuelve boolean)");
            System.out.println("7. Probar 'crearSaludo' (devuelve String)");
            System.out.println("8. Probar 'obtenerDatoCurioso' (devuelve String)");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Probando método INT 'sumar' ---");
                    int suma = sumar(40, 2);
                    System.out.println("Resultado de sumar(40, 2): " + suma);
                    break;
                case 2:
                    System.out.println("\n--- Probando método INT 'calcularAreaCuadrado' ---");
                    int area = calcularAreaCuadrado(5);
                    System.out.println("Resultado de calcularAreaCuadrado(5): " + area);
                    break;
                case 3:
                    System.out.println("\n--- Probando método VOID 'imprimirDespedida' ---");
                    imprimirDespedida();
                    break;
                case 4:
                    System.out.println("\n--- Probando método VOID 'imprimirBienvenida' ---");
                    imprimirBienvenida();
                    break;
                case 5:
                    System.out.println("\n--- Probando método BOOLEAN 'esPar' ---");
                    boolean resultadoPar = esPar(10);
                    System.out.println("Resultado de esPar(10): " + resultadoPar);
                    break;
                case 6:
                    System.out.println("\n--- Probando método BOOLEAN 'esMayorDeEdad' ---");
                    boolean resultadoEdad = esMayorDeEdad(21);
                    System.out.println("Resultado de esMayorDeEdad(21): " + resultadoEdad);
                    break;
                case 7:
                    System.out.println("\n--- Probando método STRING 'crearSaludo' ---");
                    String saludo = crearSaludo("Mundo");
                    System.out.println("Resultado de crearSaludo(\"Mundo\"): \"" + saludo + "\"");
                    break;
                case 8:
                    System.out.println("\n--- Probando método STRING 'obtenerDatoCurioso' ---");
                    String dato = obtenerDatoCurioso();
                    System.out.println("Resultado de obtenerDatoCurioso(): \"" + dato + "\"");
                    break;
                case 9:
                    seguirCorriendo = false;
                    System.out.println("\nSaliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, introduce un número del 1 al 9.");
                    break;
            }
        }
    }
}