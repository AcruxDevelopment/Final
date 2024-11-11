package proyectofinal;

class CuentaAhorro extends Cuenta {
    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void realizarTransaccion(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso: " + monto);
        } else {
            System.out.println("Saldo insuficiente para el retiro.");
        }
    }
}
