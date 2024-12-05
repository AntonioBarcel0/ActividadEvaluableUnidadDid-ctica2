package cuentasbancariasinterface;

public class PruebaCorriente {
	public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(8000, 5);

        System.out.println("Estado inicial de la cuenta corriente:");
        cuentaCorriente.imprimir();

        System.out.println("\nRealizando operaciones:");
        cuentaCorriente.consignar(2000);
        cuentaCorriente.retirar(7000);
        cuentaCorriente.retirar(4000);
        cuentaCorriente.consignar(1000);

        System.out.println("\nEstado después de las operaciones:");
        cuentaCorriente.imprimir();

        System.out.println("\nGenerando extracto mensual...");
        cuentaCorriente.generarExtractoMensual();

        System.out.println("\nEstado final de la cuenta:");
        cuentaCorriente.imprimir();
    }

}
