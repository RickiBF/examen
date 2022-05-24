/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 51923
 */
public class Cliente {
    private String nombres;
    private String apepat;
    private String apemat;
    private int dni;

    public Cliente(String nombres, String apepat, String apemat, int dni) {
        this.nombres = nombres;
        this.apepat = apepat;
        this.apemat = apemat;
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApepat() {
        return apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public int getDni() {
        return dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
