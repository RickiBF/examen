/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author 51923
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("daniel","vasquez","campos",123252);
        Cliente cliente2= new Cliente("carlos"," Gomez","villalobo",1456);
        
        System.out.println(cliente.getNombres());
        System.out.println(cliente.getApepat());
        System.out.println(cliente.getApemat());
        System.out.println(cliente.getDni());
        
        System.out.println(cliente2.getNombres());
        System.out.println(cliente2.getApepat());
        System.out.println(cliente2.getApemat());
        System.out.println(cliente2.getDni());
        
                  
       
      
       
    }
    
}
