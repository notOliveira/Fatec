public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.setRaio(raio);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

	public double area(){
        return (3.14*this.raio*this.raio);
    }

    public double diametro(){
        return (raio*2);
    }

    public String toString() {
        String r = "";
        r = "\nRaio: " + raio + "\nCor: " + this.getCor() + "\n";
        return r;
    }
}