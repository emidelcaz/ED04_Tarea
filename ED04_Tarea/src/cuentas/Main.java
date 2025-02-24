/**
 * Clase principal que contiene el método main para ejecutar operaciones de prueba sobre cuentas bancarias.
 * 
 * Esta clase demuestra el uso de la clase CCuenta realizando operaciones
 * básicas como consultar el saldo, retirar e ingresar dinero.
 * 
 * @author juntacyl
 * @version 1.0
 * @see cuentas.CCuenta
 */
package cuentas;

public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        operativa_cuenta(2500);
    }
    
    /**
     * Realiza operaciones de prueba sobre una cuenta bancaria.
     * 
     * <p>Este método crea una cuenta bancaria, consulta su saldo inicial,
     * intenta realizar una retirada y posteriormente un ingreso, mostrando
     * los resultados por consola.</p>
     * 
     * @param cantidad Cantidad inicial para operar (aunque no se utiliza en el método)
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
        // Creación de una nueva cuenta con saldo inicial
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        try {
            // Intento de retirada de dinero
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            // Intento de ingreso de dinero
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}