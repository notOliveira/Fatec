public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

	public double area(){
        return (base*altura)/2;
    }

    public String toString() {
        String r = "";
        r = "\nBase: " + base + "\nAltura: " + altura + "\nCor: " + this.getCor() + "\n";
        return r;
    }
}