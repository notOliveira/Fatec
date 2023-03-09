public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        aluno1.Aluno("João", "1234", 10, 8, 5);
        aluno2.Aluno("Maria", "4321", 5, 6, 10);

        System.out.println(aluno1.toString());
        System.out.printf("\nCalcular média: %.1f \n", aluno1.calcularMedia());
        System.out.printf("Calcular média final: %.1f\n", aluno1.calcularMediaFinal());

        System.out.println(aluno2.toString());
        System.out.printf("\nCalcular média: %.1f \n", aluno2.calcularMedia());
        System.out.printf("Calcular média final: %.1f\n", aluno2.calcularMediaFinal());
    }
}
