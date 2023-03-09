package Retângulo;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    Retangulo ret1 = new Retangulo();

    System.out.println("Digite a altura do retângulo: ");

    ret1.altura = scan.nextDouble();

    System.out.println("Digite a largura do retângulo: ");

    ret1.largura = scan.nextDouble();

    System.out.printf("\nA área do retângulo é de %s cm.\n", ret1.area());
    System.out.printf("\nO perímetro do retângulo é de %s cm.\n", ret1.perimetro());
    System.out.printf("\nA diagonal do retângulo é de %.5s cm.\n", ret1.diagonal());

    scan.close();

  }
}