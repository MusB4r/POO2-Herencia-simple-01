package com.mycompany.tiendaderopa;

public class Camisa extends Producto {

    private String tipoBotones;

    public Camisa(String referencia, Integer talla, String color, String marca, String tipoBotones) {
        super(referencia, talla, color, marca);
        this.tipoBotones = tipoBotones;
    }

    public String getTipoBotones() {
        return tipoBotones;
    }

    public void setTipoBotones(String tipoBotones) {
        this.tipoBotones = tipoBotones;
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "tipoBotones='" + tipoBotones + '\'' +
                ", referencia='" + referencia + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}