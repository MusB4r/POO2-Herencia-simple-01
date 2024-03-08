package com.mycompany.tiendaderopa;

public class Main {

  public static void main(String[] args) {
    Jean jean = new Jean("12345", 32, "Azul", "Levi's", "Cuero");
    System.out.println(jean);

    Camisa camisa = new Camisa("67890", 40, "Blanco", "Tommy Hilfiger", "Perla");
    System.out.println(camisa);

    Zapatos zapatos = new Zapatos("23456", 42, "Negro", "Nike", "Deportivo");
    System.out.println(zapatos);
  }
}

