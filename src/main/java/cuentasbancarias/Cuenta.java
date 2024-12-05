package cuentasbancarias;

public class Cuenta {
    // Declaramos los Atributos protegidos
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    // Constructor de la Clase Cuenta
    public Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
    }

    // M�todo para consignar dinero
    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        } else {
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
        }
    }

    // M�todo para retirar dinero
    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    // M�todo para calcular el inter�s mensual
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
        System.out.println("Inter�s mensual aplicado: " + interesMensual);
        System.out.println("Nuevo saldo: " + saldo);
    }

    // M�todo para generar el extracto mensual
    public void generarExtractoMensual() {
    	calcularInteres();
        saldo -= comisionMensual;
        if (saldo < 0) {
            System.out.println("Advertencia: El saldo es negativo despu�s de aplicar la comisi�n.");
        }
    }

    // M�todo para imprimir los detalles de la cuenta
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("N�mero de consignaciones: " + numeroConsignaciones);
        System.out.println("N�mero de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisi�n mensual: " + comisionMensual);
    }

    // M�todo est�tico para comparar dos cuentas y devolver la de mayor saldo
    public static Cuenta cuentaMayor(Cuenta c1, Cuenta c2) {
        if (c1.saldo >= c2.saldo) {
        	return c1;
        } else if (c2.saldo > c1.saldo) {
            return c2;
        }
		return c2;
    }
}

