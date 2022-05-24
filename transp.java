/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriza;


import javax.swing.JOptionPane;
/**
 *
 * @author 51923
 */
public class transp {
    private int matriz[][];
     private int fila;
     private int columna;
     private int valor;

     
    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
     
     
     
    
    /*------------------ INGRESO DE LA PRIMERA MATRIZ----------------*/
    public void Tam(){
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila de la  matriz"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresar columna de la  matriz"));
        this.matriz = new int[this.fila][this.columna];
    }
    
    public void AgregarMatriz(){
        for(int fila=0; fila<this.matriz.length; fila++){
            for(int columna=0; columna<this.matriz[fila].length; columna++){
                this.valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                this.matriz[fila][columna] = this.valor;
            }
        }
    }
    
     public void mostrarMatriz()
    {
        System.out.println("------- MATRIZ-------");
        for(int fila=0; fila < this.matriz.length; fila++)
        {
            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                
                System.out.printf("%d ", this.matriz[fila][columna]);
            }

            System.out.println();
        }
    }
     
     /*----------------------MATRIZ TRASNPUESTA-------------*/
     
     public void Transpuesta()
     {
         if(fila==columna){
            int aux;
            for(fila=0; fila<this.matriz.length; fila++){
                for(columna=0; columna<this.matriz[fila].length; columna++){
                    aux=this.matriz[fila][columna];
                    this.matriz[fila][columna]=this.matriz[columna][fila];
                    this.matriz[columna][fila]=aux;
                }
            }
        }else {
         System.out.println("Numero de filas y columnas no son del mismo tamaño");
         }
         
     }
     
     public void mostrarTransp()
     {
        System.out.println("------- MATRIZ-------");
        for(int fila=0; fila < this.matriz.length; fila++)
        {
            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                
                System.out.printf("%d ", this.matriz[columna][fila]);
            }

            System.out.println();
        }
    }
}
