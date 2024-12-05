package cuentasbancariasinterface;

public interface Cuenta {
	void consignar(float cantidad);  // Método para consignar dinero
    void retirar(float cantidad);   // Método para retirar dinero
    void generarExtractoMensual();   // Método para generar extracto mensual
    void imprimir();   // Método para imprimir el estado de la cuenta

}
