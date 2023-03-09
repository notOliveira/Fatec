package Funcionário;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Funcionario func1 = new Funcionario();

    System.out.println("Digite o nome do funcionário: ");
    func1.nome = scan.nextLine();

    System.out.println("Digite o salário bruto do funcionário: ");
    func1.salarioBruto = scan.nextDouble();

    System.out.println("Digite o desconto do funcionário: ");
    func1.desconto = scan.nextDouble();

    // Mostrando dados

    System.out.printf("\nO salário líquido do funcionário %s é de %s reais.\nSeus descontos somam %s reais.\n", func1.nome, func1.salarioLiquido(), func1.desconto);

    System.out.println("\nEm quanto POR CENTO (%) funcionário deve ser aumentado: ");
    
    double value = scan.nextDouble();

    func1.aumentarSalario(value);

    System.out.printf("\nO salário líquido do funcionário %s é de %s reais.\nSeus descontos somam %s reais.\n", func1.nome, func1.salarioLiquido(), func1.desconto);

    scan.close();

  }
}