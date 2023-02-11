/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

/**
 *
 * @author DANIEL
 */
public class Cliente extends Persona{
    private int  credito;
    
    public Cliente(int edad,int telefono,String nombre){
        super(edad,telefono,nombre);
        this.credito=credito;
    }
    public int getCredito(int credito){
        return credito;
    }
}
