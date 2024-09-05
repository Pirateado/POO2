package com.mycompany.figurageometrica;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica {
    private Punto centro;
    private int radio;
    
    public Circulo(String nombre, Punto centro, int radio) {
    super(nombre); 
    this.centro = centro;
    this.radio = radio;
    }
    public double calcularArea (){
        return Math.PI * Math.pow(radio, 2);
    }
    public boolean esRegular() {
        return true;
    }  
    public String toString(){
        return "Nombre: " + super.getNombre()+ ", Centro: " + centro + ", Radio: " + radio;
    }
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}

