/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 * 
 * Esta clase permite gestionar una cuenta bancaria con funcionalidades
 * para consultar el saldo, realizar ingresos y retiradas de dinero.
 * 
 * @author juntacyl
 * @version 1.0
 */
package cuentas;

public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número o identificador de la cuenta */
    private String cuenta;
    
    /** Saldo actual de la cuenta */
    private double saldo;
    
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     * Inicializa una cuenta sin datos.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     * Inicializa una cuenta con los datos proporcionados.
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número o identificador de la cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés de la cuenta (no se utiliza en el constructor)
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número o identificador de la cuenta.
     * 
     * @return Identificador de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número o identificador de la cuenta.
     * 
     * @param cuenta Nuevo identificador de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés Nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Consulta el estado o saldo actual de la cuenta.
     * 
     * @return Saldo actual de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
