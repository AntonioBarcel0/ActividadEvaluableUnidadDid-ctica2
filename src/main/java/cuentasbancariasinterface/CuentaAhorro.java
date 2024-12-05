package cuentasbancariasinterface;

public class CuentaAhorro implements Cuenta {
//	Aquí Declaramos los atributos
	private float saldo;
    private float tasaAnual;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private float comisionMensual;
    private boolean activa;

    // Constructor de la clase CuentaAhorro
    public CuentaAhorro(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;
        this.comisionMensual = 0;
        this.activa = saldoInicial >= 10000; // Determinar si la cuenta está activa
    }
    
    public void consignar(float cantidad) {
        if (activa) {
            saldo += cantidad;
            numeroConsignaciones++;
            System.out.println("Consignación realizada. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede consignar. La cuenta está inactiva.");
        }
    }
    
    public void retirar(float cantidad) {
        if (activa && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("No se puede retirar. Saldo insuficiente o cuenta inactiva.");
        }
    }
    
    public void generarExtractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000; // Cobrar $1000 por cada retiro adicional
        }
        saldo -= comisionMensual;
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
        activa = saldo >= 10000; // Actualizar el estado de la cuenta
        numeroRetiros = 0;
        numeroConsignaciones = 0;
        comisionMensual = 0;
    }
    
    public void imprimir() {
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }

}
