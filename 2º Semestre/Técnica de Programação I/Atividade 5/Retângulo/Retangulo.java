package Retângulo;

import java.lang.Math;

public class Retangulo {
  double altura;
  double largura;
  
    public double area() {
      double area = altura * largura;
      return area;
    }

    public double perimetro() {
      double perimetro = 2 * (altura + largura);
      return perimetro;
    }

    public double diagonal() {
      double diagonal = Math.pow((Math.pow(altura,2) + Math.pow(largura,2)),0.5);
      return diagonal;
    }
  }