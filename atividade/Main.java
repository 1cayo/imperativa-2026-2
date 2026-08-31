package atividade;

import java.util.Scanner;

public class Main {
    public static void temperatura(double celsius) {
        System.out.println("Fahrenheit: " + ((celsius * 1.8) + 32));
        System.out.println("Kelvin: " + (celsius + 273.15));
        System.out.printf("Reamur: %.3f\n", (celsius * 0.8));
        System.out.printf("Rankine: %.3f", ((celsius * 1.8) + 491.67));
    }

    public static void alturaSexo(int sexo, double altura, Scanner sc) {

        int soma = 0, quantidade = 0;
        for (int i = 0; i < 11; i++) {
            sexo = sc.nextInt();
            altura = sc.nextDouble();

            if (sexo == 2) {
                quantidade = 1;
                soma += quantidade;
            }

        }

        System.out.println("Maior altura: ");
        System.out.println("Menor altura: ");
        System.out.println("Média da altura dos homens: ");
        System.out.println("Número de mulheres: " + soma);
    }

    public static double calcularMediaSalarial(int quant, Scanner sc) {
        double soma = 0;
        for (int i = 0; i < quant; i++) {
            double salario = sc.nextDouble();
            soma += salario;
        }
        return soma / quant;
    }

    public static int quantidadeAzulejos(double altParede, double largParede, double altAzulejo, double largAzulejo) {
        double areaParede = altParede * largParede;
        double areaAzulejo = altAzulejo * largAzulejo;
        return (int) Math.ceil(areaParede / areaAzulejo);
    }

