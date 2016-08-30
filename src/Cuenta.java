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
    private Propietario prop;

public static void main(String[] args){
    Propietario mag = new Propietario("Magdalena", "Sanchez", "Bog", "12345");
    Cuenta magdalena = new Cuenta(1012, "Magdalena S",0,1234, mag);
    magdalena.consignar(100000);
    magdalena.getProp().setTelefono("1234567");
    System.out.println(magdalena.getProp().getNombre());
    /*Cuenta joselito = new Cuenta(1013, "Joselito P", 500000,9876,);
    joselito.cambiarClave(5225);
    double salario=joselito.consultaSaldo();
    String propietario = joselito.propietario();*/
   // System.out.println(propietario +" tiene en su cuenta " + salario);
}    
    
    public Cuenta(int numero, String propietario, double salario, int clave, Propietario prop) {
        this.numero = numero;
        this.propietario = propietario;
        this.salario = salario;
        this.clave = clave;
        this.prop = prop;
    }

    public int getNumero() {
        return numero;
    }

    public String getPropietario() {
        return propietario;
    }

    public double getSalario() {
        return salario;
    }

    public int getClave() {
        return clave;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
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
