/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 51923
 */
public class ClienteControlador {
    private int contador; 
    private Cliente cliente[];

    public ClienteControlador(int contador) {
        this.contador = contador;
        this.cliente=new Cliente[2];
        this.contador=0;
    }
    
    
    public void agregarCliente(Cliente cliente){
        this.cliente[this.contador]=cliente;
        this.contador++;
    }
    
    public Cliente[] listarClientes(){
        return this.cliente; 
    }        
    
    public Cliente[] buscarCliente(){
        return this.cliente;
    }
    
    
}