    public static double volumeLata(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static double calcularPotenciaHp(double massa, double altura, double tempo) {
        double g = 9.81;
        double p = (massa * g * altura) / tempo;
        return p / 745.6999;
    }

    public static int calcularFatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static int calcularHoras(int totalSegundos) {
        return totalSegundos / 3600;
    }

    public static int calcularMinutos(int totalSegundos) {
        return (totalSegundos % 3600) / 60;
    }

    public static int calcularSegundosRestantes(int totalSegundos) {
        return totalSegundos % 60;
    }

    public static double calcularMediaIndividual(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaGeral(double somaMedias, int quantAlunos) {
        return somaMedias / quantAlunos;
    }

    public static double calcularTotalCaixa(Scanner sc) {
        double total = 0;
        double preco = sc.nextDouble();
        while (preco != 0) {
            total += preco;
            preco = sc.nextDouble();
        }
        return total;
    }

    public static double determinarDescontoCaixa(double total) {
        if (total > 500.0) {
            return total * 0.15;
        } else if (total > 200.0) {
            return total * 0.10;
        } else {
            return 0.0;
        }
    }

    public static double calcularValorFinalCaixa(double total, double desconto) {
        return total - desconto;
    }

    public static int maiorNumero10(int[] v) {
        int maior = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior;
    }

    public static int menorNumero10(int[] v) {
        int menor = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }

    public static int quantidadePares10(int[] v) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static double mediaNumeros10(int[] v) {
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma / v.length;
    }

    public static int contarValidos12(int tam) {
        return tam;
    }

    public static int somarNumeros12(int[] v, int tam) {
        int soma = 0;
        for (int i = 0; i < tam; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static double mediaNumeros12(int[] v, int tam) {
        if (tam == 0) return 0.0;
        return (double) somarNumeros12(v, tam) / tam;
    }

    public static int maiorNumero12(int[] v, int tam) {
        int maior = v[0];
        for (int i = 1; i < tam; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior;
    }

    public static int menorNumero12(int[] v, int tam) {
        int menor = v[0];
        for (int i = 1; i < tam; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }

    public static int quantidadePares12(int[] v, int tam) {
        int count = 0;
        for (int i = 0; i < tam; i++) {
            if (v[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int quantidadeImpares12(int[] v, int tam) {
        int count = 0;
        for (int i = 0; i < tam; i++) {
            if (v[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        // Questao 1:
        // temperatura(2.43);

        // Questao 2:
        // int sexo = sc.nextInt();
        // double altura = sc.nextDouble();
        // alturaSexo(sexo, altura, sc);

        // Questao 3:
        // int quant = sc.nextInt();
        // double mediaSalarial = calcularMediaSalarial(quant, sc);
        // System.out.printf("Média salarial: %.2f\n", mediaSalarial);

        // Questao 4:
        // double altParede = sc.nextDouble();
        // double largParede = sc.nextDouble();
        // double altAzulejo = sc.nextDouble();
        // double largAzulejo = sc.nextDouble();
        // int azulejos = quantidadeAzulejos(altParede, largParede, altAzulejo, largAzulejo);
        // System.out.println("Quantidade de azulejos necessários: " + azulejos);

        // Questao 5:
        // double raio = sc.nextDouble();
        // double alturaLata = sc.nextDouble();
        // double volume = volumeLata(raio, alturaLata);
        // System.out.printf("Volume da lata de óleo: %.2f m³\n", volume);

        // Questao 6:
        // double massa = sc.nextDouble();
        // double alturaMassa = sc.nextDouble();
        // double tempo = sc.nextDouble();
        // double hp = calcularPotenciaHp(massa, alturaMassa, tempo);
        // System.out.printf("Potência necessária: %.3f hp\n", hp);

        // Questao 7:
        // int numFatorial = sc.nextInt();
        // int fatorial = calcularFatorial(numFatorial);
        // System.out.println("Fatorial: " + fatorial);

        // Questao 8:
        // int totalSeg = sc.nextInt();
        // int h = calcularHoras(totalSeg);
        // int m = calcularMinutos(totalSeg);
        // int s = calcularSegundosRestantes(totalSeg);
        // System.out.println(h + " hora(s)");
        // System.out.println(m + " minuto(s)");
        // System.out.println(s + " segundo(s)");

        // Questao 9:
        // int quantAlunos = sc.nextInt();
        // double somaMedias = 0;
        // for (int i = 1; i <= quantAlunos; i++) {
        //     double n1 = sc.nextDouble();
        //     double n2 = sc.nextDouble();
        //     double n3 = sc.nextDouble();
        //     double media = calcularMediaIndividual(n1, n2, n3);
        //     somaMedias += media;
        //     String situacao = determinarSituacao(media);
        //     System.out.printf(java.util.Locale.US, "Aluno %d - Média: %.1f - %s\n", i, media, situacao);
        // }
        // double mediaGeral = calcularMediaGeral(somaMedias, quantAlunos);
        // System.out.printf(java.util.Locale.US, "Média geral da turma: %.1f\n", mediaGeral);

        // Questao 10:
        // double totalCompra = calcularTotalCaixa(sc);
        // double desconto = determinarDescontoCaixa(totalCompra);
        // double valorFinal = calcularValorFinalCaixa(totalCompra, desconto);
        // System.out.printf(java.util.Locale.US, "Total da compra: %.2f\n", totalCompra);
        // System.out.printf(java.util.Locale.US, "Desconto: %.2f\n", desconto);
        // System.out.printf(java.util.Locale.US, "Valor final: %.2f\n", valorFinal);

        // Questao 11:
        // int[] nums10 = new int[10];
        // for (int i = 0; i < 10; i++) {
        //     nums10[i] = sc.nextInt();
        // }
        // System.out.println("Maior número: " + maiorNumero10(nums10));
        // System.out.println("Menor número: " + menorNumero10(nums10));
        // System.out.println("Quantidade de pares: " + quantidadePares10(nums10));
        // System.out.printf(java.util.Locale.US, "Média: %.1f\n", mediaNumeros10(nums10));

        // Questao 12:
        // int[] nums12 = new int[1000];
        // int tam12 = 0;
        // int valor = sc.nextInt();
        // while (valor != -1) {
        //     nums12[tam12] = valor;
        //     tam12++;
        //     valor = sc.nextInt();
        // }
        // System.out.println("Quantidade de números: " + contarValidos12(tam12));
        // System.out.println("Soma: " + somarNumeros12(nums12, tam12));
        // System.out.printf(java.util.Locale.US, "Média: %.1f\n", mediaNumeros12(nums12, tam12));
        // System.out.println("Maior número: " + maiorNumero12(nums12, tam12));
        // System.out.println("Menor número: " + menorNumero12(nums12, tam12));
        // System.out.println("Quantidade de pares: " + quantidadePares12(nums12, tam12));
        // System.out.println("Quantidade de ímpares: " + quantidadeImpares12(nums12, tam12));
    }
}
