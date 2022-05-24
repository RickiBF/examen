/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio;

/**
 *
 * @author 51923
 */
public class Ejercicio {

    public static void main(String[] args) {
        Farmacia farmacia=new Farmacia("farmacia1");
        System.out.println(farmacia.getNombre());
        
        farmacia.agregarMedicina(new Medicina("paracetamol",4));
        farmacia.agregarMedicina(new Medicina("sd",14));  
        farmacia.agregarMedicina(new Medicina("sff",8));
       
        
    }
   
}
