/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica;

/**
 *
 * @author Usuario
 */
public class Punto {
    private double coordX;
    private double coordY;

    // Constructor
    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    // Métodos de acceso (getters)
    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    // Métodos de modificación (setters)
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    // Método que calcula la distancia entre dos puntos
    public double getDistancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.coordX - this.coordX, 2) + Math.pow(otro.coordY - this.coordY, 2));
    }

    // Nuevo método calcularPuntoMasCercano
    /**
     * Devuelve el punto más cercano de la matriz en el parámetro, o nulo si la matriz está vacía.
     */
    public Punto calcularPuntoMasCercano(Punto[] otrosPuntos) {
        Punto _masCercanoPunto = null;
        double minDistancia = Double.MAX_VALUE;
        double actualDistancia;

        for (int i = 0; i < otrosPuntos.length; i++) {
            actualDistancia = this.getDistancia(otrosPuntos[i]);
            if (actualDistancia <= minDistancia) {
                minDistancia = actualDistancia;
                _masCercanoPunto = otrosPuntos[i];
            }
        }

        return _masCercanoPunto;
    }

    // Sobrescribe el método toString para mostrar las coordenadas del punto
    @Override
    public String toString() {
        return "(" + coordX + ", " + coordY + ")";
    }

    // Método para verificar si dos puntos son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Punto punto = (Punto) obj;

        return Double.compare(punto.coordX, coordX) == 0 && Double.compare(punto.coordY, coordY) == 0;
    }
}
