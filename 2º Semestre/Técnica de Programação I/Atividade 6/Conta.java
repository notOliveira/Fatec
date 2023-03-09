public class Conta {
    private String nome_ct;
    private String sexo;
    private int idade;
    private double num_conta;
    private String conta_conjunta;
    private double saldo;

    /* Setters */

    public void setNome(String set_nome) {
        nome_ct = set_nome;
    }
    public void setSexo(String set_sexo) {
        sexo = set_sexo;
    }
    public void setIdade(int set_idade) {
        idade = set_idade;
    }
    public void setNum_conta(double set_num_conta) {
        num_conta = set_num_conta;
    }
    public void setConta_conjunta(String set_conta_conjunta) {
        conta_conjunta = set_conta_conjunta;
    }
    public void setSaldo(double set_saldo) {
        saldo = set_saldo;
    }

    /* Getters */
    public String getNome() {
        return nome_ct;
    }
    public String getSexo() {
        return sexo;
    }
    public int getIdade() {
        return idade;
    }
    public double getNum_conta() {
        return num_conta;
    }
    public String getConta_conjunta() {
        return conta_conjunta;
    }
    public double getSaldo() {
        return saldo;
    }
    
    /* Outros métodos */

    public void Saque(double valor){
        if (saldo > 0 && valor <= saldo){
            double x = saldo;
            saldo -= valor;
            System.out.printf("\nSaldo anterior: R$ %d \nNovo Saldo: R$ %d\n", x, saldo);
        }else{
            System.out.println("\nErro: Sem saldo para este saque.");
        }       
    }

    public void Saldo(){
        System.out.println("Nome: " + nome_ct);
        System.out.println("Nº Conta: " + num_conta);
        System.out.println("Conta conjunta: " + conta_conjunta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n");
    }

    public void Deposito(double valor){
        double x = saldo;
        saldo += valor;
        System.out.printf("Saldo anterior: R$ %d\nDepósito: R$ %d\nSaldo atual: R$ %d\n", x, valor, saldo);
    }

    /* Método para resgatar todos os atributos da classe */

    public void getAll(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nº conta: " + getNum_conta());
        System.out.println("Conta conjunta: " + getConta_conjunta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("\n");
    }
}
