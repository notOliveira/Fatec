public class Quadrado extends Retangulo {

    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    @Override   
    public String toString() {
        String r = "";
        r = "\nLado: " + this.getLado1() + "\nCor: " + this.getCor() + "\n";
        return r;
    }

}