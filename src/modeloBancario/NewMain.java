/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.ListIterator;

/**
 *
 * @author esmeldy
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos clientes
        Cliente c1 = new Cliente(100,"Esmeldy","Calle la Oca","916565253");
        Cliente c2 = new Cliente(101,"Jorge","Calle de la locura","91888853");
        Cliente c3 = new Cliente(102,"Karina","Calle perla","666565253");
        //Cuentas corrientes
//        CuentaCorriente CC = new CuentaCorriente(100, 1500, c1);
//        CuentaCorriente C2 = new CuentaCorriente(100, 1500, c2);
//        CuentaCorriente C3 = new CuentaCorriente(100, 1500, c3);
        //Array para almacenar los objetos
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<CuentaAhorro> CuentaAhorro = new ArrayList<>();
//        ArrayList<CuentaCorriente> CuentaCorriente = new ArrayList<>();
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        System.out.println("Clientes");
              
        
        ListIterator it = clientes.listIterator();
        while (it.hasNext()) {
            Cliente CL = (Cliente)it.next();
            System.out.println("Clientes :"+CL.toString());
            
        }
               
        System.out.println("-----------------------------------------");
        System.out.println("Cuenta de Ahorro");
        
        CuentaAhorro CA = new CuentaAhorro(1.36,500,1,1500, c1);
        CuentaAhorro.add(CA);
        
        CuentaAhorro CA2 = new CuentaAhorro(1.36,500,2,1500, c2);
        CuentaAhorro.add(CA2);
        
        System.out.println(CA.toString());
        System.out.println("Retirar cantidad "+ CA.retirar(50));
        System.out.println("Retirar cantidad "+ CA.retirar(50));
        System.out.println("Retirar cantidad "+ CA.retirar(1300)+System.lineSeparator());
        
        System.out.println(CA2.toString() );
        
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        
        System.out.println("Cuentas actuales: ");
        ListIterator ca = CuentaAhorro.listIterator();
        while (ca.hasNext()) {
            CuentaAhorro Cuenta = (CuentaAhorro)ca.next();
            System.out.println("Cuenta: "+Cuenta.numeroDeCuenta+" Titular: "+Cuenta.titular.getNombre());
            
        }
              
    }
    
    
}
