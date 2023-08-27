package TP1;


public class Cuenta {
    public static int id = 100000;
    private long numeroCuenta;
    private long dni;
    private double saldo;
    private double interes;

    public Cuenta() {

    }

    public Cuenta(long dni, double saldo, double interes) {
        id += 1;
        this.numeroCuenta = id;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public void actualizarSaldo() {
        saldo = (saldo * interes) / 365;
    }

    public void ingresar(double montoIngresado) {
        saldo += montoIngresado;
        System.out.println("Mont0 ingresado: $" + montoIngresado);
    }

    public void retirar(double montoARetirar) {
        if (saldo >= montoARetirar) {
            saldo -= montoARetirar;
            System.out.println("Saldo retirado: $" + montoARetirar);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarDatos() {
        System.out.println( "Datos de la cuenta\n" +
                "Numero de cuenta: " + numeroCuenta + "\n" +
                "DNI: " + dni + "\n" +
                "Saldo: $" + saldo + "\n" +
                "Interes anual: " + interes
        );
    }

}