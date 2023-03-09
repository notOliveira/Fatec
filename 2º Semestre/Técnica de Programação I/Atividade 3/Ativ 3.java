46

public class main
{
	public static void main(String[] args) {

    /* Declaração das variáveis e do objeto scanner */

    int[] num;
    num = new int[10];
    
    /* Entradas de dados */

    for (int i = 0; i < 10; i++) {
        num[i] = i;
    };

    /* Contas e Final */

    for (int i = 0; i < 10; i++) {
        System.out.printf("Elemento no index %d = %d\n", i, num[i]);
    };
    
	};
};

/* ---------- */

48

public class main
{
	public static void main(String[] args) {

    /* Declaração das variáveis e do objeto scanner */

    int[] A = new int[10];
    int[] B = new int[10];
    
    /* Entradas de dados */

    for (int i = 0; i < 10; i++) {
        A[i] = i+1;
    };

    for (int i = 0; i < 10; i++) {
        B[i] = (A[i]*2);
    };

    /* Contas e Final */

    System.out.println("Array A\n\n");

    for (int i = 0; i < 10; i++) {
        System.out.printf("Elemento no index %d = %d\n", i, A[i]);
    };

    System.out.println("Array B\n\n");

    for (int i = 0; i < 10; i++) {
        System.out.printf("Elemento no index %d = %d\n", i, B[i]);
    };
    
	};
};

/* ---------- */

51

// import java.util.Scanner;

public class main
{
	public static void main(String[] args) {

    /* Declaração das variáveis e do objeto scanner */

    // Scanner scan = new Scanner(System.in);

    int[] med1 =  new int [5];
    int[] med2 =  new int [5];
    float[] medf = new float [5];

    /* Entradas de dados */

    for (int i = 0; i <= 4; i++) {
        System.out.printf("Digite a nota do aluno %d na primeira prova: ", i+1);
        med1[i] = scan.nextInt();
    };

    System.out.println("\n");

    for (int i = 0; i <= 4; i++) {
        System.out.printf("Digite a nota do aluno %d na segunda prova: ", i+1);
        med2[i] = scan.nextInt();
    };

    for (int i = 0; i <= 4; i++) {
        medf[i] = (med1[i]+med2[i])/2;
    };

    /* Contas e Final */

    System.out.println("\n\n");

    for (int i = 0; i <= 4; i++) {
        System.out.printf("Média do aluno %d = %.1f\n", i+1, medf[i]);
    };
    
	};
};

/* ---------- */

54

import java.util.Scanner;

public class main
{
	public static void main(String[] args) {

    /* Declaração das variáveis e do objeto scanner */

    Scanner scan = new Scanner(System.in);

    int[] A =  new int [5]; // 1,2,3,4,5
    int[] B =  new int [5]; // fatoriais
    int x, backup;
    

    /* Entradas de dados */

    for (int i = 0; i <= 4; i++) {
        System.out.println("Digite um valor: ");
        A[i] = scan.nextInt();
    };

    scan.close();


    /* Contas e Final */

    System.out.println("\n\n");

    for (int i = 0; i < 5; i++) {

        x = A[i]-1; // Salva o valor de A[i]-1 para iniciar a multiplicação dos fatoriais
        backup = A[i]; // Salva o valor de A[i]

        while (x > 0) { // Calcula o fatorial de A[i]
            A[i] = A[i] * x; 
            x--;
        };
        B[i] = A[i]; // Após o cálculo do fatorial, atribui o valor em B[i]
        A[i] = backup; // Restaura o valor de A[i], para que possa manter a originalidade
    };

    for (int i = 0; i < 5; i++) {
        System.out.printf("Index %d de A: %d\n", i, A[i]);
        System.out.printf("Index %d de B: %d\n\n", i, B[i]);
    }
    
	};
};

/* ---------- */