import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Aluno aluno1 = new Aluno();

    System.out.println("Digite o nome do aluno: ");
    aluno1.nome = scan.nextLine();

    System.out.println("Digite o RA do aluno: ");
    aluno1.RA = scan.nextInt();

    System.out.println("Digite o endereço do aluno: ");
    aluno1.endereco = scan.nextLine();

    System.out.printf("Digite o curso do aluno: ");
    aluno1.curso = scan.nextLine();

    scan.close();

    System.out.println("Nome do aluno: " + aluno1.nome);
    System.out.println("RA do aluno: " + aluno1.RA);
    System.out.println("Endereço do aluno: " + aluno1.endereco);
    System.out.println("Curso do aluno: " + aluno1.curso);

  }
}