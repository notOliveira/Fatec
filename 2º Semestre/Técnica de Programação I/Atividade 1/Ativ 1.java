3

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    int A;
    int B;
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    int multi = A*B;
    System.out.println("Multiplicação = " + multi);
	};
};

/* ---------- */

4

// Celsius para Fahrenheit

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    float F;
    float C;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma temperatura em °C: ");
    C = sc.nextInt();
    F = (9 * C + 160)/5;
    System.out.printf("%.2f em °F seria %.2f ", C, F);
	};
};

/* ---------- */

5

// Fahrenheit para Celsius

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    float F;
    float C;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma temperatura em °F: ");
    F = sc.nextInt();
    C = (F - 32) * ((float)5/(float)9);
    System.out.printf("%.2f em °C seria %.2f ", F, C);
	};
};

/* ---------- */

6

import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    double raio;
    double altura;
    double r;
    double vol;
    Scanner sc = new Scanner(System.in);
    
    /* Entradas de dados */
    System.out.println("Digite o raio da lata: ");
    r = sc.nextInt();
    
    System.out.println("Digite a altura da lata: ");
    altura = sc.nextInt();
    
    /* Contas Final */
    raio = Math.pow(r,2);
    vol = 3.14159 * raio * altura;
    System.out.printf("O volume da lata é %f", vol);
	};
};

/* ---------- */

7

import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner sc = new Scanner(System.in); 
    int anos;
    int meses;
    int dias;

    /* Entradas de dados */
    System.out.println("Anos: ");
    anos = sc.nextInt();

    System.out.println("Meses: ");
    meses = sc.nextInt();

    System.out.println("Dias: ");
    dias = sc.nextInt();
    
    /* Contas e Final */
    int ano_dia = anos * 365;
    int mes_dia = meses * 30;
    int total = ano_dia + mes_dia + dias;
    
    System.out.println("Quantidade de dias (desconsiderando bissextos): " + total);
	};
};

/* ---------- */

8

import java.util.Scanner;
import java.lang.Math;
// pi*r**2
public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner sc = new Scanner(System.in); 
    float raio;

    /* Entradas de dados */
    System.out.println("Raio: ");
    raio = sc.nextInt();
    
    /* Contas e Final */
    double area = 3.14159 * Math.pow(raio,2);
    
    System.out.println("Àrea da circunferência: " + area);
	};
};

/* ---------- */

9

import java.util.Scanner;
// import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner sc = new Scanner(System.in); 
    float valor;
    float taxa;
    int dias;
    float prestacao;
    
    /* Entradas de dados */
    System.out.println("Digite o valor: ");
    valor = sc.nextInt();

    System.out.println("Digite o valor da taxa: ");
    taxa = sc.nextFloat();

    System.out.println("Digite a quantidade de dias: ");
    dias = sc.nextInt();
    
    sc.close();
    
    taxa = taxa/100;
    
    /* Contas e Final */
    prestacao = valor + (valor * taxa * dias);
    
    System.out.println("Valor da prestação: " + prestacao);
	};
};

/* ---------- */

10

import java.util.Scanner;
// import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner sc = new Scanner(System.in); 
    float dolar;
    float real;
    float cotacao;
    
    /* Entradas de dados */
    System.out.println("Digite a cotação do dólar: ");
    cotacao = sc.nextFloat();

    System.out.println("Digite o valor em dólar: ");
    dolar = sc.nextFloat();
    
    sc.close();
    
    /* Contas e Final */
    real = dolar * cotacao;
    System.out.printf("Você tem R$ %.2f. ", real);
	};
};

/* ---------- */

11

import java.util.Scanner;
// import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in); 
  
    int A;
    int B;
    int C;
    
    /* Entradas de dados */

    System.out.printf("Insira o valor de A: ");
    A = scan.nextInt();
    
    System.out.printf("\nInsira o valor de B: ");
    B = scan.nextInt();
    
    /* Contas e Final */
    
    System.out.printf("\n\nValor inicial de A: %d\n", A);
    System.out.printf("Valor inicial de B: %d\n", B);
    
    C = A; // Salvando valor de A
    A = B; // Atribuindo o valor de B na variável A
    B = C; // Atribuindo o valor de A na variável B
    
    System.out.printf("\nValor trocado de A: %d\n", A);
    System.out.printf("Valor trocado de B: %d", B);
    
	};
};

/* ---------- */

12

import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in);
    
    /* Entradas de dados */

    System.out.printf("Insira o valor do número: ");
    double A = scan.nextDouble();

    scan.close();
    
    /* Contas e Final */
    
    double B = Math.pow(A,2);
    System.out.println("Potência: " + B);
    
	};
};