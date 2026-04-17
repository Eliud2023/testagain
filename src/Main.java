import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int capturaMenu;
        boolean encendido = true;
        String nombreCliente;
        double saldo = 0;
        Scanner ingresaDatos = new Scanner(System.in);
        int pesos;

        while (encendido) {

            System.out.println("**** MENÚ BANCARIO ****");
            System.out.println("1. SALDO");
            System.out.println("2. DEPÓSITO");
            System.out.println("3. RETIRO");
            System.out.println("4. SALIR");
            System.out.print("Elige una opción (1-4): ");

            capturaMenu = ingresaDatos.nextInt();

            switch (capturaMenu) {

                case 1 -> {
                    System.out.println("Tu saldo es:$ " + saldo + "\n\n");
                }
                case 2 -> {

                    System.out.print("Ingresa la cantidad:$ ");
                    pesos = ingresaDatos.nextInt();
                    saldo += pesos;
                    System.out.println("Confirmo que ingresaste:$ " + pesos);
                }
                case 3 -> {
                    System.out.print("¿Cuánto retiras?:$ ");
                    pesos = ingresaDatos.nextInt();
                    saldo -= pesos;
                    System.out.println("Confirmo que retiraste:$ " + pesos);
                }
                case 4 -> {

                    System.out.println("Hasta luego Eliud");
                    encendido = false;
                }
                default -> System.out.println("Opción inválida (Elige del 1 al 4): ");

            }

        }

        //System.out.println("Jorge Eliud de Jesús Flores Hernández");

    }
}

