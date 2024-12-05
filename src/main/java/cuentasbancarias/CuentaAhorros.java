package cuentasbancarias;

public class CuentaAhorros extends Cuenta {
//	atributo para detrminar si la cuenta est� activa
	protected boolean activa;
    protected float cantidad;
	
//	M�todo para verificar el estado de la cuenta 
	private void verificarEstado() {
		activa = saldo >= 10000;
	}
	
//	Constructor de la clase CuentaAhorros
	public CuentaAhorros(float saldoInicial, float tasa_anual) {
		//Usamos super para llamar a los constructores de la clase Cuenta
		super(saldoInicial, tasa_anual);
        verificarEstado();
	}

//	M�todo para consignar 
	public void consignar() {
		if (activa) {
			super.consignar(cantidad);
			verificarEstado();
		}else {
			System.out.println("La cuenta est� inactiva. No se pueden realizar consignaciones.");
		}
}
	
//	Metodo para consignar
	public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad); // Llama al m�todo heredado
            verificarEstado(); // Actualiza el estado despu�s del retiro
        } else {
            System.out.println("La cuenta est� inactiva. No se pueden realizar retiros.");
        }
    }

//	 M�todo para generar un extracto mensual
	 public void generarExtractoMensual() {
	        int retirosAdicionales = numeroRetiros > 4 ? numeroRetiros - 4 : 0;
	        comisionMensual += retirosAdicionales * 1000; // Agrega la comisi�n adicional
	        super.generarExtractoMensual(); // Llama al m�todo heredado
	        verificarEstado(); // Verifica si la cuenta sigue activa al final del extracto
	    }

// M�todo para Imprimir por pantalla
	 public void imprimir() {
	        System.out.println("=== Detalles de la cuenta de ahorros ===");
	        System.out.println("Saldo actual: " + saldo);
	        System.out.println("Comisi�n mensual: " + comisionMensual);
	        System.out.println("Total de transacciones (consignaciones + retiros): " +
	                (numeroConsignaciones + numeroRetiros));
	        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
	    }
}
