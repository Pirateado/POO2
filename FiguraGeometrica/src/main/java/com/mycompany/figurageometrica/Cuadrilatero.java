/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica;

/**
 *
 * @author Usuario
 */
public abstract class Cuadrilatero extends FiguraGeometrica {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;

    public Cuadrilatero(String nombre,Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    public boolean esRegular() {
        return checkRectangulo();
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "Nombre: " + super.getNombre() + "vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + ", vertice4=" + vertice4 + '}';
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }

    public Punto getVertice4() {
        return vertice4;
    }

    public void setVertice4(Punto vertice4) {
        this.vertice4 = vertice4;
    }
    private boolean checkRectangulo() {
       return false;
    }
   private double escalarProducto(){
       return false;
    }
}
