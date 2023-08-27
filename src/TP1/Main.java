package TP1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Cuenta unaCuenta = new Cuenta(random.nextLong(30000000) + 20000000, //Numeros aleatorios entre  20.000.000 y 50.000.000
                random.nextDouble(30000 + 1) + 20000, //Numeros aleatorios entre  20.000 y 50.000
                random.nextDouble()
        );

        CuentaSueldo unaCuentaSueldo = new CuentaSueldo(random.nextLong(99999999),
                random.nextLong(30000 + 1) + 20000,
                random.nextDouble(),
                random.nextLong(899999999999999999L) + 100000000000000000L, //Numeros aleatorios entre 1000000000000000000 y 999999999999999999
                15000
        );

        CuentaSueldo dosCuentaSueldo = new CuentaSueldo(random.nextLong(99999999),
                random.nextLong(30000 + 1) + 20000,
                random.nextDouble(),
                random.nextLong(999999999999999999L),
                15000
        );

        unaCuenta.ingresar(random.nextDouble(20000 + 1) + 10000);
        unaCuenta.ingresar(random.nextDouble(20000 + 1) + 10000);

        unaCuenta.retirar(random.nextDouble(10000 + 1) + 15000);

        unaCuentaSueldo.retirar(random.nextDouble(10000 + 1) + 10000);

//        for (int i = 0; i < 20; i++) {
//            System.out.print((random.nextInt(20000 + 1) + 10000) + " ");
//        }


    }

//
//    public CuentaSueldo(long CBU, double tope) {
//        if (CBU <= 999999999999999999L) {
//            this.CBU = CBU;
//        }
//        this.tope = tope; //15000
//    }
}
