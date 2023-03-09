16

import java.util.Scanner;
//import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in);
    int A;
    int B;
    int C;

    /* Entradas de dados */

    System.out.println("Insira o valor do primeiro número: ");
    A = scan.nextInt();

    System.out.println("Insira o valor do segundo número: ");
    B = scan.nextInt();

    System.out.println("Insira o valor do terceiro número: ");
    C = scan.nextInt();

    scan.close();
    
    /* Contas e Final */

    /* Ordens possíveis:
     * A,B,C
     * A,C,B
     * B,C,A
     * B,A,C
     * C,A,B
     * C,B,A */
    if (A<B && B<C) {
        System.out.printf("Ordem crescente: %d, %d e %d", A,B,C);
    }
    else if (A < C && C < B) {
        System.out.printf("Ordem crescente: %d, %d e %d", A,C,B);
    }
    else if (B < C && C < A) {
        System.out.printf("Ordem crescente: %d, %d e %d", B,C,A);
    }
    else if (B < A && A < C) {
        System.out.printf("Ordem crescente: %d, %d e %d", B,A,C);
    }
    else if (C < A && A < B) {
        System.out.printf("Ordem crescente: %d, %d e %d", C,A,B);
    }
    else {
        System.out.printf("Ordem crescente: %d, %d e %d", C,B,A);
    };
	};
};

/* ---------- */

19

import java.util.Scanner;
//import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in);
    int A;
    int B;
    int C;
    int D;

    /* Entradas de dados */

    System.out.println("Insira o valor da primeira nota: ");
    A = scan.nextInt();

    System.out.println("Insira o valor da segunda nota: ");
    B = scan.nextInt();

    System.out.println("Insira o valor da terceira nota: ");
    C = scan.nextInt();

    System.out.println("Insira o valor da quarta nota: ");
    D = scan.nextInt();

    scan.close();
    
    /* Contas e Final */

    float media = (A+B+C+D)/4;

    if (media >= 7) {
        System.out.printf("Aluno com média %.1f\nSituação: Aprovado", media);
    }
    else {
        System.out.printf("Aluno com média %.1f\nSituação: Reprovado", media);
    }
	};
};

/* ---------- */

22

import java.util.Scanner;
//import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in);
    int A;
    int B;
    int C;
    // int D;

    /* Entradas de dados */

    System.out.println("Insira o valor do primeiro número: ");
    A = scan.nextInt();

    System.out.println("Insira o valor do segundo número: ");
    B = scan.nextInt();

    System.out.println("Insira o valor do terceiro número: ");
    C = scan.nextInt();

    scan.close();
    
    /* Contas e Final */

    if (A > B && A > C) {
        System.out.printf("Maior número: %d", A);
    }
    else if (B > A && B > C) {
        System.out.printf("Maior número: %d", B);
    }

    else {
        System.out.printf("Maior número: %d", C);
    }
	};
};

/* ---------- */

23

import java.util.Scanner;
// import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in);
    int A;
    int B;
    int C;
    int D;
    int E;
    int maior;
    int menor;

    menor = 2;
    maior = 3;
    /* Entradas de dados */

    System.out.println("Insira o valor do primeiro número: ");
    A = scan.nextInt();

    System.out.println("Insira o valor do segundo número: ");
    B = scan.nextInt();

    System.out.println("Insira o valor do terceiro número: ");
    C = scan.nextInt();

    System.out.println("Insira o valor do quarto número: ");
    D = scan.nextInt();

    System.out.println("Insira o valor do quinto número: ");
    E = scan.nextInt();

    scan.close();

    /* Contas e Final */

    int numeros[] = { A, B, C, D, E };

    maior = numeros[0];
    menor = numeros[0];
    
    for (int i = 1; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        System.out.println("valor do i: " + i);
        maior = numeros[i];
      };
      if (numeros[i] < menor) {
        System.out.println("valor do i: " + i);
        menor = numeros[i];
      };
    };

    System.out.printf("Maior número: %d\n Menor número: %d", maior, menor);

  };
};

/* ---------- */

24

import java.util.Scanner;
// import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    /* Declaração das variáveis e do objeto scanner */
    Scanner scan = new Scanner(System.in);
    int A;
    
    /* Entradas de dados */

    System.out.println("Digite um número: ");
    A = scan.nextInt();

    scan.close();

    /* Contas e Final */

    if (A % 2 == 0) {
      System.out.printf("O valor %d é par!", A);
    }
    else {
      System.out.printf("O valor %d é ímpar!", A);
    };

  };
};

/* ---------- */

27

    import java.util.Scanner;
    // import java.lang.Math;

    public class Main
    {
        public static void main(String[] args) {
        /* Declaração das variáveis e do objeto scanner */

        Scanner scan = new Scanner(System.in);

        int cod;
        int qtd;

        /* Entradas de dados */

        System.out.println("Qual produto vai levar?");
        cod = scan.nextInt();

        System.out.println("Quantos você vai levar?");
        qtd = scan.nextInt();

        scan.close();
        
        /* Contas e Final */

        if (cod-100 == 0 || cod-100 == 3) {
            System.out.printf("Vai custar R$ %.2f", qtd*1.2);
        }
        else if (cod-100 == 1 || cod-100 == 4 ) {
            System.out.printf("Vai custar R$ %.2f", qtd*1.3);
        }
        else if (cod-100 == 2) {
            System.out.printf("Vai custar R$ %.2f", qtd*1.5);
        }
        else if (cod-100 == 5) {
            System.out.printf("Vai custar R$ %d,00", qtd);
        }
        else {
            System.out.println("Este produto não existe!");
        };

        };

        };

/* ---------- */

31

    import java.util.Scanner;
    // import java.lang.Math;

    public class Main
    {
        public static void main(String[] args) {
        /* Declaração das variáveis e do objeto scanner */

        Scanner scan = new Scanner(System.in);

        int num;
        int backup;

        /* Entradas de dados */

        System.out.println("Digite um número: ");
        num = scan.nextInt();
        backup = num;
        int x = num-1;
        scan.close();
        
        /* Contas e Final */
        
        while (x > 0) {
            num = num * x;
            x--;
        };

        System.out.printf("Fatorial de %d = %d", backup, num);
        };

        };

/* ---------- */

33

    // import java.util.Scanner;
    // import java.lang.Math;

    public class Main
    {
        public static void main(String[] args) {
        /* Declaração das variáveis e do objeto scanner */

        // Scanner scan = new Scanner(System.in);

        int x = 1;
        int soma = 0;

        /* Entradas de dados */

        // scan.close();
        
        /* Contas e Final */

        while (x <= 100) {
            soma = soma + x;
            x++;
        };
        System.out.println("A soma dos 100 primeiros números é " + soma);
        }
        }

--