/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**la clase CCuenta va a generar objetos CCuenta con 4 atributos: nombre, cuenta, saldo, tipoInteres
 * cuenta con los getters y setters correspondientes, con un constructor y con dos métodos adicionales
 * un método ingresar que va a añadir dinero a la cuenta y un metodo retirar que se usa para modificar
 * 
 * @author RafaPerez
 */
public class CCuenta {
   

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public String getNombre() {
		return nombre;
	}
    
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}


	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    public double estado()
    {
        return getSaldo();
    }
/**El metodo ingresar lleva un parámetro cantidad, y se usar para sumar cantidad al saldo de la cuenta
 * en caso de que cantidad sea negativo saltará un mensaje de advertencia*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

/**El metodo retirar lleva un parámetro cantidad, y se usar para restar cantidad al saldo de la cuenta
     * en caso de que cantidad sea positivo o de que cantidad sea mayor que el saldo saltará un mensaje de advertencia */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
    

