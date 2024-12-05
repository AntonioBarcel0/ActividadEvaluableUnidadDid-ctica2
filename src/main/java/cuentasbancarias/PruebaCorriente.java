package cuentasbancarias;

public class PruebaCorriente {
	 public static void main(String[] args) {
	        // Crear una cuenta corriente con un saldo inicial de 8,000 y una tasa anual de 5%
	        CuentaCorriente cuentaCorriente = new CuentaCorriente(8000, 5);

	        // Mostrar el estado inicial de la cuenta
	        System.out.println("Estado inicial de la cuenta:");
	        cuentaCorriente.imprimir();

	        // Realizar algunas operaciones
	        System.out.println("Realizando operaciones:");
	        cuentaCorriente.consignar(2000); // Consignar dinero
	        cuentaCorriente.retirar(7000);   // Retirar dinero dentro del saldo
	        cuentaCorriente.retirar(4000);   // Retirar excediendo el saldo (activo el sobregiro)
	        cuentaCorriente.consignar(1000); // Reducir el sobregiro

	        // Mostrar el estado después de las operaciones
	        System.out.println("\nEstado después de las operaciones:");
	        cuentaCorriente.imprimir();

	        // Generar extracto mensual
	        System.out.println("\nGenerando extracto mensual...");
	        cuentaCorriente.generarExtractoMensual();

	        // Mostrar el estado final de la cuenta
	        System.out.println("\nEstado final de la cuenta:");
	        cuentaCorriente.imprimir();
	    }

}
