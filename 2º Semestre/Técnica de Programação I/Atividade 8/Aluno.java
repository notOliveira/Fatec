import java.util.Scanner;

public class Aluno {

  private String nome;
  private double nota1;
  private double nota2;
  private double nota3;

  public Aluno(String nomeAluno, double nota1tri, double nota2tri, double nota3tri) {
    this.nome = nomeAluno;
    this.nota1 = nota1tri;
    this.nota2 = nota2tri;
    this.nota3 = nota3tri;
  }

  public void Aprovado(){
    double nf = nota1 + nota2 + nota3;
    if (nf >= 60){
      System.out.println("\nAPROVADO\n");
    }else{
      System.out.println("\nREPROVADO");
      System.out.printf("FALTAM %.2f PONTOS\n", 60-nf);
    }
  }

  public void Aprovado(double notas1, double notas2, double notas3){
    double nf = notas1+notas2+notas3;
    if (nf >= 60){
      System.out.println("\nAPROVADO\n");
    }else{
      System.out.println("\nREPROVADO");
      System.out.printf("FALTAM %.2f PONTOS\n", 60-nf);
    }
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getNota1() {
    return this.nota1;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return this.nota2;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public double getNota3() {
    return this.nota3;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }

  public void getNotaFinal(){
    double nf = nota1 + nota2 + nota3;
    System.out.printf("\nNOTA FINAL = %.2f", nf);
    Aprovado();
  }

  public void getNotaFinal(double nota1t, double nota2t, double nota3t){
    double nf = nota1t + nota2t + nota3t;
    System.out.printf("\nNOTA FINAL = %.2f", nf);
    Aprovado(nota1t, nota2t, nota3t);
  }

}

