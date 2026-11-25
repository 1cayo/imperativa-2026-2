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

    // ==========================================
    // PARTE I — ORDENAÇÃO
    // ==========================================

    // --- Questão 01: Vendas anuais — Insertion Sort e mediana ---

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // Desloca os elementos maiores que a chave para a direita
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
            // Se o tamanho for impar, pega o elemento do meio
            return vetor[n / 2];
        } else {
            // Se for par, faz a media dos dois elementos centrais
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
        int p = sc.nextInt(); // quantidade de produtos

        for (int i = 1; i <= p; i++) {
            int n = sc.nextInt(); // anos registrados
            int[] vendas = new int[n];

            for (int j = 0; j < n; j++) {
                vendas[j] = sc.nextInt();
            }

            // Ordena usando insertion sort
            insertionSort(vendas);

            // Exibe as vendas ordenadas
            System.out.print("Vendas ordenadas do produto " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(vendas[j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Calcula e exibe a mediana
            double mediana = calcularMediana(vendas);
            System.out.println(String.format(Locale.US, "Mediana das vendas do produto %d: %.1f", i, mediana));
        }
    }

    // --- Questão 02: Preços de livros — Selection Sort ---

    public static void selectionSort(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menorIndice = i;

            // Busca o menor elemento no restante do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorIndice]) {
                    menorIndice = j;
                }
            }

            // Troca a posicao atual com o menor encontrado
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
        int s = sc.nextInt(); // numero de secoes

        for (int i = 1; i <= s; i++) {
            int n = sc.nextInt(); // quantidade de livros
            double[] precos = new double[n];

            for (int j = 0; j < n; j++) {
                precos[j] = sc.nextDouble();
            }

            // Ordena usando selection sort
            selectionSort(precos);

            // Imprime os precos ordenados
            System.out.print("Precos ordenados da secao " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(String.format(Locale.US, "%.2f", precos[j]));
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // O mais barato esta no indice 0 e o mais caro no indice n - 1
            System.out.println(String.format(Locale.US, "Preco mais barato da secao %d: %.2f", i, precos[0]));
            System.out.println(String.format(Locale.US, "Preco mais caro da secao %d: %.2f", i, precos[n - 1]));
        }
    }

    // --- Questão 03: Avaliações de filmes — Bubble Sort ---

    public static void bubbleSortDecrescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                // Para ordem decrescente, troca se o atual for menor que o proximo
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
        int n = sc.nextInt(); // quantidade de avaliacoes
        int[] avaliacoes = new int[n];

        for (int i = 0; i < n; i++) {
            avaliacoes[i] = sc.nextInt();
        }

        // Ordena em ordem decrescente
        bubbleSortDecrescente(avaliacoes);

        // Exibe avaliacoes ordenadas
        System.out.print("Avaliacoes ordenadas: ");
        for (int i = 0; i < n; i++) {
            System.out.print(avaliacoes[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Como esta decrescente: o primeiro e o melhor, o ultimo e o pior
        System.out.println("Melhor avaliacao: " + avaliacoes[0]);
        System.out.println("Pior avaliacao: " + avaliacoes[n - 1]);
    }

    // ==========================================
    // PARTE II — RECURSIVIDADE (Parte 1)
    // ==========================================

    // --- Questão 04: Fatorial ---
    public static long fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    // --- Questão 05: Converter decimal para binário ---
    public static String decimalParaBinario(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalParaBinario(n / 2) + (n % 2);
    }

    // --- Questão 06: Potência recursiva ---
    public static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * potencia(x, n - 1);
    }

    // --- Questão 07: Verificar se um número é primo ---
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

    // Sobrecarga para facilitar chamada iniciando com divisor 2
    public static boolean ehPrimo(int n) {
        return ehPrimo(n, 2);
    }

    // --- Questão 08: Soma dos primeiros N inteiros ---
    public static int somaAteN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + somaAteN(n - 1);
    }

    // --- Questão 09: Soma dos inversos de 1 a N ---
    public static double somaInversos(int n) {
        if (n <= 1) {
            return 1.0;
        }
        return (1.0 / n) + somaInversos(n - 1);
    }

    // --- Questão 10: Potência usando apenas multiplicação ---
    public static long potenciaMultiplicacao(int x, int k) {
        if (k == 0) {
            return 1;
        }
        return x * potenciaMultiplicacao(x, k - 1);
    }

    // --- Questão 11: Sequência de Tribonacci ---
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

    // --- Questão 12: Sequência de Pell ---
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
