package proyectofinal;

public class Usuario {
    private String nombre;
    private String dni;
    private Cuenta cuenta;

    public Usuario(String nombre, String dni, Cuenta cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
