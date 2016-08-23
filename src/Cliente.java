/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cliente {
    private String nombre;
    
    public static void main(String[] args){
        java.util.Scanner flujo = new java.util.Scanner(System.in);
        System.out.println("nombre");
        String nombre = flujo.next();
        Cliente c = new Cliente(nombre);
        String dato = c.getNombre();
        System.out.println(dato);
        
    }
    
    public Cliente(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
}
