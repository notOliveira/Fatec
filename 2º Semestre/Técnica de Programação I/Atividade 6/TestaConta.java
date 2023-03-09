public class TestaConta {

public static void main(String[] args) {

    Conta conta1 = new Conta();
    Conta conta2 = new Conta();
    Conta conta3 = new Conta();

    /* Conta 1 */
    conta1.setNome("Fernando");
    conta1.setNum_conta(1234);
    conta1.setConta_conjunta("Nao");
    conta1.setSaldo(1500.00);
    conta1.setSexo("Masculino");
    conta1.setIdade(29);

    /* Conta 2 */
    conta2.setNome("Maria");
    conta2.setNum_conta(5312);
    conta2.setConta_conjunta("Sim");
    conta2.setSaldo(530.31);
    conta2.setSexo("Feminino");
    conta2.setIdade(45);

    /* Conta 3 */
    conta3.setNome("Joao");
    conta3.setNum_conta(9621);
    conta3.setConta_conjunta("Sim");
    conta3.setSaldo(4325.12);
    conta3.setSexo("Masculino");
    conta3.setIdade(54);

    /* Teste */
    conta1.getAll();
    conta2.getAll();
    conta3.getAll();
  }
}