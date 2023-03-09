public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;

    public void Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }

    public double calcularMedia(){
        return (nota1+nota2)/2;
    }

    public double calcularMediaFinal(){
        if (calcularMedia() >= 6){
            return calcularMedia();
        }
        else{
            return ((calcularMedia() + notaReavaliacao)/2);
        }
    }

    public String toString(){
        return "\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2 + "\nNota da reavaliação: " + this.notaReavaliacao;
}   
}