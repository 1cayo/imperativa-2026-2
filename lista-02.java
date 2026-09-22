import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class lista_02 {

    public static void main(String[] args) {
    }

    // questao 1 vetores
    public static void vetoresQ1() {
        int[] A = {1, 0, 5, -2, -5, 7};
        int soma = A[0] + A[1] + A[5];
        System.out.println(soma);

        A[4] = 100;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    // questao 2 vetores
    public static void vetoresQ2() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        for (int i = 0; i < 6; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(vet[i]);
        }
    }

    // questao 3 vetores
    public static void vetoresQ3() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println(vet[i]);
            }
        }
    }

    // questao 4 vetores
    public static void vetoresQ4() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];
        for (int i = 0; i < 15; i++) {
            nomes[i] = sc.nextLine();
        }
        for (int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }

    // questao 5 vetores
    public static void vetoresQ5() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];
        for (int i = 0; i < 20; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (vet[i] % 2 != 0) {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 20; i += 2) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    // questao 6 vetores
    public static void vetoresQ6() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            soma += idades[i];
        }

        double media = (double) soma / 20;
        System.out.println(media);
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }

    // questao 7 vetores
    public static void vetoresQ7() {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[20];
        int[] v2 = new int[20];
        int[] v3 = new int[40];

        for (int i = 0; i < 20; i++) v1[i] = sc.nextInt();
        for (int i = 0; i < 20; i++) v2[i] = sc.nextInt();

        for (int i = 0; i < 20; i++) {
            v3[2 * i] = v1[i];
            v3[2 * i + 1] = v2[i];
        }

        for (int i = 0; i < 40; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();
    }

    // questao 8 vetores
    public static void vetoresQ8() {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];

        for (int i = 0; i < 10; i++) v1[i] = sc.nextInt();
        for (int i = 0; i < 10; i++) v2[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            v3[2 * i] = v1[i];
            v3[2 * i + 1] = v2[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();
    }

    // questao 9 vetores
    public static void vetoresQ9() {
        int[] vet = new int[100];
        int qtd = 0;
        int num = 1;

        while (qtd < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                vet[qtd] = num;
                qtd++;
            }
            num++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    // questao 10 vetores
    public static void vetoresQ10() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        for (int i = 0; i < 5; i++) x[i] = sc.nextInt();
        for (int i = 0; i < 5; i++) y[i] = sc.nextInt();

        // a
        for (int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        System.out.println();

        // b
        for (int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");
        System.out.println();

        // c
        for (int i = 0; i < 5; i++) {
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { achou = true; break; }
            }
            if (!achou) System.out.print(x[i] + " ");
        }
        System.out.println();

        // d
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) System.out.print(x[i] + " ");
            }
        }
        System.out.println();

        // e
        for (int i = 0; i < 5; i++) System.out.print(x[i] + " ");
        for (int i = 0; i < 5; i++) {
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) { achou = true; break; }
            }
            if (!achou) System.out.print(y[i] + " ");
        }
        System.out.println();
    }

    // questao 11 vetores
    public static void vetoresQ11() {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        double m = soma / 10;
        double somaVariancia = 0;

        for (int i = 0; i < 10; i++) {
            somaVariancia += Math.pow(v[i] - m, 2);
        }

        double desvioPadrao = Math.sqrt(somaVariancia / 10);
        System.out.println(desvioPadrao);
    }

    // questao 12 vetores
    public static void vetoresQ12() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int pos = 0;

        while (pos < 10) {
            int num = sc.nextInt();
            boolean existe = false;

            for (int i = 0; i < pos; i++) {
                if (v[i] == num) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                v[pos] = num;
                pos++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    // questao 13 vetores
    public static void vetoresQ13() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // questao 1 matrizes
    public static void matrizesQ1() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int cont = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
                if (m[i][j] > 10) cont++;
            }
        }

        System.out.println(cont);
    }

    // questao 2 matrizes
    public static void matrizesQ2() {
        int[][] m = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) m[i][j] = 1;
                else m[i][j] = 0;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    // questao 3 matrizes
    public static void matrizesQ3() {
        int[][] m = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = i * j;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    // questao 4 matrizes
    public static void matrizesQ4() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int maiorLinha = 0, maiorColuna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int maior = m[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            }
            System.out.println();
        }

        System.out.println(maiorLinha + " " + maiorColuna);
    }

    // questao 5 matrizes
    public static void matrizesQ5() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        boolean achou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == x) {
                    System.out.println(i + " " + j);
                    achou = true;
                    break;
                }
            }
            if (achou) break;
        }

        if (!achou) {
            System.out.println("não encontrado");
        }
    }

    // questao 6 matrizes
    public static void matrizesQ6() {
        int[][] A = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    A[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    A[i][j] = 3 * i * i - 1;
                } else {
                    A[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // questao 7 matrizes
    public static void matrizesQ7() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int somaAcima = 0, somaAbaixo = 0, somaPrincipal = 0, somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) somaAcima += m[i][j];
                if (i > j) somaAbaixo += m[i][j];
                if (i == j) somaPrincipal += m[i][j];
                if (i + j == 2) somaSecundaria += m[i][j];
            }
        }

        System.out.println(somaAcima);
        System.out.println(somaAbaixo);
        System.out.println(somaPrincipal);
        System.out.println(somaSecundaria);
    }

    // questao 8 matrizes
    public static void matrizesQ8() {
        Random rand = new Random();
        int[][] orig = new int[4][4];
        int[][] trans = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                orig[i][j] = rand.nextInt(20) + 1;
                if (i < j) {
                    trans[i][j] = 0;
                } else {
                    trans[i][j] = orig[i][j];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) System.out.print(orig[i][j] + "\t");
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) System.out.print(trans[i][j] + "\t");
            System.out.println();
        }
    }

    // questao 9 matrizes
    public static void matrizesQ9() {
        Random rand = new Random();
        int[][] cartela = new int[5][5];
        boolean[] sorteados = new boolean[100];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = rand.nextInt(100);
                } while (sorteados[num]);
                sorteados[num] = true;
                cartela[i][j] = num;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // questao 10 matrizes
    public static void matrizesQ10() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[] vSoma = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int somaCol = 0;
            for (int i = 0; i < 3; i++) {
                somaCol += m[i][j];
            }
            vSoma[j] = somaCol;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(vSoma[j]);
        }
    }

    // questao 11 matrizes
    public static void matrizesQ11() {
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[5][4];

        int maiorNotaFinal = -1;
        int matMaior = -1;
        int somaNotasFinais = 0;

        for (int i = 0; i < 5; i++) {
            alunos[i][0] = sc.nextInt();
            alunos[i][1] = sc.nextInt();
            alunos[i][2] = sc.nextInt();
            alunos[i][3] = alunos[i][1] + alunos[i][2];

            somaNotasFinais += alunos[i][3];

            if (alunos[i][3] > maiorNotaFinal) {
                maiorNotaFinal = alunos[i][3];
                matMaior = alunos[i][0];
            }
        }

        System.out.println(matMaior);
        System.out.println((double) somaNotasFinais / 5);
    }

    // questao 12 matrizes
    public static void matrizesQ12() {
        Scanner sc = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) m1[i][j] = sc.nextDouble();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) m2[i][j] = sc.nextDouble();

        char opcao = sc.next().charAt(0);

        if (opcao == 'a') {
            double[][] m3 = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'b') {
            double[][] m3 = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m2[i][j] - m1[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'c') {
            double k = sc.nextDouble();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] += k;
                    m2[i][j] += k;
                }
            }
        } else if (opcao == 'd') {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) System.out.print(m1[i][j] + " ");
                System.out.println();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) System.out.print(m2[i][j] + " ");
                System.out.println();
            }
        }
    }

    // questao 13 matrizes
    public static void matrizesQ13() {
        Scanner sc = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int k = 0; k < n; k++) {
                int f = sc.nextInt() - 1;
                int p = sc.nextInt() - 1;

                if (f >= 0 && f < 10 && p >= 0 && p < 10) {
                    if (teatro[f][p] == -1) {
                        teatro[f][p] = 1;
                    } else {
                        System.out.println("Poltrona ja foi vendida");
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }
    }

    // questao 14 matrizes
    public static void matrizesQ14() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            int faltas = 0;
            StringBuilder diasFaltados = new StringBuilder();

            for (int dia = 1; dia <= 30; dia++) {
                String presencia = sc.next();
                if (presencia.equalsIgnoreCase("F")) {
                    faltas++;
                    diasFaltados.append(dia).append(" ");
                }
            }

            if (faltas > 10) {
                System.out.println(nome + " - dias: " + diasFaltados.toString().trim());
            }
        }
    }
}
