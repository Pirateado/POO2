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
 private boolean checkRectangulo(Punto v1, Punto v2, Punto v3, Punto v4) {
        Punto auxVert = v1.calcularPuntoMasCercano(new Punto[]{v2, v3, v4});
        if (auxVert.equals(v2)) {
            return v1.getDistancia(v3) == v2.getDistancia(v4)
                && v1.getDistancia(v4) == v2.getDistancia(v3)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]{v3, v4}));
        } else if (auxVert.equals(v3)) {
            return v1.getDistancia(v2) == v3.getDistancia(v4)
                && v1.getDistancia(v4) == v3.getDistancia(v2)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]{v2, v4}));
        } else if (auxVert.equals(v4)) {
            return v1.getDistancia(v2) == v4.getDistancia(v3)
                && v1.getDistancia(v3) == v4.getDistancia(v2)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]{v2, v3}));
        } else {
            return false;
        }
 private boolean escalarProducto(Punto p1, Punto p2, Punto p3) {
        return (p3.getCoordenaY() - p1.getCoordenaY()) * (p2.getCoordenaY() - p1.getCoordenaY())
            + (p3.getCoordenaX() - p1.getCoordenaX()) * (p2.getCoordenaX() - p1.getCoordenaX()) == 0;
    }
}
