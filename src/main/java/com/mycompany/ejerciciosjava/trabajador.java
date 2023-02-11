/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;

/**
 *
 * @author DANIEL
 */
public class trabajador extends Persona {
    private int salario;
    
    public  trabajador(int edad,int telefono,String nombre)
    {
        super(edad,telefono,nombre);
        this.salario=salario;
    }
    public int getSalario(int salario){
        return salario;
    }
}
