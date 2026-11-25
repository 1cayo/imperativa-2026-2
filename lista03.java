import java.util.Scanner;
import java.util.Locale;

public class lista03 {

    public static void main(String[] args) {
        System.out.println("=== LISTA 03 - ORDENACAO E RECURSAO ===");

        System.out.println("\n--- Demonstracao Questao 04 (Fatorial de 5) ---");
        System.out.println("fatorial(5) = " + fatorial(5));

        System.out.println("\n--- Demonstracao Questao 05 (Decimal para Binario de 13) ---");
        System.out.println("decimalParaBinario(13) = " + decimalParaBinario(13));

        System.out.println("\n--- Demonstracao Questao 06 (Potencia recursiva 2^5) ---");
        System.out.println("potencia(2, 5) = " + potencia(2, 5));

        System.out.println("\n--- Demonstracao Questao 07 (Verificar se e primo: 7 e 10) ---");
        System.out.println("ehPrimo(7) = " + ehPrimo(7));
        System.out.println("ehPrimo(10) = " + ehPrimo(10));

        System.out.println("\n--- Demonstracao Questao 08 (Soma de 1 ate 5) ---");
        System.out.println("somaAteN(5) = " + somaAteN(5));

        System.out.println("\n--- Demonstracao Questao 09 (Soma dos inversos ate 4) ---");
        System.out.println(String.format(Locale.US, "somaInversos(4) = %.4f", somaInversos(4)));

        System.out.println("\n--- Demonstracao Questao 10 (Potencia multiplicacao 3^4) ---");
        System.out.println("potenciaMultiplicacao(3, 4) = " + potenciaMultiplicacao(3, 4));

        System.out.println("\n--- Demonstracao Questao 11 (Tribonacci de 5) ---");
        mostrarERetornarTribonacci(5);

        System.out.println("\n--- Demonstracao Questao 12 (Pell de 5) ---");
        System.out.println("pell(5) = " + pell(5));
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static double calcularMediana(int[] vetor) {
        int n = vetor.length;
        if (n % 2 != 0) {
            return vetor[n / 2];
        } else {
            return (vetor[(n / 2) - 1] + vetor[n / 2]) / 2.0;
        }
    }

    public static void questao01() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        questao01(sc);
    }

    public static void questao01(Scanner sc) {
        sc.useLocale(Locale.US);
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            int n = sc.nextInt();
            int[] vendas = new int[n];

            for (int j = 0; j < n; j++) {
                vendas[j] = sc.nextInt();
            }

            insertionSort(vendas);

            System.out.print("Vendas ordenadas do produto " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(vendas[j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            double mediana = calcularMediana(vendas);
            System.out.println(String.format(Locale.US, "Mediana das vendas do produto %d: %.1f", i, mediana));
        }
    }

    public static void selectionSort(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menorIndice = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorIndice]) {
                    menorIndice = j;
                }
            }

            double temp = vetor[menorIndice];
            vetor[menorIndice] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void questao02() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        questao02(sc);
    }

    public static void questao02(Scanner sc) {
        sc.useLocale(Locale.US);
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) {
            int n = sc.nextInt();
            double[] precos = new double[n];

            for (int j = 0; j < n; j++) {
                precos[j] = sc.nextDouble();
            }

            selectionSort(precos);

            System.out.print("Precos ordenados da secao " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(String.format(Locale.US, "%.2f", precos[j]));
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            System.out.println(String.format(Locale.US, "Preco mais barato da secao %d: %.2f", i, precos[0]));
            System.out.println(String.format(Locale.US, "Preco mais caro da secao %d: %.2f", i, precos[n - 1]));
        }
    }

    public static void bubbleSortDecrescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void questao03() {
        Scanner sc = new Scanner(System.in);
        questao03(sc);
    }

    public static void questao03(Scanner sc) {
        int n = sc.nextInt();
        int[] avaliacoes = new int[n];

        for (int i = 0; i < n; i++) {
            avaliacoes[i] = sc.nextInt();
        }

        bubbleSortDecrescente(avaliacoes);

        System.out.print("Avaliacoes ordenadas: ");
        for (int i = 0; i < n; i++) {
            System.out.print(avaliacoes[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println("Melhor avaliacao: " + avaliacoes[0]);
        System.out.println("Pior avaliacao: " + avaliacoes[n - 1]);
    }

    public static long fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static String decimalParaBinario(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalParaBinario(n / 2) + (n % 2);
    }

    public static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * potencia(x, n - 1);
    }

    public static boolean ehPrimo(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return ehPrimo(n, divisor + 1);
    }

    public static boolean ehPrimo(int n) {
        return ehPrimo(n, 2);
    }

    public static int somaAteN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + somaAteN(n - 1);
    }

    public static double somaInversos(int n) {
        if (n <= 1) {
            return 1.0;
        }
        return (1.0 / n) + somaInversos(n - 1);
    }

    public static long potenciaMultiplicacao(int x, int k) {
        if (k == 0) {
            return 1;
        }
        return x * potenciaMultiplicacao(x, k - 1);
    }

    public static int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static int mostrarERetornarTribonacci(int n) {
        int resultado = tribonacci(n);
        System.out.println("Termo " + n + " de Tribonacci: " + resultado);
        return resultado;
    }

    public static int pell(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return 2 * pell(n - 1) + pell(n - 2);
    }
}
