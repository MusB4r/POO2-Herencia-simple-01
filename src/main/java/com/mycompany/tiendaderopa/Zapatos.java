package com.mycompany.tiendaderopa;

public class Zapatos extends Producto {

    private String tipo;

    public Zapatos(String referencia, Integer talla, String color, String marca, String tipo) {
        super(referencia, talla, color, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Zapatos{" +
                "tipo='" + tipo + '\'' +
                ", referencia='" + referencia + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}