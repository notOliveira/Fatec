package Funcionário;

public class Funcionario {
  String nome;
  double salarioBruto;
  double desconto;
  
    public double salarioLiquido() {

      double salarioLiq;
      salarioLiq = salarioBruto - desconto;

      return salarioLiq;
    }

    public void aumentarSalario(double porcentagem) {
      System.out.printf("\nSalário bruto original é de %s reais.", salarioBruto);

      salarioBruto = salarioBruto * (1+(porcentagem/100));

      System.out.printf("\nSalário bruto com aumento de %s por cento é de %s reais.\n", porcentagem, salarioBruto);
       
    }
  }