package proyectofinal;

public class CuentaCorriente extends Cuenta {
    private double limiteCredito;

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteCredito) {
        super(numeroCuenta, saldo);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void realizarTransaccion(double monto) {
        if (monto <= getSaldo() + limiteCredito) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso: " + monto);
        } else {
            System.out.println("Saldo insuficiente, incluyendo límite de crédito.");
        }
    }
}
