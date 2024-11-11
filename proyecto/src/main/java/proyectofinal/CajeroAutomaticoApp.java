package proyectofinal;
import java.util.Scanner;

public class CajeroAutomaticoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cuenta
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Elegir tipo de cuenta
        System.out.print("Seleccione tipo de cuenta (1: Ahorro, 2: Corriente): ");
        int tipoCuenta = scanner.nextInt();
        Cuenta cuenta = null;

        if (tipoCuenta == 1) {
            cuenta = new CuentaAhorro(numeroCuenta, saldoInicial);
        } else if (tipoCuenta == 2) {
            System.out.print("Ingrese el límite de crédito: ");
            double limiteCredito = scanner.nextDouble();
            cuenta = new CuentaCorriente(numeroCuenta, saldoInicial, limiteCredito);
        }

        scanner.nextLine();  // Clear buffer
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el DNI del usuario: ");
        String dni = scanner.nextLine();

        // Crear usuario
        Usuario usuario = new Usuario(nombre, dni, cuenta);

        // Crear cajero automático
        CajeroAutomatico cajero = new CajeroAutomatico(usuario);

        // Interacción con el cajero
        int opcion = 0;
        do {
            cajero.mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            cajero.procesarOperacion(opcion);
        } while (opcion != 4);
    }
}
