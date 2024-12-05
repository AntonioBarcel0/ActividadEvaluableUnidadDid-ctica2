package cuentasbancariasinterface;

public class CuentaCorriente implements Cuenta {
	private float saldo;
    private float tasaAnual;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private float comisionMensual;
    private float sobregiro;

    // Constructor
    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;
        this.comisionMensual = 0;
        this.sobregiro = 0;
    }

    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            float reducirSobregiro = Math.min(cantidad, sobregiro);
            sobregiro -= reducirSobregiro;
            cantidad -= reducirSobregiro;
        }
        saldo += cantidad;
        numeroConsignaciones++;
        System.out.println("Consignación realizada. Saldo actual: " + saldo);
    }
    
    public void retirar(float cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            float deficit = cantidad - saldo;
            sobregiro += deficit;
            saldo = 0;
        }
        numeroRetiros++;
    }
    
    public void generarExtractoMensual() {
        saldo -= comisionMensual;
        if (saldo > 0) {
            float tasaMensual = tasaAnual / 12;
            float interesMensual = saldo * tasaMensual;
            saldo += interesMensual;
        }
        numeroRetiros = 0;
        numeroConsignaciones = 0;
        comisionMensual = 0;
    }
    
    public void imprimir() {
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
    }
}
