/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

/**
 *
 * @author DANIEL
 */
public class Persona {
    private int edad;
    private int telefono;
    private String nombre;
    
    public Persona(int edad,int telefono,String nombre){
        this.edad=edad;
        this.telefono=telefono;
        this.nombre=nombre;
    }
   public String  getNombre() { 
       return nombre;
   }
   public int getEdad(){
       return edad;
   }
   public int getTelefono(){
       return telefono;
   }
}
