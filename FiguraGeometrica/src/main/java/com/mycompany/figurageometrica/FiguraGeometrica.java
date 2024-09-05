/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurageometrica;

/**
 *
 * @author Usuario
 */
public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    public abstract boolean esRegular();
}
    
    

