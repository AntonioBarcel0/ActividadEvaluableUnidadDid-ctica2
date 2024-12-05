package cuentasbancariasinterface;

public class PruebaAhorro {
	public static void main(String[] args) {
        CuentaAhorro cuentaAhorro = new CuentaAhorro(30000, 6);

        System.out.println("Estado inicial de la cuenta de ahorros:");
        cuentaAhorro.imprimir();

        System.out.println("\nRealizando operaciones:");
        cuentaAhorro.consignar(5000);
        cuentaAhorro.retirar(2000);
        cuentaAhorro.retirar(3000);
        cuentaAhorro.retirar(1000);
        cuentaAhorro.retirar(1500);
        cuentaAhorro.retirar(500);

        System.out.println("\nEstado después de las operaciones:");
        cuentaAhorro.imprimir();

        System.out.println("\nGenerando extracto mensual...");
        cuentaAhorro.generarExtractoMensual();

        System.out.println("\nEstado final de la cuenta:");
        cuentaAhorro.imprimir();
    }

}
