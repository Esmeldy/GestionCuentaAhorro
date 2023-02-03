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
public class CuentaAhorro extends Cuenta{
    protected double interesVariable;
    protected double saldoMinimo;

    public CuentaAhorro(double interesVariable, double saldoMinimo, int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
        
    }
 
    
    /**
     * Método para retirar dinero de la cuenta de ahorro
     * Pero no puede haber menos que el saldo mínimo
     * @param cantidad
     * @return  
     */
    @Override
    public double retirar(int cantidad) {
        /**
         * Controlamos que no se retire mas que el saldo mínimo que debe de haber
         *en la cuenta
         */
        if (saldo - cantidad < saldoMinimo){
            return saldo;
        }
        else {
            saldo = saldo - cantidad;
            return  saldo;
        }
    }

    @Override
    public double actualizarSaldo() {
        //Redondeo para que no salgan tantos decimales
        saldo = Math.round(saldo * interesVariable);
        return (saldo * 100 )/100d;
    }

    @Override
    public String toString() {
        return "Cuenta de ahorro..."
                + "Número de cuenta: "+super.numeroDeCuenta+" Titular: "+super.titular.getNombre()+""
                + " ID de Cliente: "+super.titular.getIdCliente();
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    
    
    
}
