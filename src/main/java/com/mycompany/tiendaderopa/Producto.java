package com.mycompany.tiendaderopa;

public abstract class Producto {

    protected String referencia;
    protected Integer talla;
    protected String color;
    protected String marca;

    public Producto(String referencia, Integer talla, String color, String marca) {
        this.referencia = referencia;
        this.talla = talla;
        this.color = color;
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "referencia='" + referencia + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
