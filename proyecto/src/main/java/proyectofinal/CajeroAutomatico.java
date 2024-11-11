package proyectofinal;
import java.util.Scanner;

class CajeroAutomatico {
    private Usuario usuario;

    public CajeroAutomatico(Usuario usuario) {
        this.usuario = usuario;
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");
    }

    public void procesarOperacion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                usuario.getCuenta().mostrarSaldo();
                break;
            case 2:
                System.out.print("Ingrese el monto a retirar: ");
                double retiro = scanner.nextDouble();
                usuario.getCuenta().realizarTransaccion(retiro);
                break;
            case 3:
                System.out.print("Ingrese el monto a depositar: ");
                double deposito = scanner.nextDouble();
                usuario.getCuenta().setSaldo(usuario.getCuenta().getSaldo() + deposito);
                System.out.println("Depósito exitoso: " + deposito);
                break;
            case 4:
                System.out.println("Gracias por usar el cajero automático.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
