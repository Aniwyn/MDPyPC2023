package TP1;

public class CuentaSueldo extends Cuenta {
    private int legajo;
    private String institucion;
    private String beneficios;
    private long CBU;
    private double tope;

    public CuentaSueldo() {
    }

    public CuentaSueldo(long dni, double saldo, double interes, long CBU, double tope) {
        super(dni, saldo, interes);
        if (CBU <= 999999999999999999L) {
            this.CBU = CBU;
        }
        this.tope = tope;
    }

    @Override
    public void retirar(double montoARetirar) {
        if (montoARetirar <= tope) {
            super.retirar(montoARetirar);
        }
    }

    public void transferir(double  monto, long CBU) {
        super.retirar(monto);
        System.out.println("Operación exitosa: Transferidos $" + monto + " a el CBU: " + CBU);
    }

    public void transferir(double  monto, String alias) {
        super.retirar(monto);
        System.out.println("Operación exitosa: Transferidos $" + monto + " a el Alias: " + alias);
    }
}
