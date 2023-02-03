/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 *
 * @author esmeldy
 */
public class CuentaCorriente extends Cuenta{
    protected final double interesFijo = 0.15;

    //Constructor con parámetros
    public CuentaCorriente(int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    
    
    @Override
    /**
     * Método que permite retirar dinero del saldo disponible
     * @param cantidad
     * return Get Resultado
     */
    public double retirar(int cantidad) {
        //Primero realizar un control sobre la cantidad ingresada
        double Resultado = 0; //Para almacenar el resultado en esta variable
        if (cantidad > 0) {
            //controlamos que no se introduzca un número negativo.
            //Y que el saldo no se quede en negativo
            Resultado = saldo;
            //Si el saldo se queda en negativo, se rectifica.
            if (super.saldo - cantidad < 0) {

                Resultado = saldo;

            } else {
                saldo = saldo - cantidad;
                Resultado = saldo;
            }
        } else {
            Resultado = 0;
        }
        return Resultado;
    }

    @Override
    /**
     * Método que permite ver el saldo disponible en la cuenta 
     * @return Get resto
     */
    public double actualizarSaldo() {
        double resto = 0;
        if (saldo < 0) {
            saldo = 0;
            resto = saldo;
        } else {
            //Redondeo para que no existan muchos decimales
            saldo = Math.round(saldo + saldo * interesFijo);
            resto = saldo;
        }
        return resto;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interesFijo=" + interesFijo + '}'+"Número de cuenta: "+super.numeroDeCuenta+""
                + "Titular: "+super.titular.getNombre();
    }
    
    

}
