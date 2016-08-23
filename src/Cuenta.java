/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private String propietario;
    private double salario;
    private int clave;

public static void main(String[] args){
    Cuenta magdalena = new Cuenta(1012, "Magdalena S",0,1234);
    magdalena.consignar(100000);
    Cuenta joselito = new Cuenta(1013, "Joselito P", 500000,9876);
    joselito.cambiarClave(5225);
    double salario=joselito.consultaSaldo();
    String propietario = joselito.propietario();
    System.out.println(propietario +" tiene en su cuenta " + salario);
}    
    
    public Cuenta(int numero, String propietario, double salario, int clave) {
        this.numero = numero;
        this.propietario = propietario;
        this.salario = salario;
        this.clave = clave;
    }
    
    public void consignar(double valor){
        this.salario+=valor;
    }
    public void retirar(double valor){
        this.salario-=valor;
    }
    public void cambiarClave(int nuevaClave){
        this.clave = nuevaClave;
    }
    public double consultaSaldo(){
        return this.salario;
    }
    public String propietario(){
        return this.propietario;
}
}
