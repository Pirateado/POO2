/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends Cuadrilatero {
    public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre, vertice1, vertice2, vertice3, vertice4);

        if (!esRegular()) {
            System.out.println("El cuadrilátero no es regular.");
        }
    }

    @Override
    public double calcularArea() {
        double base = vertice1.getDistancia(vertice2);
        double altura = vertice1.getDistancia(vertice4);

        return base * altura;
    }

    @Override
    public boolean esRegular() {

        return checkRectangulo(vertice1, vertice2, vertice3, vertice4);
    }

    @Override
    public String toString() {
        return "Rectángulo: " + getNombre() + " con vértices en " +
               vertice1 + ", " + vertice2 + ", " + vertice3 + ", " + vertice4 + 
               " y un área de: " + calcularArea();
    }
}
