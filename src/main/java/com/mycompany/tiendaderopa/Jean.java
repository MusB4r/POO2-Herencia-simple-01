package com.mycompany.tiendaderopa;

public class Jean extends Producto {

    private String tipoCinturon;

    public Jean(String referencia, Integer talla, String color, String marca, String tipoCinturon) {
        super(referencia, talla, color, marca);
        this.tipoCinturon = tipoCinturon;
    }

    public String getTipoCinturon() {
        return tipoCinturon;
    }

    public void setTipoCinturon(String tipoCinturon) {
        this.tipoCinturon = tipoCinturon;
    }

    @Override
    public String toString() {
        return "Jean{" +
                "tipoCinturon='" + tipoCinturon + '\'' +
                ", referencia='" + referencia + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}