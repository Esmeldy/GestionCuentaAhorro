package modeloBancario;

/**
 *
 * @author esmeldy
 */
public abstract class Cuenta {
    protected int numeroDeCuenta;
    protected double saldo;
    protected Cliente titular;

    public Cuenta() {
        numeroDeCuenta=0;
        saldo=0;
        titular=null;
    }

    public Cuenta(int numeroDeCuenta, double saldo, Cliente titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
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

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void ingresar(int cantidad){
        saldo = saldo + cantidad;
    }
    
    public abstract double retirar(int cantidad);
    public abstract double actualizarSaldo();
    
    
    
    
}
