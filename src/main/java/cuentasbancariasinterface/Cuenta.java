package cuentasbancariasinterface;

public interface Cuenta {
	void consignar(float cantidad);  // M�todo para consignar dinero
    void retirar(float cantidad);   // M�todo para retirar dinero
    void generarExtractoMensual();   // M�todo para generar extracto mensual
    void imprimir();   // M�todo para imprimir el estado de la cuenta

}
