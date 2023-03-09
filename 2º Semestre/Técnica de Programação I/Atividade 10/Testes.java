public class Testes {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(4, 3, "Rosa");
        System.out.println(r1.toString());
        System.out.println(r1.area());

        Quadrado q1 = new Quadrado(3, "Azul");
        System.out.println(q1.toString());
        System.out.println(q1.area());

        Triangulo t1 = new Triangulo(10, 5, "Vermelho");
        System.out.println(t1.toString());
        System.out.println(t1.area());

        Circulo c1 = new Circulo(4, "Amarelo");
        System.out.println(c1.toString());
        System.out.println(c1.area());

        q1.setCor('Azul');
        System.out.println(q1.toString());
        

    }


}
