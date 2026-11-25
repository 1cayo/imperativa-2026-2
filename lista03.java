import java.util.Scanner;
import java.util.Locale;

public class lista03 {

    public static void main(String[] args) {
        // Metodo main para testes das questoes
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

    public static void questao01(Scanner sc) {
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

    public static void questao02(Scanner sc) {
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
}
