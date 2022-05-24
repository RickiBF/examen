/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author 51923
 */
public class Farmacia {
    private String nombre;
    private Medicina medicina[];
    private int contador;

    public Farmacia(String nombre) {
        
        this.nombre = nombre;
        this.medicina=new Medicina[3];
        this.contador=0;
        
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarMedicina(Medicina  medicina){
        this.medicina[this.contador]=medicina;
        this.contador++;
    }
    
    public Medicina[] listarMedicina(){
        return this.medicina;
    }
    
}
