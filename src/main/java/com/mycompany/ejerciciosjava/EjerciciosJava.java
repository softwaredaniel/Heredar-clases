/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosjava;

/**
 *
 * @author DANIEL
 */
public class EjerciciosJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cliente objeto=new Cliente(20,318,"Javier");
        System.out.println(objeto.getEdad());
        System.out.println(objeto.getTelefono());
        System.out.println(objeto.getNombre());
        System.out.println(objeto.getCredito(1000));
    }
}
