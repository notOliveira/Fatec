abstract class Figura {
    private String cor;

	public Figura(String cor) {
		this.setCor(cor);
	}
    public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

}