package cuentasbancarias;

public class CuentaCorriente extends Cuenta {
	 private float sobregiro;
	// Constructor
	    public CuentaCorriente(float saldoInicial, float tasaAnual) {
	    	// Llamamos al constructor de la superclase
	        super(saldoInicial, tasaAnual); 
	        this.sobregiro = 0; // Inicializamos el sobregiro en cero
	    }
	 // Volvemos a declarar el método retirar
	    public void retirar(float cantidad) {
	        if (cantidad <= saldo) {
	            // Si hay suficiente saldo, simplemente deducimos del saldo
	            saldo -= cantidad;
	            numeroRetiros++;
	        } else {
	            // Si el saldo no es suficiente, usamos el sobregiro
	            float deficit = cantidad - saldo;
	            sobregiro += deficit; // Incrementa el sobregiro por el déficit
	            saldo = 0; // El saldo se queda en cero
	            numeroRetiros++;
	        }
	    }

	    public void consignar(float cantidad) {
	        // Llama al método heredado para actualizar el saldo
	        super.consignar(cantidad);
	        System.out.println("Consignación realizada. Saldo actual: " + saldo);
	    }
	    
//	   Volvemos a declarar el método generarExtractoMensual
	    public void generarExtractoMensual() {
	        saldo -= comisionMensual;

	        // Calculamos los intereses si el saldo es positivo
	        if (saldo > 0) {
	            float tasaMensual = tasaAnual / 12; // Calculo de la tasa mensual
	            float interesMensual = saldo * tasaMensual; // Calculo del Interés mensual
	            saldo += interesMensual; // Agregamos el interés mensual al saldo
	        }
	    }
	    
	 // Método imprimir por pantalla
	    public void imprimir() {
	        System.out.println("Saldo actual: " + saldo);
	        System.out.println("Sobregiro: " + sobregiro);
	        System.out.println("Comisión mensual: " + comisionMensual);
	        System.out.println("Número de consignaciones: " + numeroConsignaciones);
	        System.out.println("Número de retiros: " + numeroRetiros);
	    }
	    
}
