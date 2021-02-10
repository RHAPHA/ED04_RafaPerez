/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author RafaPerez
 */
public class Main {

    private static Float cant;

	public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = operativa_cuenta(cant);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	/**
	 * @return
	 * @deprecated Use {@link #operativa_cuenta(Float)} instead
	 */
	public static CCuenta operativa_cuenta() {
		return operativa_cuenta(new Float());
	}

	/**
	 * @param cantidad TODO
	 * @return
	 */
	public static CCuenta operativa_cuenta(Float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return cuenta1;
	}
}

