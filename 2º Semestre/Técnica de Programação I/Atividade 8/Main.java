import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    String nomeAluno = scan.nextLine();

    System.out.println("Digite a primeira nota do aluno: ");
    double nota1trimestre = scan.nextDouble();

    System.out.println("Digite a segunda nota do aluno: ");
    double nota2trimestre = scan.nextDouble();
    
    System.out.println("Digite a terceira nota do aluno: ");
    double nota3trimestre = scan.nextDouble();

    Aluno aluno1 = new Aluno(nomeAluno, nota1trimestre, nota2trimestre, nota3trimestre);

    aluno1.getNotaFinal();
    
    // Teste de sobrecarga - Método com mesmo nome e faz a mesma coisa, mas diferente

    aluno1.getNotaFinal(17,20,15);

    scan.close();

  }
}