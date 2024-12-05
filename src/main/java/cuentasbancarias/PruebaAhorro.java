package cuentasbancarias;

public class PruebaAhorro {
    public static void main(String[] args) {
        // Crear una cuenta de ahorros con un saldo inicial de 30,000 y una tasa anual de 6%
        CuentaAhorros cuentaAhorros = new CuentaAhorros(30000, 6);

        // Mostrar el estado inicial de la cuenta
        System.out.println("Estado inicial de la cuenta:");
        cuentaAhorros.imprimir();

        // Realizar algunas operaciones
        System.out.println("\nRealizando operaciones:");
        cuentaAhorros.consignar(5000); // Consignar dinero
        cuentaAhorros.retirar(2000);   // Primer retiro
        cuentaAhorros.retirar(3000);   // Segundo retiro
        cuentaAhorros.retirar(1000);   // Tercer retiro
        cuentaAhorros.retirar(1500);   // Cuarto retiro
        cuentaAhorros.retirar(500);    // Quinto retiro (genera comisión extra)

        // Mostrar el estado después de las operaciones
        System.out.println("\nEstado después de las operaciones:");
        cuentaAhorros.imprimir();

        // Generar extracto mensual
        System.out.println("\nGenerando extracto mensual...");
        cuentaAhorros.generarExtractoMensual();

        // Mostrar el estado final de la cuenta
        System.out.println("\nEstado final de la cuenta:");
        cuentaAhorros.imprimir();
    }
}

